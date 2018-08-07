package com.weenvoyer.bot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weenvoyer.arch.WeenvoyerServicesRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.weenvoyer")
public class Application {

    public static void main(String[] args) {
        new WeenvoyerServicesRunner(Application.class).run(args);
    }

}
