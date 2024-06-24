package org.example.discordlike;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.example.discordlike.mapper")
@SpringBootApplication
public class DiscordLikeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscordLikeApplication.class, args);
    }

}
