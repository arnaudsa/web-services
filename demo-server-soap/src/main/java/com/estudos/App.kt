package com.estudos

import com.estudos.ws.country.resource.CountryResourceImpl
import com.estudos.ws.country.service.CountryService
import com.estudos.ws.countryv2.resource.CountryV2ResourceImpl
import com.estudos.ws.hello.HelloWorldImpl
import javax.xml.ws.Endpoint


fun main() {
    Endpoint.publish("http://localhost:9999/ws/hello", HelloWorldImpl())
    Endpoint.publish("http://localhost:9999/ws/country", CountryResourceImpl())
    Endpoint.publish("http://localhost:9999/ws/country/v2", CountryV2ResourceImpl(CountryService()))

    println("Serviço Iniciado..")
}