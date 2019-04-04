package com.foo;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyApp {

    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    private static final Logger logger = LoggerFactory.getLogger(MyApp.class);

    public static void main(final String... args) {

        // Set up a simple configuration that logs on the console.

        logger.trace("Entering application.");
        logger.error("Error");
        logger.warn("Warn");
        logger.info("Info");
        logger.debug("Debug");

//        Bar bar = new Bar();
//        if (!bar.doIt()) {
//            logger.error("Didn't do it.");
//        }
        logger.trace("Exiting application.");
    }
}
