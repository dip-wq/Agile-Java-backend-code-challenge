package com.agile.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgileJavaBackendCodeChallengeApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(AgileJavaBackendCodeChallengeApp.class);
    public static void main(String[] args) {
        SpringApplication.run(AgileJavaBackendCodeChallengeApp.class,args);
        LOGGER.info("AgileJavaBackendCodeChallengeApp app started");
    }
}
