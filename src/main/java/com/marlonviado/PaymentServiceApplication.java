package com.marlonviado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
@RequestMapping("/payment")
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
		//new SpringApplicationBuilder(PaymentServiceApplication.class)
		//.web(WebApplicationType.NONE)
		//.run(args);
	}
	
	@GetMapping
	public String test() {
		return "Deployed to Kubernetes using Jenkins!";
	}

}
