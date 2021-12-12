package com.appt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApptApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ApptApplication.class, args);
    }

}
