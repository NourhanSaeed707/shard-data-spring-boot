package com.example.sharding.service;

import com.example.sharding.entity.Order;
import com.example.sharding.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(String description) {
        Order order = new Order();
        order.setDescription(description);
        return orderRepository.save(order);
    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}