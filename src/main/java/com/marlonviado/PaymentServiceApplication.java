package com.marlonviado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.marlonviado.config.PaymentCacheConfig;
import com.marlonviado.config.ServiceRegistryConfig;

@SpringBootApplication
@Import({
	ServiceRegistryConfig.class,
	PaymentCacheConfig.class
	})
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
		//new SpringApplicationBuilder(PaymentServiceApplication.class)
		//.web(WebApplicationType.NONE)
		//.run(args);
	}

}
