package com.coder.cqrs.command.api.repo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class OrderEntity {

	@Id
	private String orderId;
	private String name;
	private BigDecimal price;
	private String items;
	
	
}
