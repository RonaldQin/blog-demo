package com.sideboy.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sideboy.blog.dao")
@SpringBootApplication
public class YouzeApplication {

	public static void main(String[] args) {
		SpringApplication.run(YouzeApplication.class, args);
	}

}
