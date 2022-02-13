package com.coder.cqrs.command.api.events;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coder.cqrs.command.api.repo.OrderCommandRepo;
import com.coder.cqrs.command.api.repo.OrderEntity;

@Component
public class OrderEventsHandler {

	@Autowired
	private OrderCommandRepo repo;

	@EventHandler
	public void on(OrderCreatedEvent event) {

		OrderEntity entity = new OrderEntity();
		BeanUtils.copyProperties(event, entity);
		repo.save(entity);

	}
}
