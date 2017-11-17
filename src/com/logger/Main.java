package com.logger;

public class Main {
    private static Logger logger = Logger.getLogger();
    public static void main(String[] args) {
        for(int i = 0; i < 1000000; i++) {
            logger.info("zhangsasn" + i);
            logger.debug("zhangsasn" + i);
            logger.error("zhangsasn" + i);
            String num = "123455677899";
        }
    }
}
