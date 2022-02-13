package com.coder.cqrs.command.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCommandRepo extends JpaRepository<OrderEntity, String> {

}
