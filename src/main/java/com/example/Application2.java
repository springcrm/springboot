package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//@EnableTransactionManagement
@SpringBootApplication
public class Application2 {
	 @Bean
	    public Object testBean(PlatformTransactionManager platformTransactionManager) {
	        System.out.println(">>>>>>>>>>" + platformTransactionManager.getClass().getName());
	        return new Object();
	    }
	 
	public static void main2(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(Application2.class, args);

/*	        System.out.println("Let's inspect the beans provided by Spring Boot:");

	        String[] beanNames = ctx.getBeanDefinitionNames();
	        Arrays.sort(beanNames);
	        for (String beanName : beanNames) {
	            System.out.println(beanName);
	        }*/
	}
}
