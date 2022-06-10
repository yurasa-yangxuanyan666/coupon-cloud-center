package com.broadview.coupon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouponCalculationApplication {
    private static Logger logger= LogManager.getLogger(CouponCalculationApplication.class);
    public static void main(String[] args){SpringApplication.run(CouponCalculationApplication.class,args);
        logger.trace("trace log");
        logger.info("info log");
        logger.debug("debug log");
        logger.warn("warn log");
        logger.error("error log");
        logger.fatal("fatal log");}
}
