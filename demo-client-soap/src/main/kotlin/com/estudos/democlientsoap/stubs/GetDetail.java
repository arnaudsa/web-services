
package com.estudos.democlientsoap.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryRequest" type="{http://country.ws.estudos.com/}countryRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDetail", propOrder = {
    "countryRequest"
})
@XmlRootElement
public class GetDetail {

    protected CountryRequest countryRequest;

    /**
     * Obtém o valor da propriedade countryRequest.
     * 
     * @return
     *     possible object is
     *     {@link CountryRequest }
     *     
     */
    public CountryRequest getCountryRequest() {
        return countryRequest;
    }

    /**
     * Define o valor da propriedade countryRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRequest }
     *     
     */
    public void setCountryRequest(CountryRequest value) {
        this.countryRequest = value;
    }

}
