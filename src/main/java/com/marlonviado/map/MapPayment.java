package com.marlonviado.map;

import com.marlonviado.dto.PaymentDTO;
import com.marlonviado.entity.Payment;

public class MapPayment {
	
	public static PaymentDTO mapPaymentToPaymentDto(Payment payment) {
		return new PaymentDTO(payment);
	}
	
	public static Payment mapPaymentDtoToPayment(PaymentDTO paymentDTO) {
		return Payment.builder()
				.status(paymentDTO.getStatus())
				.paymentId(paymentDTO.getPaymentId())
				.orderId(paymentDTO.getOrderId())
				.amount(paymentDTO.getAmount())
				.build();
	}

}
