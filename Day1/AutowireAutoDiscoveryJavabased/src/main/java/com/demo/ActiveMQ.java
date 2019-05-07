package com.demo;

import org.springframework.stereotype.Component;

@Component
public class ActiveMQ implements Messaging {
    public ActiveMQ() {
        System.out.println("Inside ActiveMQ Constructor..");
    }

    public void sendMessage() {
        System.out.println("Sending Message via ActiveMQ..");
    }
}
