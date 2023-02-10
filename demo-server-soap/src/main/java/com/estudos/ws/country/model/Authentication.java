package com.estudos.ws.country.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentication",propOrder = {"username", "password",})
@XmlRootElement
public class Authentication {

    @XmlElement(required = true)
    String username;

    @XmlElement(required = true)
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
