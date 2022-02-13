package com.coder.cqrs.query.api.controller;

import java.util.List;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder.cqrs.command.api.repo.OrderEntity;
import com.coder.cqrs.query.api.queries.GetOrderQuery;

@RestController
@RequestMapping("/orders")
public class OrderQueryController {

	@Autowired
	private QueryGateway queryGateway;

	@GetMapping
	public List<OrderEntity> getOrders() {

		GetOrderQuery orderQuery = new GetOrderQuery();
		
		return queryGateway.query(orderQuery, ResponseTypes.multipleInstancesOf(OrderEntity.class)).join();

	}

}
