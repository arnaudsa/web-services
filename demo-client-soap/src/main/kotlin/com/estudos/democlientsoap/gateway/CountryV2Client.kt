package com.estudos.democlientsoap.gateway

import com.estudos.democlientsoap.model.Country
import com.estudos.democlientsoap.stubsv2.Authentication
import com.estudos.democlientsoap.stubsv2.CountryRequest
import com.estudos.democlientsoap.stubsv2.CountryV2Resource

class CountryV2Client(
    private val countryV2Resource: CountryV2Resource,
){

    fun getDetail(sigla: String): Country {
        val countryRequest = CountryRequest()
        countryRequest.sigla = sigla

        val authentication = Authentication()
        authentication.password = "#pas"
        authentication.username = "arnaudsa"

        return countryV2Resource.getDetail(authentication,countryRequest)
            .let {
                Country(
                    capital = it.capital,
                    moeda = it.moeda,
                    population = it.population,
                )
            }
    }
}