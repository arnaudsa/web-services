package com.estudos.democlientsoap.config

import com.estudos.democlientsoap.gateway.AddClient
import com.estudos.democlientsoap.gateway.CountryClientGateway
import com.estudos.democlientsoap.gateway.CountryV2Client
import com.estudos.democlientsoap.stubsv2.CountryV2ResourceImplService
import com.sun.xml.ws.client.BindingProviderProperties
import java.net.URL
import javax.xml.ws.BindingProvider
import javax.xml.ws.handler.MessageContext
import org.apache.http.auth.UsernamePasswordCredentials
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import org.springframework.ws.transport.http.HttpComponentsMessageSender


@Configuration
class SoaConfiguration {

    @Bean
    fun marshaller(): Jaxb2Marshaller {
        val marshaller = Jaxb2Marshaller()
        marshaller.contextPath = "com.estudos.democlientsoap.stubs"
        return marshaller
    }

    @Bean
    fun addClient(marshaller: Jaxb2Marshaller): AddClient {
        val addClient = AddClient()
        addClient.defaultUri = "http://localhost:8080/ws"
        addClient.unmarshaller = marshaller
        addClient.marshaller = marshaller
        return addClient
    }

    @Bean
    fun countryClient(): CountryClientGateway {
        val messageSender = HttpComponentsMessageSender()
        messageSender.setConnectionTimeout(5000)
        messageSender.setReadTimeout(10000)
        messageSender.setCredentials(UsernamePasswordCredentials("user", "password"))


        val marshaller = Jaxb2Marshaller()
        marshaller.contextPath = "com.estudos.democlientsoap.stubs"

        val countryClient = CountryClientGateway("http://localhost:9999/ws/country?wsdl")
        countryClient.marshaller = marshaller
        countryClient.unmarshaller = marshaller
        countryClient.setMessageSender(messageSender)
        return countryClient
    }

    @Bean
    fun countryClientV2(): CountryV2Client {
        val url = URL("http://localhost:9999/ws/country/v2?wsdl")
        val port = CountryV2ResourceImplService(url)
            .countryV2ResourceImplPort

        val requestContext = (port as BindingProvider).requestContext
        requestContext[BindingProviderProperties.CONNECT_TIMEOUT] = 1000
        requestContext[BindingProviderProperties.REQUEST_TIMEOUT] = 2000

        return CountryV2Client(port)
    }

    /**
     *  Para adicionar o header manualmente
     *  val headers = mapOf<String, List<String>>(
     *      "Username" to  listOf("arnaudsa"),
     *      "Password" to listOf("#pas"),
     *   )
     *   val bp = port as BindingProvider
     *   bp.requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers)
     */

}