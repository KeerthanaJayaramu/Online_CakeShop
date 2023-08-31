package com.edubridge.cakeshop.service;

import com.edubridge.cakeshop.constant.OrderStatus;
import com.edubridge.cakeshop.model.OrderDetailResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderServiceI {

    List<OrderDetailResponse> getOrderDetails(Pageable pageable);

    OrderDetailResponse getOrderDetail(long orderID);

    void updateOrderStatus(long orderID, OrderStatus orderStatus);

    void deleteOrderDetails(long orderID);
}
