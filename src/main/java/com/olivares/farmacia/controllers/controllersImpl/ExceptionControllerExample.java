package com.olivares.farmacia.controllers.controllersImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionControllerExample {
    @GetMapping(value="/exception")
    public void exception(){
        throw new IllegalArgumentException("\" I'm an error from jsp controller\"");
    }
    
}
