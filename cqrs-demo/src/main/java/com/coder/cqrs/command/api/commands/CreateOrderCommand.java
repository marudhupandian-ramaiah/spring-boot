package com.coder.cqrs.command.api.commands;

import java.math.BigDecimal;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateOrderCommand {
	
	@TargetAggregateIdentifier
	private String orderId;
	private String name;
	private BigDecimal price;
	private String items;
}
