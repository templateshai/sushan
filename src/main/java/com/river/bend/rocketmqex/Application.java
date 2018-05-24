package com.river.bend.rocketmqex;

import org.apache.log4j.Logger;

public class Application {

    private  static final  Logger logger= Logger.getLogger(Application.class);

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            logger.error("Info log [" +"].");
            Thread.sleep(500);
        }
    }
}
