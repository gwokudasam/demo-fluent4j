package com.demo.fluent4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoFluent4jApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoFluent4jApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoFluent4jApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            int x = 0;
            while (x < 5) {
                LOGGER.error("ERROR MESSAGE");
                LOGGER.info("INFO MESSAGE");
                LOGGER.warn("WARN MESSAGE");
                x++;
            }
        };
    }
}
