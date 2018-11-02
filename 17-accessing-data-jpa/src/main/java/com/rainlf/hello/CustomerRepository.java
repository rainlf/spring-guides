package com.rainlf.hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author : rain
 * @date : 2018/11/2 6:13 PM
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
