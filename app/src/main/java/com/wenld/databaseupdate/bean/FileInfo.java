package com.wenld.databaseupdate.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Entity mapped to table "FILE_INFO".
 */
@Entity
public class FileInfo {
    @Id
    private Long id;
    private Integer length;
    /**
     * Not-null value.
     */
    private String url;
    /**
     * Not-null value.
     */
    private String fileName;

    @Keep
    public FileInfo(Long id, Integer length, String url, String fileName) {
        this.id = id;
        this.length = length;
        this.url = url;
        this.fileName = fileName;
    }

    public FileInfo() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Not-null value.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Not-null value.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
