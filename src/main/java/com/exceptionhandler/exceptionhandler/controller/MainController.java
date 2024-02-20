package com.exceptionhandler.exceptionhandler.controller;

import org.springframework.web.bind.annotation.RestController;

import com.exceptionhandler.exceptionhandler.service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

     @Autowired
    private ServiceImpl sImpl;

    @GetMapping("service")
    public String getMethodName() throws Exception {
        return sImpl.getMessage();
    }
    

}