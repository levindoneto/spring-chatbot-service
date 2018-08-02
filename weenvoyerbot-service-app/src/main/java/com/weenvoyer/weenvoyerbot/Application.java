package com.weenvoyer.weenvoyerbot;

import com.weenvoyer.arch.WeenvoyerServicesRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.weenvoyer")
public class Application {

    public static void main(String[] args) {
        new WeenvoyerServicesRunner(Application.class).run(args);
    }

}
