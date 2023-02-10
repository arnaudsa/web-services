package com.estudos.democlientsoap.gateway


import org.springframework.ws.client.core.support.WebServiceGatewaySupport

class AddClient: WebServiceGatewaySupport() {

    fun add(): ResponseDTO {
//        val add = Add()
//        add.intA = 1
//        add.intB = 7

//        val response = webServiceTemplate
//            .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx?wsdl", add, SoapActionCallback("http://tempuri.org/Add"))

//        val addResponse: AddResponse = response as AddResponse
        return  ResponseDTO(
            result = 1,
            operation = "Add"
        )
    }

}


data class ResponseDTO(
    val result: Int,
    val operation: String,
)