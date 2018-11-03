package com.rainlf.hello;

import org.springframework.data.annotation.Id;

/**
 * @author : rain
 * @date : 2018/11/3 7:25 PM
 */
public class Person {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
