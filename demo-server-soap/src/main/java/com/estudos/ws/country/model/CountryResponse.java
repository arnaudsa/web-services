package com.estudos.ws.country.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryResponse", propOrder = { "population", "capital", "moeda"})
@XmlRootElement
public class CountryResponse {

    @XmlElement
    Long population;

    @XmlElement
    String capital;

    @XmlElement
    String moeda;

    public CountryResponse() {
    }

    public CountryResponse(Long population, String capital, String moeda) {
        this.population = population;
        this.capital = capital;
        this.moeda = moeda;
    }


    public void setPopulation(Long population) {
        this.population = population;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public Long getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public String getMoeda() {
        return moeda;
    }

}
