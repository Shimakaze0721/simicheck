package com.shima.simicheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class SimicheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimicheckApplication.class, args);
	}
    @GetMapping("/")
	public String index(){
		return "OK";
	}
}
