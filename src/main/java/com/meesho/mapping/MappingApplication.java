package com.meesho.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meesho.mapping.Repository.AddressRepo;
import com.meesho.mapping.Repository.StudentRepo;

@SpringBootApplication
public class MappingApplication implements CommandLineRunner {
	@Autowired StudentRepo ob;
	@Autowired AddressRepo ob1;
	public static void main(String [] args) {
		SpringApplication.run(MappingApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		StudentInformation student = new StudentInformation(2, "Water");
		ob.save(student);
		Address address = new Address(4, "MP", student);
		ob1.save(address);
	}
}
