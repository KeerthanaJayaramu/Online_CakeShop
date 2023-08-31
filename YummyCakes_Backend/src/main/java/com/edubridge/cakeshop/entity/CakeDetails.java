package com.edubridge.cakeshop.entity;

import com.edubridge.cakeshop.constant.CakeCategory;
import com.edubridge.cakeshop.constant.CakeStatus;
import com.edubridge.cakeshop.constant.EntityFields;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = EntityFields.CAKE_DETAILS)
public class CakeDetails {
    @Id
    @Column(name = EntityFields.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = EntityFields.NAME)
    private String name;

    @Column(name = EntityFields.PRICE)
    private Long price;

    @Column(name = EntityFields.DISCOUNT)
    private Double discount;

    @Column(name = EntityFields.IMAGE)
    private String image;

    @Column(name = EntityFields.WEIGHT)
    private Double weight;

    @Column(name = EntityFields.CATEGORY)
    private CakeCategory category;

    @Column(name = EntityFields.STATUS)
    private CakeStatus status;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public CakeCategory getCategory() {
		return category;
	}

	public void setCategory(CakeCategory category) {
		this.category = category;
	}

	public CakeStatus getStatus() {
		return status;
	}

	public void setStatus(CakeStatus status) {
		this.status = status;
	}

	
}