package com.marlonviado.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.marlonviado.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PaymentDTO {
	
    private int paymentId;
    private double amount;
	private String status;
    private int orderId;
    
    public PaymentDTO(Payment payment) {
    	this.paymentId = payment.getPaymentId();
        this.amount = payment.getAmount();
        this.status = payment.getStatus();
        this.orderId = payment.getOrderId();
    }


}
