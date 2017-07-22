package com.mt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by shaojia on 2017/7/11.
 */
/*@RestController*/
/*@Configuration
@EnableAutoConfiguration
@ComponentScan*/
@SpringBootApplication
@EntityScan("com.mt.**.entity")
@ComponentScan({"com.mt.**.service", "com.mt.**.web"})
@EnableJpaRepositories(basePackages = { "com.mt.**.repository" })
public class App {

    public String index() {
        return "index page";
    }

    public static void main(String[] args) {

        System.out.println("starting app...");
        SpringApplication.run(App.class, args);
        System.out.println("start finish...");
    }

}
