package com.company;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {

    public MyListener() {
    }

    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setMaxInactiveInterval(180);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        int t = 3; // will never get here until stop Comet heartbeats (each heartbeat updates the HttpSession#getLastAccessedTime())
    }

}
