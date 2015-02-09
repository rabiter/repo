package com.company;

import org.primefaces.push.RemoteEndpoint;
import org.primefaces.push.annotation.OnClose;
import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.OnOpen;
import org.primefaces.push.annotation.PathParam;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.annotation.Singleton;
import org.primefaces.push.impl.JSONEncoder;

@PushEndpoint("/{user}")
@Singleton
public class PrimeFacesPush {

    @PathParam("user")
    private String user;

    @OnMessage(encoders = {JSONEncoder.class})
    public String onMessage(String mes) {
        return mes;
    }

    @OnOpen
    public void onOpen(RemoteEndpoint r) {
    }

    @OnClose
    public void onClose(RemoteEndpoint r) {
    }

}
