package com.s4lprod.research;

import java.util.logging.Logger;

public class LogTestMain {

    public static void main(String[] args) {
	    Logger logger = Logger.getLogger("com.s4lprod.research.LogTest");
	    
	    logger.severe("Power lost - running on backup!");
	    logger.warning("Database connection lost, retrying...");
	    logger.info("Startup complete.");
	    logger.config("Server configuration: standalone, JVM version 1.5");
	    logger.fine("Loading graphing package.");
	    logger.finer("Doing pie chart");
	    logger.finest("Starting bubble sort: value = " + 42);
    }
}
