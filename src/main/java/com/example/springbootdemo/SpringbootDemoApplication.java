package com.example.springbootdemo;

import com.example.springbootdemo.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringbootDemoApplication implements CommandLineRunner{

	@Resource
	StorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	public void run(String... arg) throws Exception {
		storageService.init();
	}
}
