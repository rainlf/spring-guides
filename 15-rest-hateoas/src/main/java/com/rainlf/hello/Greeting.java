package com.rainlf.hello;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * @author : rain
 * @date : 2018/10/26 1:17 PM
 */
public class Greeting extends ResourceSupport {

    private final String content;

    /**
     * 指定反序列化时使用的构造函数
     * @param content
     */
    @JsonCreator
    public Greeting(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
