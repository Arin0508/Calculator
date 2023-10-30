package org.example;

import java.util.logging.log4j.LogManager;
import java.util.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) 
    {
        logger.info("Start of Execution");
        logger.warn("Invalid Input");
        System.out.println("Hello world!");
    }
}