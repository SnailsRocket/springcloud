package com.xubo.controller;

import com.xubo.entity.HealthResponse;
import com.xubo.utils.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCodeController {

    @RequestMapping("healthCode/create")
    public ResponseResult<HealthResponse> create(@RequestBody String body) {
        HealthResponse response = new HealthResponse();
        //TODO
        response.setUserId(1);
        response.setColor("green");
        response.setHealthId(1);
        return new ResponseResult<>(response);
    }

}
