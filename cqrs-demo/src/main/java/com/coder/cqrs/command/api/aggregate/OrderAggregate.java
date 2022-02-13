package com.coder.cqrs.command.api.aggregate;

import java.math.BigDecimal;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import com.coder.cqrs.command.api.commands.CreateOrderCommand;
import com.coder.cqrs.command.api.events.OrderCreatedEvent;

@Aggregate
public class OrderAggregate {

	@AggregateIdentifier
	private String orderId;
	private String name;
	private BigDecimal price;
	private String items;
	
	@CommandHandler
	public OrderAggregate(CreateOrderCommand createOrderCommand) {
		
		OrderCreatedEvent event = new OrderCreatedEvent();
		BeanUtils.copyProperties(createOrderCommand, event);
		AggregateLifecycle.apply(event);
		
	}
	
	@EventSourcingHandler
	public void on(OrderCreatedEvent event) {
		
		this.orderId = event.getOrderId();
		this.name = event.getName();
		this.price = event.getPrice();
		this.items = event.getItems();
		
	}
	
}
