package com.CustomerData.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CustomerApplication {

	@Autowired
	private CustomerRepo customerRepo;
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerRepo.save(customer);
		
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerRepo.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
