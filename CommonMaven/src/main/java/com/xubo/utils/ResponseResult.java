package com.xubo.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = -3999803560577989187L;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息
     */
    private String message;
    /**
     * 返回对象
     */
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(T data) {
        this.data = data;
    }

    public ResponseResult(Integer code) {
        this.code = code;
    }

    public ResponseResult(String message) {
        this.message = message;
    }

    public ResponseResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseResult<?> that = (ResponseResult<?>) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(message, that.message) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, data);
    }
}
