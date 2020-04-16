package io.seata.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.seata.sample.entity.OrdersEntity;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Integer> {


}
