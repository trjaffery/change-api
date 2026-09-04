package com.trjaffery.change_api;

import org.springframework.boot.SpringApplication;

public class TestChangeApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(ChangeApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
