package com.edubridge.cakeshop.service.impl;

import com.edubridge.cakeshop.constant.OrderStatus;
import com.edubridge.cakeshop.dao.api.OrderDetailsRepository;
import com.edubridge.cakeshop.entity.OrderDetails;
import com.edubridge.cakeshop.model.OrderDetailResponse;
import com.edubridge.cakeshop.service.OrderServiceI;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderServiceI {

    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public List<OrderDetailResponse> getOrderDetails(Pageable pageable) {
        List<OrderDetails> orderDetailsList = orderDetailsRepository.findAll(pageable).getContent();
        return objectMapper.convertValue(orderDetailsList, new TypeReference<>() {});
    }

    @Override
    public OrderDetailResponse getOrderDetail(long orderID) {
        OrderDetails orderDetail = orderDetailsRepository.findById(orderID).get();
        return objectMapper.convertValue(orderDetail, new TypeReference<>() {});
    }

    @Override
    public void updateOrderStatus(long orderID, OrderStatus orderStatus) {
        Optional<OrderDetails> orderDetailsOptional = orderDetailsRepository.findById(orderID);
        if(orderDetailsOptional.isPresent()) {
            OrderDetails orderDetails = orderDetailsOptional.get();
            orderDetails.setOrderStatus(orderStatus);
            orderDetailsRepository.save(orderDetails);
        }
    }

    @Override
    public void deleteOrderDetails(long orderID) {
        orderDetailsRepository.deleteById(orderID);
    }
}
