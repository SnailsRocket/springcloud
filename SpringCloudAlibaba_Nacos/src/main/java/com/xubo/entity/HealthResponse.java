package com.xubo.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class HealthResponse<T> implements Serializable {
    private Integer healthId;
    private String color;
    private Integer userId;
}
