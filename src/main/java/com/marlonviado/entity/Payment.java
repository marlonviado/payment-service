package com.marlonviado.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "payment_tbl")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Payment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", nullable = false)
    private int paymentId;
	
	@Column(name = "amount", nullable = false)
    private double amount;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "order_id", nullable = false)
    private int orderId;

}
