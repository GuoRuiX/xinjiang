package com.credit.information.services.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.credit")
public class CreditInformationServicesStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditInformationServicesStartApplication.class, args);
    }

}
