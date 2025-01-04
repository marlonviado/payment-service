package com.marlonviado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.marlonviado.dto.PaymentDTO;
import com.marlonviado.entity.Payment;
import com.marlonviado.map.MapPayment;
import com.marlonviado.repository.PaymentRepository;
import com.marlonviado.response.Response;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public Response<PaymentDTO> doPayment(PaymentDTO payment) {
		
        Payment savedPayment = paymentRepository.save(MapPayment.mapPaymentDtoToPayment(payment));
        
		return Response.<PaymentDTO>builder()
				.response(new PaymentDTO(savedPayment))
				//.response(payment)
				.status("SUCCESS")
				.build();
	}
	
//	public Response<PaymentDTO> getOrderById(int orderId) {
//		
//		PaymentDTO payment = paymentRepository.findOrderId(orderId);
//		
//		log.info("ORDER ID : " + orderId);
//		log.info("PaymentService::getOrderById() : " + payment);
//        
//		return Response.<PaymentDTO>builder()
//				.response(payment)
//				.status("SUCCESS")
//				.build();
//	}

	public PaymentDTO getOrderById(int orderId) {
		
		PaymentDTO payment = paymentRepository.findOrderId(orderId);
		
		log.info("ORDER ID : " + orderId);
		log.info("PaymentService::getOrderById() : " + payment);
        
		return payment;
	}

}
