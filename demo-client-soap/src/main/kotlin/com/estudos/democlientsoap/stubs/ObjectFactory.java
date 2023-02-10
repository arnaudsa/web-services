
package com.estudos.democlientsoap.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.estudos.democlientsoap.stubs package. 
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

    private final static QName _GetDetail_QNAME = new QName("http://country.ws.estudos.com/", "getDetail");
    private final static QName _Authentication_QNAME = new QName("http://country.ws.estudos.com/", "authentication");
    private final static QName _CountryResponse_QNAME = new QName("http://country.ws.estudos.com/", "countryResponse");
    private final static QName _GetDetailResponse_QNAME = new QName("http://country.ws.estudos.com/", "getDetailResponse");
    private final static QName _CountryRequest_QNAME = new QName("http://country.ws.estudos.com/", "countryRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.estudos.democlientsoap.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDetail }
     * 
     */
    public GetDetail createGetDetail() {
        return new GetDetail();
    }

    /**
     * Create an instance of {@link CountryRequest }
     * 
     */
    public CountryRequest createCountryRequest() {
        return new CountryRequest();
    }

    /**
     * Create an instance of {@link GetDetailResponse }
     * 
     */
    public GetDetailResponse createGetDetailResponse() {
        return new GetDetailResponse();
    }

    /**
     * Create an instance of {@link CountryResponse }
     * 
     */
    public CountryResponse createCountryResponse() {
        return new CountryResponse();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://country.ws.estudos.com/", name = "getDetail")
    public JAXBElement<GetDetail> createGetDetail(GetDetail value) {
        return new JAXBElement<GetDetail>(_GetDetail_QNAME, GetDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://country.ws.estudos.com/", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://country.ws.estudos.com/", name = "countryResponse")
    public JAXBElement<CountryResponse> createCountryResponse(CountryResponse value) {
        return new JAXBElement<CountryResponse>(_CountryResponse_QNAME, CountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://country.ws.estudos.com/", name = "getDetailResponse")
    public JAXBElement<GetDetailResponse> createGetDetailResponse(GetDetailResponse value) {
        return new JAXBElement<GetDetailResponse>(_GetDetailResponse_QNAME, GetDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://country.ws.estudos.com/", name = "countryRequest")
    public JAXBElement<CountryRequest> createCountryRequest(CountryRequest value) {
        return new JAXBElement<CountryRequest>(_CountryRequest_QNAME, CountryRequest.class, null, value);
    }

}
