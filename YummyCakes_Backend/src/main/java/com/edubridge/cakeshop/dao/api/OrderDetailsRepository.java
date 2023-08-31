package com.edubridge.cakeshop.dao.api;

import com.edubridge.cakeshop.entity.CakeDetails;
import com.edubridge.cakeshop.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
}