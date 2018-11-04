package com.rainlf.hello;

/**
 * @author : rain
 * @date : 2018/11/4 12:21 PM
 */
public interface BookRepository {

    Book getByIsbn(String isbn);
}
