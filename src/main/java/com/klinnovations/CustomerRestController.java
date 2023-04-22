package com.klinnovations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerRestController {
	
	@GetMapping("/")
	public Customer getCustomer() {
		
		Customer c =new Customer();
		c.setId(101);
		c.setName("Laxman");
		c.setEmail("laxman@gmail.com");
		c.setPhno(911039988);
		
		return c;
	}
	
	
	
	

}
