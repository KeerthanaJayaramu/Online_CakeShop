package com.edubridge.cakeshop.model;

import com.edubridge.cakeshop.constant.OrderStatus;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDetailResponse {
    private String orderId;
    private CakeDetailResponse cakeDetails;
    private CustomerDetailResponse customerDetails;
    private OrderStatus orderStatus;
    private Date expectedDeliveryTime;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public CakeDetailResponse getCakeDetails() {
		return cakeDetails;
	}
	public void setCakeDetails(CakeDetailResponse cakeDetails) {
		this.cakeDetails = cakeDetails;
	}
	public CustomerDetailResponse getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetailResponse customerDetails) {
		this.customerDetails = customerDetails;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getExpectedDeliveryTime() {
		return expectedDeliveryTime;
	}
	public void setExpectedDeliveryTime(Date expectedDeliveryTime) {
		this.expectedDeliveryTime = expectedDeliveryTime;
	}
}
