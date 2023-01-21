package com.Task.Student123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Task.Student123.Entities.Data;
import com.Task.Student123.Repository.Repo;

@SpringBootApplication
public class Student123Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Student123Application.class, args);
		Repo repo = context.getBean(Repo.class);
		
		Data data = new Data();
		data.setId(10);
		data.setName("Suvarna");
		data.setState("Maharastra");
		data.setCountry("India");
		
		Data data1 = repo.save(data);
		System.out.println(data1);
	}

}
