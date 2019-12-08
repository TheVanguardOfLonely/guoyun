package com.guoyun.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author GY
 * @site
 * @company
 * @create 2019/7/22 22:14
 */
public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")//时间转换成json时转换后格式
    @DateTimeFormat(pattern = "yyyy-MM-dd")//前台页面传过来的时间格式
    private Date publishDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
