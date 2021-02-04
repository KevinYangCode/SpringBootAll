package com.yangvin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Y_Kevin
 * @date 2021-02-04 14:23
 */
@SpringBootApplication
@EnableScheduling
public class SpringBootWebsocketApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebsocketApplication.class, args);
	}
}
