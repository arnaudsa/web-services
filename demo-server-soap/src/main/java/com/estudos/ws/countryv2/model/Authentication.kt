package com.estudos.ws.countryv2.model

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentication", propOrder = ["username", "password"])
@XmlRootElement
data class Authentication(
    var username: String? = null,
    var password: String? = null,
)



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryRequest", propOrder = ["sigla"])
@XmlRootElement
data class CountryRequest(
    var sigla: String? = null
)

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countryResponse", propOrder = ["population", "capital", "moeda"])
@XmlRootElement
data class CountryResponse(
    var population: Long? = null,
    var capital: String? = null,
    var moeda: String? = null,
)