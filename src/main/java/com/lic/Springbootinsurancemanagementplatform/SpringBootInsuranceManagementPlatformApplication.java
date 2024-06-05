package com.lic.Springbootinsurancemanagementplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootInsuranceManagementPlatformApplication {

	public static void main(String[] args) {
		//DatabaseConnector connector = new DatabaseConnector();
		//connector.downloadPostgreSQLJDBCDriver();
		SpringApplication.run(SpringBootInsuranceManagementPlatformApplication.class, args);
	}

}
