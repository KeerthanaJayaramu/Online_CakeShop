package com.edubridge.cakeshop.entity;

import com.edubridge.cakeshop.constant.EntityFields;
import com.edubridge.cakeshop.constant.OrderStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = EntityFields.ORDER_DETAILS)
public class OrderDetails {

    @Id
    @Column(name = EntityFields.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = EntityFields.ORDER_ID)
    private String order_id;

    @Column(name = EntityFields.STATUS)
    private OrderStatus orderStatus;

    @Column(name = EntityFields.DELIVERY_TIME)
    private Date delivery_time;

    @Column(name = EntityFields.ORDER_DATE)
    private Date order_date;

    @Column(name = EntityFields.CREATED_DATE)
    private Date created_date;

    @Column(name = EntityFields.UPDATED_DATE)
    private Date updated_date;

    @Column(name = EntityFields.DELETED_DATE)
    private Date deleted_date;

    @Column(name = EntityFields.DELETED_BY)
    private String deleted_by;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = EntityFields.CUSTOMER_DETAILS_ID, nullable = false)
    private CustomerDetails customerDetails;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = EntityFields.CAKE_DETAILS_ID, nullable = false)
    private CakeDetails cakeDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(Date delivery_time) {
		this.delivery_time = delivery_time;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public Date getDeleted_date() {
		return deleted_date;
	}

	public void setDeleted_date(Date deleted_date) {
		this.deleted_date = deleted_date;
	}

	public String getDeleted_by() {
		return deleted_by;
	}

	public void setDeleted_by(String deleted_by) {
		this.deleted_by = deleted_by;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public CakeDetails getCakeDetails() {
		return cakeDetails;
	}

	public void setCakeDetails(CakeDetails cakeDetails) {
		this.cakeDetails = cakeDetails;
	}
}
