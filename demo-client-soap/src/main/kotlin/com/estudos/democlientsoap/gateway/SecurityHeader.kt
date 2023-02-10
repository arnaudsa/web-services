package com.estudos.democlientsoap.gateway

import com.estudos.democlientsoap.stubs.Authentication
import javax.xml.bind.JAXBContext
import org.springframework.ws.WebServiceMessage
import org.springframework.ws.client.core.WebServiceMessageCallback
import org.springframework.ws.soap.SoapMessage

class SecurityHeader(
    private val authentication: Authentication
): WebServiceMessageCallback {

    override fun doWithMessage(message: WebServiceMessage) {
        val soapMessage = message as SoapMessage
        val soapHeader = soapMessage.soapHeader
        soapMessage.soapAction = "http://country.ws.estudos.com/getDetailSOAP"
        val jaxbContext = JAXBContext.newInstance(Authentication::class.java)
        val marshaller = jaxbContext.createMarshaller()
        marshaller.marshal(authentication, soapHeader.result)
    }
}