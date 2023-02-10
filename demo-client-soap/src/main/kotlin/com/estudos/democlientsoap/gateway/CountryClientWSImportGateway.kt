package com.estudos.democlientsoap.gateway

import com.estudos.democlientsoap.model.Country
import com.estudos.democlientsoap.stubs.Authentication
import com.estudos.democlientsoap.stubs.CountryRequest
import com.estudos.democlientsoap.stubs.CountryResource
import com.estudos.democlientsoap.stubs.GetDetail

class CountryClientWSImportGateway(
    private val port: CountryResource?,
) {

    fun getCountryDetail(sigla: String): Country {
        val authentication = Authentication()
        authentication.password = "#pas"
        authentication.username = "arnaudsa"

        val countryRequest = CountryRequest()
        countryRequest.sigla = sigla

        val getDetail = GetDetail()
        getDetail.countryRequest = countryRequest

        return port
            ?.getDetail(getDetail, authentication)
            ?.let {
                val countryResponse = it.country
                Country(
                    population = countryResponse.population,
                    capital = countryResponse.capital,
                    moeda = countryResponse.moeda
                )
            } ?: throw IllegalArgumentException("")
    }


}