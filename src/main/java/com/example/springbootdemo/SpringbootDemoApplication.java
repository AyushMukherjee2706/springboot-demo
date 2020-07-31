package com.example.springbootdemo;

import com.example.springbootdemo.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringbootDemoApplication {//implements CommandLineRunner{//catching the command line exception

	@Resource //the container will inject an instance of the requested resource into the application component when the component is initialized. 
	StorageService storageService;//Interface where we write the front end logic.

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}


	public void run(String... arg) throws Exception {
		storageService.init(); // this will make the upload folder if not there.
	}
}
