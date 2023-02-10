
package com.estudos.democlientsoap.stubsv2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.estudos.democlientsoap.stubsv2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Authentication_QNAME = new QName("http://countryv2.ws.estudos.com/", "authentication");
    private final static QName _CountryResponse_QNAME = new QName("http://countryv2.ws.estudos.com/", "countryResponse");
    private final static QName _CountryRequest_QNAME = new QName("http://countryv2.ws.estudos.com/", "countryRequest");
    private final static QName _Authorization_QNAME = new QName("http://countryv2.ws.estudos.com/", "authorization");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.estudos.democlientsoap.stubsv2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link CountryRequest }
     * 
     */
    public CountryRequest createCountryRequest() {
        return new CountryRequest();
    }

    /**
     * Create an instance of {@link CountryResponse }
     * 
     */
    public CountryResponse createCountryResponse() {
        return new CountryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://countryv2.ws.estudos.com/", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://countryv2.ws.estudos.com/", name = "countryResponse")
    public JAXBElement<CountryResponse> createCountryResponse(CountryResponse value) {
        return new JAXBElement<CountryResponse>(_CountryResponse_QNAME, CountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://countryv2.ws.estudos.com/", name = "countryRequest")
    public JAXBElement<CountryRequest> createCountryRequest(CountryRequest value) {
        return new JAXBElement<CountryRequest>(_CountryRequest_QNAME, CountryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://countryv2.ws.estudos.com/", name = "authorization")
    public JAXBElement<Authentication> createAuthorization(Authentication value) {
        return new JAXBElement<Authentication>(_Authorization_QNAME, Authentication.class, null, value);
    }

}
