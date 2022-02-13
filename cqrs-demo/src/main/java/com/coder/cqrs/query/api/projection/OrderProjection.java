package com.coder.cqrs.query.api.projection;

import java.util.List;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coder.cqrs.command.api.repo.OrderEntity;
import com.coder.cqrs.query.api.queries.GetOrderQuery;
import com.coder.cqrs.query.api.repo.GetQueryRepository;

@Component
public class OrderProjection {

	@Autowired
	private GetQueryRepository repo;
	
	@QueryHandler
	public List<OrderEntity> handle(GetOrderQuery query) {
		
		List<OrderEntity> list = repo.findAll();
		
		return list;
		
	}
	
}
