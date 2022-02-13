package com.coder.cqrs.command.api.events;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreatedEvent {

	private String orderId;
	private String name;
	private BigDecimal price;
	private String items;
	
}
