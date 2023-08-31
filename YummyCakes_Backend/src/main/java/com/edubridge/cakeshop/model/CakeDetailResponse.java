package com.edubridge.cakeshop.model;


import com.edubridge.cakeshop.constant.CakeCategory;
import com.edubridge.cakeshop.constant.CakeStatus;
import lombok.Data;

@Data
public class CakeDetailResponse {
    private long id;
    private String name;
    private CakeCategory category;
    private long price;
    private double discount;
    private String image;
    private double weight;
    private CakeStatus status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CakeCategory getCategory() {
		return category;
	}
	public void setCategory(CakeCategory category) {
		this.category = category;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public CakeStatus getStatus() {
		return status;
	}
	public void setStatus(CakeStatus status) {
		this.status = status;
	}
}
