package com.yan.order.service;


import com.yan.order.bean.Order;

public interface OrderService {

    Order createOrder(Long productId, Long userId);
}
