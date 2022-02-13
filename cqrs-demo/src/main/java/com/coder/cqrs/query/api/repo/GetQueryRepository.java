package com.coder.cqrs.query.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.cqrs.command.api.repo.OrderEntity;

@Repository
public interface GetQueryRepository extends JpaRepository<OrderEntity, String>{

}
