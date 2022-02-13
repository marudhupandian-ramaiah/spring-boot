package com.coder.cqrs.query.api.queries;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderQuery {

	private String orderId;
	private String name;
	private String items;
	private BigDecimal price;

}
