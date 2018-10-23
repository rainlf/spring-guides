package com.rainlf.hello;

/**
 * @author : rain
 * @date : 2018/10/23 1:08 PM
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
