package com.estudos.ws.countryv2

import com.estudos.ws.countryv2.model.Authentication
import com.estudos.ws.countryv2.model.CountryRequest
import com.estudos.ws.countryv2.model.CountryResponse
import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult
import javax.jws.WebService
import javax.jws.soap.SOAPBinding
import javax.jws.soap.SOAPBinding.Style.RPC

@WebService
@SOAPBinding(style = RPC)
interface CountryV2Resource {

    @WebMethod
    @WebResult(name = "country")
    fun getDetail(
        @WebParam(name = "authorization", header = true) authentication: Authentication,
        @WebParam(name = "request") request: CountryRequest,
    ): CountryResponse

}