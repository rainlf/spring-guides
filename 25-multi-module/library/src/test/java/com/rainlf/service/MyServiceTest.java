package com.rainlf.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : rain
 * @date : 2018/11/5 10:37 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest("service.message=Hello")
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    public void message() throws Exception {
        assertThat(myService.message()).isNotNull();
    }

}