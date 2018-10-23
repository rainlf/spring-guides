package com.rainlf.hello;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @author : rain
 * @date : 2018/10/23 4:36 PM
 */
@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
