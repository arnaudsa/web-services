package com.estudos.ws.country.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryRequest", propOrder = {"sigla"})
@XmlRootElement
public class CountryRequest {

    @XmlElement(required = true)
    String sigla;

    public CountryRequest() {
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}
