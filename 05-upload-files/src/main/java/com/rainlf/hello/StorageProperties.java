package com.rainlf.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : rain
 * @date : 2018/10/23 1:10 PM
 */
@ConfigurationProperties("storage")
public class StorageProperties {
    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
