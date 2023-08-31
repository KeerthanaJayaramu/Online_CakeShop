package com.edubridge.cakeshop.service;

import com.edubridge.cakeshop.constant.CakeStatus;
import com.edubridge.cakeshop.model.CakeDetailResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CakeServiceI {

    List<CakeDetailResponse> getCakeDetails(Pageable pageable);

    void saveCakeDetails(CakeDetailResponse cakeDetailResponse);

    void updateCakeDetails(CakeDetailResponse cakeDetailResponse);

    void updateCakeStatus(long cakeId, CakeStatus cakeStatus);

    void deleteCakeDetails(long cakeId);
}