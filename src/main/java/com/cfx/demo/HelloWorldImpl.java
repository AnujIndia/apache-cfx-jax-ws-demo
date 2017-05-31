package com.cfx.demo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.cfx.demo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

