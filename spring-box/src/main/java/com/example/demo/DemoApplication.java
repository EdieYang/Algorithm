package com.example.demo;

import com.example.demo.components.BeforeApplicationContextCreatedListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);

        new SpringApplicationBuilder()
                .sources(DemoApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .listeners(new BeforeApplicationContextCreatedListener())
                .run(args);
    }


}
