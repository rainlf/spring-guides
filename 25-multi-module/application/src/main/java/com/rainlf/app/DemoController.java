package com.rainlf.app;

import com.rainlf.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : rain
 * @date : 2018/11/5 10:42 AM
 */
@RestController
public class DemoController {

    private final MyService myService;

    public DemoController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

}
