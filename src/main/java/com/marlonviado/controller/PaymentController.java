package com.marlonviado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlonviado.dto.PaymentDTO;
import com.marlonviado.response.Response;
import com.marlonviado.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/payment")
@RefreshScope
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/doPayment")
	public Response<PaymentDTO> doPayment(@RequestBody PaymentDTO payment) {
		log.info("PaymentController::doPayment ==> Start Execution");
		log.info("Processing payment: {}", payment);
		log.info("PaymentController::doPayment ==> End Execution");
		Response<PaymentDTO> paymentResponse = paymentService.doPayment(payment);
        return Response.<PaymentDTO>builder()
        		.response(paymentResponse.getResponse())
        		.status("SUCCESS")
        		.build();
	}
	
	@GetMapping("/getOrderId/{orderId}")
	public PaymentDTO getOrderId(@PathVariable int orderId) {
//		Response<PaymentDTO> resPayment = paymentService.getOrderById(orderId);
//		return resPayment;
		PaymentDTO payment = paymentService.getOrderById(orderId);
		return payment;

	}

}
