package com.edubridge.cakeshop.controller;

import com.edubridge.cakeshop.constant.ControllerMappingName;
import com.edubridge.cakeshop.constant.EntityFields;
import com.edubridge.cakeshop.constant.OrderStatus;
import com.edubridge.cakeshop.model.OrderDetailResponse;
import com.edubridge.cakeshop.service.OrderServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = ControllerMappingName.ORDER_MAPPING)
public class OrderController {

    @Autowired
    OrderServiceI orderServiceI;

    @GetMapping(value = {ControllerMappingName.GET_ORDER_DETAIL}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<OrderDetailResponse> getOrderDetails(@RequestParam(defaultValue = "10") int size,
                                                     @RequestParam(defaultValue = "0") int page) {
        return orderServiceI.getOrderDetails(PageRequest.of(page, size, Sort.Direction.DESC, EntityFields.UPDATED_DATE));
    }

    @GetMapping(value = {ControllerMappingName.GET_ORDER_BY_ID}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public OrderDetailResponse getOrderDetail(@RequestParam(defaultValue = "10") long orderID) {
        return orderServiceI.getOrderDetail(orderID);
    }

    @PostMapping(value = {ControllerMappingName.UPDATE_ORDER_STATUS})
    @ResponseBody
    public String updateOrderStatus(@RequestParam(name = "orderID") int orderID, @RequestParam(name = "status") OrderStatus orderStatus) {
        System.out.println("cakeID : "+ orderID + "cakeStatus: "+ orderStatus);
        orderServiceI.updateOrderStatus(orderID, orderStatus);
        return "Order status updated successfully...!";
    }

    @DeleteMapping(value = {ControllerMappingName.DELETE_ORDER_DETAIL})
    @ResponseBody
    public String deleteOrderDetails(@RequestParam(name = "orderID") int orderID) {
        System.out.println(orderID);
        orderServiceI.deleteOrderDetails(orderID);
        return "Cake detail deleted successfully...!";
    }
}
