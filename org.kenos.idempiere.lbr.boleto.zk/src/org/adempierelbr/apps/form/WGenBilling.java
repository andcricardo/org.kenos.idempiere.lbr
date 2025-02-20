/******************************************************************************
 * Copyright (C) 2011 Kenos Assessoria e Consultoria de Sistemas Ltda         *
 * Copyright (C) 2011 Ricardo Santana                                         *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.adempierelbr.apps.form;

import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;

import org.adempiere.pipo2.Zipper;
import org.adempiere.webui.ClientInfo;
import org.adempiere.webui.LayoutUtils;
import org.adempiere.webui.component.Button;
import org.adempiere.webui.component.Checkbox;
import org.adempiere.webui.component.Column;
import org.adempiere.webui.component.Columns;
import org.adempiere.webui.component.ConfirmPanel;
import org.adempiere.webui.component.Grid;
import org.adempiere.webui.component.GridFactory;
import org.adempiere.webui.component.Label;
import org.adempiere.webui.component.Listbox;
import org.adempiere.webui.component.ListboxFactory;
import org.adempiere.webui.component.Panel;
import org.adempiere.webui.component.Row;
import org.adempiere.webui.component.Rows;
import org.adempiere.webui.component.WListbox;
import org.adempiere.webui.editor.WDateEditor;
import org.adempiere.webui.event.WTableModelEvent;
import org.adempiere.webui.event.WTableModelListener;
import org.adempiere.webui.panel.ADForm;
import org.adempiere.webui.panel.CustomForm;
import org.adempiere.webui.panel.IFormController;
import org.adempiere.webui.session.SessionManager;
import org.adempiere.webui.window.FDialog;
import org.adempierelbr.util.TextUtil;
import org.apache.commons.io.FileUtils;
import org.compiere.model.MBankAccount;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.zkoss.util.media.AMedia;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Borderlayout;
import org.zkoss.zul.Center;
import org.zkoss.zul.Filedownload;
import org.zkoss.zul.North;
import org.zkoss.zul.Separator;
import org.zkoss.zul.South;

/**
 *  	Generate Bills for ZK interface
 *			
 *  @author Ricardo Santana (Kenos, www.kenos.com.br)
 *  @version $Id: WGenBilling.java, v1.0 2012/03/27 6:13:04 PM, ralexsander Exp $
 */
public class WGenBilling extends GenBilling
	implements IFormController, EventListener<Event>, WTableModelListener
{	
	private CustomForm form = new CustomForm();

	private Panel mainPanel = new Panel();
	private Borderlayout mainLayout = new Borderlayout();
	private Panel parameterPanel = new Panel();
	private Label labelBankAccount = new Label();
	private Listbox fieldBankAccount = ListboxFactory.newDropdownListbox();
	private Grid parameterLayout = GridFactory.newGridLayout();
	private Checkbox isPrinted = new Checkbox();
	private Label labelBPartner = new Label();
	private Listbox fieldBPartner = ListboxFactory.newDropdownListbox();
	private Label dataStatus = new Label();
	private WListbox miniTable = ListboxFactory.newDataTable();
	private ConfirmPanel commandPanel = new ConfirmPanel(true, false, false, false, false, false, false);
	private Button bCancel = commandPanel.getButton(ConfirmPanel.A_CANCEL);
	private Button bGenerate = commandPanel.createButton(ConfirmPanel.A_EXPORT);
	private Button bRefresh = commandPanel.createButton(ConfirmPanel.A_REFRESH);
	private Label labelDate = new Label();
	private WDateEditor fieldDate = new WDateEditor();
	private Label labelDateTo = new Label();
	private WDateEditor fieldDateTo = new WDateEditor();
	private Label labelDtype = new Label();
	private Listbox fieldDtype = ListboxFactory.newDropdownListbox();
	private Panel southPanel;
	@SuppressWarnings("unused")
	private ProcessInfo m_pi;
	private boolean m_isLock;
	private int noOfColumn;
	
	/**
	 *	Initialize Panel
	 */
	public WGenBilling()
	{
		try
		{
			zkInit();
			dynInit();
			
			loadBankInfo();
			southPanel.appendChild(new Separator());
			southPanel.appendChild(commandPanel);
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "", e);
		}
		
		ClientInfo.onClientInfo(form, this::onClientInfo);
	}	//	init

	/**
	 *  Static Init
	 *  @throws Exception
	 */
	private void zkInit() throws Exception
	{
		setupColumns();
		//
		form.appendChild(mainPanel);
		mainPanel.appendChild(mainLayout);
		mainPanel.setStyle("width: 100%; height: 100%; padding: 0; margin: 0");
		mainLayout.setHeight("100%");
		mainLayout.setWidth("99%");
		parameterPanel.appendChild(parameterLayout);
		//
		labelBankAccount.setText(Msg.translate(Env.getCtx(), "C_BankAccount_ID"));
		fieldBankAccount.addActionListener(this);
		labelBPartner.setText(Msg.translate(Env.getCtx(), "C_BPartner_ID"));
		fieldBPartner.addActionListener(this);
		bRefresh.addActionListener(this);
		labelDate.setText(Msg.translate(Env.getCtx(), "PayDate"));
		labelDateTo.setText(Msg.translate(Env.getCtx(), "To"));
		labelDtype.setText(Msg.translate(Env.getCtx(), "C_DocType_ID"));
		fieldDtype.addActionListener(this);
		//
		isPrinted.setText(Msg.translate(Env.getCtx(), "IsPrinted"));
		isPrinted.addActionListener(this);
		dataStatus.setText(" ");
		dataStatus.setPre(true);
		//
		bGenerate.addActionListener(this);
		bCancel.addActionListener(this);
		//
		North north = new North();
		north.setBorder ("none");
		mainLayout.appendChild(north);
		north.appendChild(parameterPanel);
		north.setCollapsible(true);
		north.setSplittable(true);
		LayoutUtils.addSlideSclass(north);
		
		Rows rows = parameterLayout.newRows();
		Row row = rows.newRow();
		row.appendChild(labelBankAccount.rightAlign());
		row.appendChild(fieldBankAccount);
		
		row = rows.newRow();
		row.appendChild(labelBPartner.rightAlign());
		row.appendChild(fieldBPartner);
		row.appendChild(labelDate.rightAlign());
		row.appendChild(fieldDate.getComponent());
		
		row = rows.newRow();
		row.appendChild(labelDtype.rightAlign());
		row.appendChild(fieldDtype);
		row.appendChild(labelDateTo.rightAlign());
		row.appendChild(fieldDateTo.getComponent());
		row.appendChild(isPrinted);
		row.appendChild(bRefresh);

		South south = new South();
		south.setBorder ("none");
		mainLayout.appendChild(south);
		southPanel = new Panel();
		southPanel.appendChild(dataStatus);
		south.appendChild(southPanel);
		Center center = new Center();
		mainLayout.appendChild(center);
		center.appendChild(miniTable);
		//
		commandPanel.addButton(bGenerate);
		commandPanel.getButton(ConfirmPanel.A_OK).setVisible(false);
		
		if (noOfColumn < 6)
			LayoutUtils.compactTo(parameterLayout, noOfColumn);
		else
			LayoutUtils.expandTo(parameterLayout, noOfColumn, true);
	}   //  jbInit

	protected void setupColumns() {
		noOfColumn = 6;
		if (ClientInfo.maxWidth(ClientInfo.MEDIUM_WIDTH-1))
		{
			if (ClientInfo.maxWidth(ClientInfo.SMALL_WIDTH-1))
				noOfColumn = 2;
			else
				noOfColumn = 4;
		}
		if (noOfColumn == 2)
		{
			Columns columns = new Columns();
			Column column = new Column();
			column.setWidth("35%");
			columns.appendChild(column);
			column = new Column();
			column.setWidth("65%");
			columns.appendChild(column);
			parameterLayout.appendChild(columns);
		}
	}

	/**
	 *  Dynamic Init.
	 *  - Load Bank Info
	 *  - Load BPartner
	 *  - Init Table
	 */
	private void dynInit()
	{
		ArrayList<KeyNamePair> bankAccountData = getBankAccountData();
		for (KeyNamePair bi : bankAccountData)
			fieldBankAccount.appendItem(bi.toString(), bi);

		if (fieldBankAccount.getItemCount() == 0)
			FDialog.error(m_WindowNo, form, "VPaySelectNoBank");
		else
			fieldBankAccount.setSelectedIndex(0);
		
		ArrayList<KeyNamePair> bpartnerData = getBPartnerData();
		for(KeyNamePair pp : bpartnerData)
			fieldBPartner.appendItem(pp.getName(), pp);
		fieldBPartner.setSelectedIndex(0);

		ArrayList<KeyNamePair> docTypeData = getDocTypeData();
		for(KeyNamePair pp : docTypeData)
			fieldDtype.appendItem(pp.getName(), pp);
		
		prepareTable(miniTable);
		
		miniTable.getModel().addTableModelListener(this);
		//
		fieldDate.setMandatory(true);
		fieldDate.setValue(new Timestamp(System.currentTimeMillis()));
		fieldDateTo.setMandatory(true);
		fieldDateTo.setValue(new Timestamp(System.currentTimeMillis()));
	}   //  dynInit

	/**
	 *  Load Bank Info - Load Info from Bank Account and valid Documents (PaymentRule)
	 */
	private void loadBankInfo()
	{		
		KeyNamePair bi = (KeyNamePair)fieldBankAccount.getSelectedItem().getValue();
		if (bi == null)
			return;
	}   //  loadBankInfo

	/**
	 *  Query and create TableInfo
	 */
	private void loadTableInfo()
	{
		Timestamp dateFrom = (Timestamp)fieldDate.getValue();
		Timestamp dateTo = (Timestamp)fieldDateTo.getValue();
		
		miniTable.setColorCompare(dateFrom);
		log.config("From " + dateFrom + " To " + dateTo);
		
		KeyNamePair bi = (KeyNamePair)fieldBankAccount.getSelectedItem().getValue();
		
		KeyNamePair bpartner = (KeyNamePair)fieldBPartner.getSelectedItem().getValue();
		KeyNamePair docType = (KeyNamePair)fieldDtype.getSelectedItem().getValue();

		MBankAccount bank = new MBankAccount(Env.getCtx(), bi.getKey(), null);
		int org = bank.getAD_Org_ID();
		
		loadTableInfo (org, bi, bpartner, docType, dateFrom, dateTo, isPrinted.isSelected(), miniTable);
		
		calculateSelection();
		
		if (ClientInfo.maxHeight(ClientInfo.SMALL_HEIGHT-1))
		{
			Component comp = parameterPanel.getParent();
			if (comp instanceof North)
				((North)comp).setOpen(false);
		}
	}   //  loadTableInfo

	/**
	 * 	Dispose
	 */
	public void dispose()
	{
		SessionManager.getAppDesktop().closeActiveWindow();
	}	//	dispose

	
	/**************************************************************************
	 *  ActionListener
	 *  @param e event
	 */
	public void onEvent (Event e)
	{
		//  Update Bank Info
		if (e.getTarget() == fieldBankAccount)
			loadBankInfo();

		//  Generate PaySelection
		else if (e.getTarget() == bGenerate)
		{
			exportBilling();
			loadTableInfo();
		}

		else if (e.getTarget() == bCancel)
			dispose();

		//  Update Open Invoices
		else if (e.getTarget() == fieldBankAccount || e.getTarget() == fieldBPartner || e.getTarget() == bRefresh || e.getTarget() == fieldDtype || e.getTarget() == isPrinted)
			loadTableInfo();

	}   //  actionPerformed

	/**
	 *  Table Model Listener
	 *  @param e event
	 */
	public void tableChanged(WTableModelEvent e)
	{
		if (e.getColumn() == 0)
			calculateSelection();
	}   //  valueChanged

	/**
	 *  Calculate selected rows.
	 *  - add up selected rows
	 */
	public void calculateSelection()
	{
		dataStatus.setText(calculateSelection(miniTable));
		//
		bGenerate.setEnabled(m_noSelected != 0);
	}   //  calculateSelection
	
	/**
	 *  Print Billing
	 */
	private void exportBilling ()
	{
		if (miniTable.getRowCount() == 0)
			return;
		miniTable.setSelectedIndices(new int[]{0});
		calculateSelection();
		if (m_noSelected == 0)
			return;
		
		String filePath = System.getProperty("java.io.tmpdir") + File.separator + "Boletos_" + TextUtil.timeToString(new Date(), "yyyyMMdd");
		String fileName = filePath + ".zip";
		File folder = new File (filePath);
		if (!folder.exists())
			folder.mkdirs();
		//
		deleteDir(folder);
		
		exportBilling (miniTable, filePath, (KeyNamePair) fieldBankAccount.getSelectedItem().getValue());
		
		File zipFile = new File(fileName);
		if (zipFile.exists())
			zipFile.delete();
		//
		Zipper.zipFolder (folder, zipFile, "**");
		
		try
		{
			AMedia media = new AMedia(zipFile.getName(), null, null, FileUtils.readFileToByteArray(zipFile));
			Filedownload.save(media);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			FDialog.error(m_WindowNo, form, "SaveError", "Erro ao exportar o arquivo");
		}
	}   //  exportBilling
	
	/**
	 *  Lock User Interface
	 *  Called from the Worker before processing
	 */
	public void lockUI (ProcessInfo pi)
	{
		if (m_isLock) return;
		m_isLock = true;
		Clients.showBusy(null);
	}   //  lockUI

	/**
	 *  Unlock User Interface.
	 *  Called from the Worker when processing is done
	 */
	public void unlockUI (ProcessInfo pi)
	{
		if (!m_isLock) return;
		m_isLock = false;
		m_pi = pi;
		Clients.clearBusy();

		this.dispose();
	}	//	unlockUI

	/**
	 * 	Execute ASync
	 */
	public void executeASync (ProcessInfo pi) 
	{
	}	//	executeASync

	/**
	 * 	Check if User Interface is Unlocked
	 */
	public boolean isUILocked () 
	{
		return m_isLock;
	}	//	isUILocked

	/**
	 * 	Return AD Form for ZK
	 */
	public ADForm getForm () 
	{
		return form;
	}	//	getForm

	protected void onClientInfo()
	{
		if (ClientInfo.isMobile() && form.getPage() != null) 
		{
			if (noOfColumn > 0 && parameterLayout.getRows() != null)
			{
				int t = 6;
				if (ClientInfo.maxWidth(ClientInfo.MEDIUM_WIDTH-1))
				{
					if (ClientInfo.maxWidth(ClientInfo.SMALL_WIDTH-1))
						t = 2;
					else
						t = 4;
				}
				if (t != noOfColumn)
				{
					parameterLayout.getRows().detach();
					if (parameterLayout.getColumns() != null)
						parameterLayout.getColumns().detach();
					try
					{
						zkInit();
						form.invalidate();
					}
					catch (Exception e1) {}
				}
			}
		}
	}
}   //  WGenBilling
