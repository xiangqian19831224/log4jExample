package com.foo.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/log")
public class controller {
    protected static Logger log = LogManager.getLogger(controller.class);
    @RequestMapping(value = "/debug")
    public String debugTest(){
        log.debug("debug Test");

        return "debug";
    }

    @RequestMapping(value = "/info")
    public String infoTest(){
        log.info("info Test");

        return "info";
    }

    @RequestMapping(value = "/warn")
    public String warnTest(){
        log.warn("warn Test");

        return "warn";
    }

    @RequestMapping(value = "/error")
    public String errorTest(){
        log.error("error Test");

        return "error";
    }

    @RequestMapping(value = "/other")
    public String otherTest(){
        log.debug("other Test");

        return "other";
    }
}
