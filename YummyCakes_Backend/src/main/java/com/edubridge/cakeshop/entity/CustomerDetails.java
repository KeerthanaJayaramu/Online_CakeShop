package com.edubridge.cakeshop.entity;

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
@Table(name = EntityFields.CUSTOMER_DETAILS)
public class CustomerDetails {
    @Id
    @Column(name = EntityFields.ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = EntityFields.NAME)
    private String name;

    @Column(name = EntityFields.ADDRESS)
    private String address;

    @Column(name = EntityFields.PHONE_NUMBER)
    private String phone_number;

    @Column(name = EntityFields.MAIL)
    private String mail;

    @Column(name = EntityFields.CREATED_DATE)
    private Date created_date;

    @Column(name = EntityFields.UPDATED_DATE)
    private Date updated_date;

    @Column(name = EntityFields.DELETED_DATE)
    private Date deleted_date;

    @Column(name = EntityFields.DELETED_BY)
    private String deleted_by;
}