package com.marlonviado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.marlonviado.dto.PaymentDTO;
import com.marlonviado.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {

	@Query("SELECT new com.marlonviado.dto.PaymentDTO(payment) "
			+ "FROM com.marlonviado.entity.Payment payment WHERE payment.orderId = ?1")
	PaymentDTO findOrderId(int orderId); 

}
