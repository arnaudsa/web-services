package com.estudos.ws;

import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

public class WSHelper {

    public AccessUser getAccessUser(final WebServiceContext wsctx){
        final MessageContext mctx = wsctx.getMessageContext();

        //get detail from request headers
        final Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        final List userList = (List) http_headers.get("Username");
        final List passList = (List) http_headers.get("Password");

        String username = userList != null ? userList.iterator().next().toString() : "";
        String password = passList != null ? passList.iterator().next().toString(): "";

        if (username.isEmpty() || password.isEmpty()){
            return null;
        }
        return new AccessUser(username, password);
    }

    public static class AccessUser{
        private final String username;
        private final String password;

        public AccessUser(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

    }

}


