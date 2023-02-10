package com.estudos.ws.hello;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {

    @WebMethod(action = "http://hello.ws.estudos.com/HelloWorld")
    String getHelloWorldAsString();
}
