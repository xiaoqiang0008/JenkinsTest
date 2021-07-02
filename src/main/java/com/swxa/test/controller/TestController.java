package com.swxa.test.controller;


import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    @ResponseBody
    public String  getInfo(){
        return "success";
    }
}
