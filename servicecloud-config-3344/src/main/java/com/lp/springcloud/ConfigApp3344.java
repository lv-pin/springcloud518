package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApp3344 extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApp3344.class);
    }

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(ConfigApp3344.class);
    }
}
