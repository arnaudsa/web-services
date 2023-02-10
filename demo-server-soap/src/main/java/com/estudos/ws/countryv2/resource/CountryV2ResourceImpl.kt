package com.estudos.ws.countryv2.resource

import com.estudos.ws.country.service.CountryService
import com.estudos.ws.countryv2.CountryV2Resource
import com.estudos.ws.countryv2.model.Authentication
import com.estudos.ws.countryv2.model.CountryRequest
import com.estudos.ws.countryv2.model.CountryResponse
import javax.jws.WebService

@WebService(endpointInterface = "com.estudos.ws.countryv2.CountryV2Resource")
class CountryV2ResourceImpl(
    private val countryService: CountryService
): CountryV2Resource {

    override fun getDetail(authentication: Authentication, request: CountryRequest): CountryResponse {
        return countryService.getCountry(request.sigla)
            .let {
                CountryResponse(
                    capital = it.capital,
                    moeda = it.moeda,
                    population = it.population,
                )
            }
    }
}