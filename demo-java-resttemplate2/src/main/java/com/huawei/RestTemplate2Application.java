package com.huawei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration // (exclude = { DataSourceAutoConfiguration.class,
							// HibernateJpaAutoConfiguration.class })
public class RestTemplate2Application {
	// #region main

	public static void main(String[] args) {
		SpringApplication.run(RestTemplate2Application.class, args);
	}

	// #endregion
}
