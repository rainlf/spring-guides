package com.rainlf.hello;

/**
 * @author : rain
 * @date : 2018/10/23 1:06 PM
 */
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
