package com.example.rest.webservices.restfulwebservices.jwt.resources;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);

//        {
//            "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU4MDQ3OTQ3MCwiaWF0IjoxNTc5ODc0NjcwfQ.0bUVRb8qxQcp4wvxhG5ieWZMObjLOJj8zgz0pQqg_wEgdwgQ-YGPR-thyunFg9QJIF_UxLo_IgTk4GfcalotHw"
//        }
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}