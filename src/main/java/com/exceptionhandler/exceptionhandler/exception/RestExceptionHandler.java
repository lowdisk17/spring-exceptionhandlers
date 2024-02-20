package com.exceptionhandler.exceptionhandler.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler({Exception.class, IndexOutOfBoundsException.class})
    public void handler (Exception ex) {
        System.out.println("Exception message : " + ex.getMessage());
    }
    
}
