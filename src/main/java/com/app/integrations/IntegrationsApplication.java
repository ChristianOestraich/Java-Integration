package com.app.integrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntegrationsApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run( IntegrationsApplication.class, args );
    }
}
