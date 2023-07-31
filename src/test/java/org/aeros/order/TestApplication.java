package org.aeros.order;

import org.springframework.boot.SpringApplication;

public class TestApplication {

	public static void main(String... args) {
		SpringApplication.from(OrderApplication::main)
				.with(TestContainersConfig.class)
				.run(args);
	}
}
