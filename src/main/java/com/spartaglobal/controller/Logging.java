package com.spartaglobal.controller;

import java.io.IOException;
import java.util.logging.*;

public class Logging {

    private final static Logger logger = Logger.getLogger("sortLogger");

    public static void loggerInit(){
        try {
            //Makes a file handler for the logs to be stored in
            Handler fileHandler = new FileHandler("src/main/java/com/spartaglobal/view/sortLogger.log");
            logger.addHandler(fileHandler);
            //Removes the use of the console handler
            logger.setUseParentHandlers(false);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logs(Level level, String msg){
        logger.log(level,msg);
    }

}
