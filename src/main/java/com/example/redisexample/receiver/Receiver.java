package com.example.redisexample.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class Receiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private AtomicInteger counter = new AtomicInteger();

    public void receiveMessage(String message) {
        LOGGER.info("Received < " + message + ">");
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
    /* Redis : usage as  Messaging
    The Receiver is a POJO that defines a method for receiving messages.When you
    register the Receiver as a message listener, you can name the message handling
    method whatever you want.
    * */

    /*
    Spring Data Redis provides all the components you need to send and receive
    messages with Redis.Specifically, you need to configure.
    --- A connection factory
    --- A message listener container
    --- A Redis template
    * */

    /*You will use the Redis template to send messages, and you will register the Receiver, with the messages
    listener container so that it will receive messages.
    The connection factory drives both the template and the message listener container, letting
    them connect to the Redis server.
    * */

}
