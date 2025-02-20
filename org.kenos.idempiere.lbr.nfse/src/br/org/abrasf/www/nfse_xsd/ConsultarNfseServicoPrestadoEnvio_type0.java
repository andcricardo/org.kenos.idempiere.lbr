/**
 * ConsultarNfseServicoPrestadoEnvio_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */
package br.org.abrasf.www.nfse_xsd;


/**
 *  ConsultarNfseServicoPrestadoEnvio_type0 bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ConsultarNfseServicoPrestadoEnvio_type0 implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ConsultarNfseServicoPrestadoEnvio_type0
       Namespace URI = http://www.abrasf.org.br/nfse.xsd
       Namespace Prefix =
     */

    /**
     * field for Prestador
     */
    protected br.org.abrasf.www.nfse_xsd.TcIdentificacaoPrestador localPrestador;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrestadorTracker = false;

    /**
     * field for NumeroNfse
     */
    protected java.math.BigInteger localNumeroNfse;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroNfseTracker = false;

    /**
     * field for PeriodoEmissao
     */
    protected br.org.abrasf.www.nfse_xsd.PeriodoEmissao_type0 localPeriodoEmissao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPeriodoEmissaoTracker = false;

    /**
     * field for PeriodoCompetencia
     */
    protected br.org.abrasf.www.nfse_xsd.PeriodoCompetencia_type0 localPeriodoCompetencia;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPeriodoCompetenciaTracker = false;

    /**
     * field for Tomador
     */
    protected br.org.abrasf.www.nfse_xsd.TcIdentificacaoTomador localTomador;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTomadorTracker = false;

    /**
     * field for Intermediario
     */
    protected br.org.abrasf.www.nfse_xsd.TcIdentificacaoIntermediario localIntermediario;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIntermediarioTracker = false;

    /**
     * field for Pagina
     */
    protected int localPagina;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPaginaTracker = false;

    public boolean isPrestadorSpecified() {
        return localPrestadorTracker;
    }

    /**
     * Auto generated getter method
     * @return br.org.abrasf.www.nfse_xsd.TcIdentificacaoPrestador
     */
    public br.org.abrasf.www.nfse_xsd.TcIdentificacaoPrestador getPrestador() {
        return localPrestador;
    }

    /**
     * Auto generated setter method
     * @param param Prestador
     */
    public void setPrestador(
        br.org.abrasf.www.nfse_xsd.TcIdentificacaoPrestador param) {
        localPrestadorTracker = param != null;

        this.localPrestador = param;
    }

    public boolean isNumeroNfseSpecified() {
        return localNumeroNfseTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigInteger
     */
    public java.math.BigInteger getNumeroNfse() {
        return localNumeroNfse;
    }

    /**
     * Auto generated setter method
     * @param param NumeroNfse
     */
    public void setNumeroNfse(java.math.BigInteger param) {
        localNumeroNfseTracker = param != null;

        this.localNumeroNfse = param;
    }

    public boolean isPeriodoEmissaoSpecified() {
        return localPeriodoEmissaoTracker;
    }

    /**
     * Auto generated getter method
     * @return br.org.abrasf.www.nfse_xsd.PeriodoEmissao_type0
     */
    public br.org.abrasf.www.nfse_xsd.PeriodoEmissao_type0 getPeriodoEmissao() {
        return localPeriodoEmissao;
    }

    /**
     * Auto generated setter method
     * @param param PeriodoEmissao
     */
    public void setPeriodoEmissao(
        br.org.abrasf.www.nfse_xsd.PeriodoEmissao_type0 param) {
        localPeriodoEmissaoTracker = param != null;

        this.localPeriodoEmissao = param;
    }

    public boolean isPeriodoCompetenciaSpecified() {
        return localPeriodoCompetenciaTracker;
    }

    /**
     * Auto generated getter method
     * @return br.org.abrasf.www.nfse_xsd.PeriodoCompetencia_type0
     */
    public br.org.abrasf.www.nfse_xsd.PeriodoCompetencia_type0 getPeriodoCompetencia() {
        return localPeriodoCompetencia;
    }

    /**
     * Auto generated setter method
     * @param param PeriodoCompetencia
     */
    public void setPeriodoCompetencia(
        br.org.abrasf.www.nfse_xsd.PeriodoCompetencia_type0 param) {
        localPeriodoCompetenciaTracker = param != null;

        this.localPeriodoCompetencia = param;
    }

    public boolean isTomadorSpecified() {
        return localTomadorTracker;
    }

    /**
     * Auto generated getter method
     * @return br.org.abrasf.www.nfse_xsd.TcIdentificacaoTomador
     */
    public br.org.abrasf.www.nfse_xsd.TcIdentificacaoTomador getTomador() {
        return localTomador;
    }

    /**
     * Auto generated setter method
     * @param param Tomador
     */
    public void setTomador(
        br.org.abrasf.www.nfse_xsd.TcIdentificacaoTomador param) {
        localTomadorTracker = param != null;

        this.localTomador = param;
    }

    public boolean isIntermediarioSpecified() {
        return localIntermediarioTracker;
    }

    /**
     * Auto generated getter method
     * @return br.org.abrasf.www.nfse_xsd.TcIdentificacaoIntermediario
     */
    public br.org.abrasf.www.nfse_xsd.TcIdentificacaoIntermediario getIntermediario() {
        return localIntermediario;
    }

    /**
     * Auto generated setter method
     * @param param Intermediario
     */
    public void setIntermediario(
        br.org.abrasf.www.nfse_xsd.TcIdentificacaoIntermediario param) {
        localIntermediarioTracker = param != null;

        this.localIntermediario = param;
    }

    public boolean isPaginaSpecified() {
        return localPaginaTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getPagina() {
        return localPagina;
    }

    /**
     * Auto generated setter method
     * @param param Pagina
     */
    public void setPagina(int param) {
        // setting primitive attribute tracker to true
        localPaginaTracker = param != java.lang.Integer.MIN_VALUE;

        this.localPagina = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                parentQName);

        return factory.createOMElement(dataSource, parentQName);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://www.abrasf.org.br/nfse.xsd");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix +
                    ":ConsultarNfseServicoPrestadoEnvio_type0", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "ConsultarNfseServicoPrestadoEnvio_type0", xmlWriter);
            }
        }

        if (localPrestadorTracker) {
            if (localPrestador == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Prestador cannot be null!!");
            }

            localPrestador.serialize(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "Prestador"), xmlWriter);
        }

        if (localNumeroNfseTracker) {
            namespace = "http://www.abrasf.org.br/nfse.xsd";
            writeStartElement(null, namespace, "NumeroNfse", xmlWriter);

            if (localNumeroNfse == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "NumeroNfse cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumeroNfse));
            }

            xmlWriter.writeEndElement();
        }

        if (localPeriodoEmissaoTracker) {
            if (localPeriodoEmissao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PeriodoEmissao cannot be null!!");
            }

            localPeriodoEmissao.serialize(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "PeriodoEmissao"),
                xmlWriter);
        }

        if (localPeriodoCompetenciaTracker) {
            if (localPeriodoCompetencia == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PeriodoCompetencia cannot be null!!");
            }

            localPeriodoCompetencia.serialize(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "PeriodoCompetencia"),
                xmlWriter);
        }

        if (localTomadorTracker) {
            if (localTomador == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Tomador cannot be null!!");
            }

            localTomador.serialize(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "Tomador"), xmlWriter);
        }

        if (localIntermediarioTracker) {
            if (localIntermediario == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Intermediario cannot be null!!");
            }

            localIntermediario.serialize(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "Intermediario"),
                xmlWriter);
        }

        if (localPaginaTracker) {
            namespace = "http://www.abrasf.org.br/nfse.xsd";
            writeStartElement(null, namespace, "Pagina", xmlWriter);

            if (localPagina == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Pagina cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPagina));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.abrasf.org.br/nfse.xsd")) {
            return "";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     *
     */
    public javax.xml.stream.XMLStreamReader getPullParser(
        javax.xml.namespace.QName qName)
        throws org.apache.axis2.databinding.ADBException {
        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localPrestadorTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "Prestador"));

            if (localPrestador == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Prestador cannot be null!!");
            }

            elementList.add(localPrestador);
        }

        if (localNumeroNfseTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "NumeroNfse"));

            if (localNumeroNfse != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumeroNfse));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "NumeroNfse cannot be null!!");
            }
        }

        if (localPeriodoEmissaoTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "PeriodoEmissao"));

            if (localPeriodoEmissao == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PeriodoEmissao cannot be null!!");
            }

            elementList.add(localPeriodoEmissao);
        }

        if (localPeriodoCompetenciaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "PeriodoCompetencia"));

            if (localPeriodoCompetencia == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PeriodoCompetencia cannot be null!!");
            }

            elementList.add(localPeriodoCompetencia);
        }

        if (localTomadorTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "Tomador"));

            if (localTomador == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Tomador cannot be null!!");
            }

            elementList.add(localTomador);
        }

        if (localIntermediarioTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "Intermediario"));

            if (localIntermediario == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Intermediario cannot be null!!");
            }

            elementList.add(localIntermediario);
        }

        if (localPaginaTracker) {
            elementList.add(new javax.xml.namespace.QName(
                    "http://www.abrasf.org.br/nfse.xsd", "Pagina"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localPagina));
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
            elementList.toArray(), attribList.toArray());
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static ConsultarNfseServicoPrestadoEnvio_type0 parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ConsultarNfseServicoPrestadoEnvio_type0 object = new ConsultarNfseServicoPrestadoEnvio_type0();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"ConsultarNfseServicoPrestadoEnvio_type0".equals(
                                    type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ConsultarNfseServicoPrestadoEnvio_type0) org.w3.www._2000._09.xmldsig.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.abrasf.org.br/nfse.xsd", "Prestador").equals(
                            reader.getName())) {
                    object.setPrestador(br.org.abrasf.www.nfse_xsd.TcIdentificacaoPrestador.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.abrasf.org.br/nfse.xsd", "NumeroNfse").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "NumeroNfse" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumeroNfse(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.abrasf.org.br/nfse.xsd",
                            "PeriodoEmissao").equals(reader.getName())) {
                    object.setPeriodoEmissao(br.org.abrasf.www.nfse_xsd.PeriodoEmissao_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.abrasf.org.br/nfse.xsd",
                            "PeriodoCompetencia").equals(reader.getName())) {
                    object.setPeriodoCompetencia(br.org.abrasf.www.nfse_xsd.PeriodoCompetencia_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.abrasf.org.br/nfse.xsd", "Tomador").equals(
                            reader.getName())) {
                    object.setTomador(br.org.abrasf.www.nfse_xsd.TcIdentificacaoTomador.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.abrasf.org.br/nfse.xsd", "Intermediario").equals(
                            reader.getName())) {
                    object.setIntermediario(br.org.abrasf.www.nfse_xsd.TcIdentificacaoIntermediario.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://www.abrasf.org.br/nfse.xsd", "Pagina").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Pagina" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPagina(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setPagina(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
