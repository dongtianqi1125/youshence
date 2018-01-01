package com.youshence.cloud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动Eureka
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaApplication.class, args);
    }
}
