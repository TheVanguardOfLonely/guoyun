package com.guoyun.pojo;

import java.io.Serializable;

/**
 * @author GY
 * @site
 * @company
 * @create 2019/7/27 21:23
 */
public class ResultInfo implements Serializable {
    private Boolean status;
    private String message;
    private Object data;

    public ResultInfo(Boolean status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResultInfo(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResultInfo() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultInfo{}";
    }
}
