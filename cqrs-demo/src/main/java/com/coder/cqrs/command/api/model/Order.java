package com.coder.cqrs.command.api.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {

	private String name;
	private BigDecimal price;
	private String items;

}
