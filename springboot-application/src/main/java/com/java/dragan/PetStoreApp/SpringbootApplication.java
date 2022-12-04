package com.java.dragan.PetStoreApp;

import com.java.dragan.PetStoreApp.Models.Users;
import com.java.dragan.PetStoreApp.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication


@ComponentScan({"com.java.dragan.PetStoreApp.Repository"})
@ComponentScan({"com.java.dragan.PetStoreApp.Service"})
public class SpringbootApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}


	@Autowired
	private UsersRepository usRepo;



}
