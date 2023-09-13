package com.example.community;

import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class CommunityApplication {




    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

}
