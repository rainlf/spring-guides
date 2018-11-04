package com.rainlf.hello;

import org.springframework.stereotype.Service;

/**
 * @author : rain
 * @date : 2018/11/4 1:16 PM
 */
@Service
public class GreetingService {

    public String greet() {
        return "Hello World";
    }
}