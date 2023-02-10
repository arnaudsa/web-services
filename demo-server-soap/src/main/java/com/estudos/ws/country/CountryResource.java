package com.estudos.ws.country;

import com.estudos.ws.country.model.Authentication;
import com.estudos.ws.country.model.CountryRequest;
import com.estudos.ws.country.model.CountryResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import static javax.jws.WebParam.Mode.IN;
import static javax.jws.soap.SOAPBinding.Style.DOCUMENT;

@WebService
@SOAPBinding(style = DOCUMENT)
public interface CountryResource {

    @WebMethod(action = "http://country.ws.estudos.com/getDetailSOAP")
    @WebResult(name = "country")
    CountryResponse getDetail(
            @WebParam(name = "authentication", header = true, mode = IN) Authentication authentication,
            @WebParam(name = "countryRequest") CountryRequest countryRequest
    ) throws InterruptedException;
}
