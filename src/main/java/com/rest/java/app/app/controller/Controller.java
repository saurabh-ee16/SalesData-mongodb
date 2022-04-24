package com.rest.java.app.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    private static final String INSERVICE = "/service" ; 

    @GetMapping(path = INSERVICE)
    public String inService(){
        logger.info("InService request");
        return "In Service";
    }


}
