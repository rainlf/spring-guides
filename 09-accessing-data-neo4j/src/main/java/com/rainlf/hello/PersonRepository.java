package com.rainlf.hello;

import org.springframework.data.repository.CrudRepository;

/**
 * @author : rain
 * @date : 2018/10/23 5:38 PM
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findByName(String name);
}
