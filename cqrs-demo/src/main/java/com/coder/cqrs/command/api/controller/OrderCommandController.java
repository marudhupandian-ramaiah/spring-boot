package com.coder.cqrs.command.api.controller;

import java.util.UUID;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coder.cqrs.command.api.commands.CreateOrderCommand;
import com.coder.cqrs.command.api.model.Order;

@RestController
@RequestMapping("/orders")
public class OrderCommandController {

	@Autowired
	private CommandGateway commandGateway;

	@PostMapping
	public String createOrder(@RequestBody Order order) {

		CreateOrderCommand createOrderCommand = CreateOrderCommand
				.builder()
				.orderId(UUID.randomUUID().toString())
				.name(order.getName())
				.price(order.getPrice())
				.items(order.getItems())
				.build();

		return commandGateway.sendAndWait(createOrderCommand);

	}

}
