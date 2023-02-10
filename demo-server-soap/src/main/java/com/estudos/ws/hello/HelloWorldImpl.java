package com.estudos.ws.hello;

import com.estudos.ws.WSHelper;
import com.estudos.ws.WSHelper.AccessUser;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

@WebService(endpointInterface = "com.estudos.ws.hello.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Resource
    private WebServiceContext wsctx;

    private final WSHelper wsHelper = new WSHelper();

    @Override
    public String getHelloWorldAsString() {
        final AccessUser accessUser = wsHelper.getAccessUser(wsctx);
        if (accessUser == null){
            return "Acesso Negado";
        }

        return "Hello World JAX-WS - Valid User!";
    }
}
