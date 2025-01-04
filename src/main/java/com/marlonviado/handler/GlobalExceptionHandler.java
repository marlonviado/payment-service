package com.marlonviado.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.marlonviado.exception.PaymentNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	@ExceptionHandler(PaymentNotFoundException.class)
	public String paymentNotFoundException(PaymentNotFoundException ex) {
        return "Payment not found: " + ex.getMessage();
    }
	
	

}
