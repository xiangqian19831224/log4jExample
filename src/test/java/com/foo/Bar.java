package com.foo;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Bar {
    static final Logger logger = LogManager.getLogger(Bar.class.getName());

    public boolean doIt() {
        logger.trace("trace in Bar");
        logger.error("Did it again!");

        return true;
    }
}