package com.exceptionhandler.exceptionhandler.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {
    
    public String getMessage () throws Exception {
        throw new Exception("This is an exception message");
    }
}
