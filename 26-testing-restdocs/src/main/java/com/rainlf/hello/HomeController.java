package com.rainlf.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @author : rain
 * @date : 2018/11/5 11:09 AM
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> greeting() {
        return Collections.singletonMap("message", "Hello World 3");
    }
}
