package com.estudos.democlientsoap.gateway

import com.estudos.democlientsoap.model.Country
import com.estudos.democlientsoap.stubs.Authentication
import com.estudos.democlientsoap.stubs.CountryRequest
import com.estudos.democlientsoap.stubs.GetDetail
import com.estudos.democlientsoap.stubs.GetDetailResponse
import javax.xml.bind.JAXBElement
import javax.xml.bind.JAXBIntrospector
import org.springframework.ws.client.core.support.WebServiceGatewaySupport

class CountryClientGateway(
    private val uri: String
): WebServiceGatewaySupport() {

    fun getCountryDetail(sigla: String): Country {
        val authentication = Authentication()
        authentication.username = "arnaudsa"
        authentication.password= "#pas"
        val securityHeader = SecurityHeader(authentication)

        val countryRequest = CountryRequest()
        countryRequest.sigla = sigla

        val getDetail = GetDetail()
        getDetail.countryRequest = countryRequest

        val response = webServiceTemplate.marshalSendAndReceive(uri, getDetail, securityHeader)
        val value = JAXBIntrospector.getValue(response)
        val getDetailResponse = value as GetDetailResponse
        val countryResponse = getDetailResponse.country

        return Country(
            population = countryResponse.population,
            capital = countryResponse.capital,
            moeda = countryResponse.moeda
        )
    }
}