package com.estudos.democlientsoap.controller

import com.estudos.democlientsoap.gateway.CountryClientGateway
import com.estudos.democlientsoap.gateway.CountryClientWSImportGateway
import com.estudos.democlientsoap.gateway.CountryV2Client
import com.estudos.democlientsoap.model.Country
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class WebController(
    private val countryGateway: CountryClientGateway,
    private val countryClientWSImportGateway: CountryClientWSImportGateway,
    private val countryV2Client: CountryV2Client
) {

    @GetMapping("/country/{sigla}")
    fun country(@PathVariable sigla: String): Country {
        return countryClientWSImportGateway.getCountryDetail(sigla)
    }

    @GetMapping("/v2/country/{sigla}")
    fun countryV2(@PathVariable sigla: String): Country {
        return countryV2Client
            .getDetail(sigla)
    }
}