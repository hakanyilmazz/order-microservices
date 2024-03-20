package com.hakanyilmazz.orderservice.repository;

import com.hakanyilmazz.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
