package com.edubridge.cakeshop.service.impl;

import com.edubridge.cakeshop.constant.CakeStatus;
import com.edubridge.cakeshop.dao.api.CakeDetilsRepository;
import com.edubridge.cakeshop.entity.CakeDetails;
import com.edubridge.cakeshop.model.CakeDetailResponse;
import com.edubridge.cakeshop.service.CakeServiceI;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CakeServiceImpl implements CakeServiceI {

    @Autowired
    CakeDetilsRepository cakeDetilsRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public List<CakeDetailResponse> getCakeDetails(Pageable pageable) {
        List<CakeDetails> cakeDetailsList = cakeDetilsRepository.findAll(pageable).getContent();
        return objectMapper.convertValue(cakeDetailsList, new TypeReference<>() {});
    }

    @Override
    public void saveCakeDetails(CakeDetailResponse cakeDetailResponse) {
        CakeDetails cakeDetails = objectMapper.convertValue(cakeDetailResponse, CakeDetails.class);
        cakeDetilsRepository.save(cakeDetails);
    }

    @Override
    public void updateCakeDetails(CakeDetailResponse cakeDetailResponse) {
        Optional<CakeDetails> cakeDetailsOptional = cakeDetilsRepository.findById(cakeDetailResponse.getId());
        if(cakeDetailsOptional.isPresent())
        {
            CakeDetails cakeDetails = cakeDetailsOptional.get();
            cakeDetails.setCategory(cakeDetailResponse.getCategory());
            cakeDetails.setDiscount(cakeDetailResponse.getDiscount());
            cakeDetails.setImage(cakeDetailResponse.getImage());
            cakeDetails.setName(cakeDetailResponse.getName());
            cakeDetails.setWeight(cakeDetailResponse.getWeight());
            cakeDetails.setDiscount(cakeDetailResponse.getDiscount());
            cakeDetails.setPrice(cakeDetailResponse.getPrice());
            cakeDetilsRepository.save(cakeDetails);
        }
    }

    @Override
    public void updateCakeStatus(long cakeId, CakeStatus cakeStatus) {
        Optional<CakeDetails> cakeDetailsOptional = cakeDetilsRepository.findById(cakeId);
        if(cakeDetailsOptional.isPresent()) {
            CakeDetails cakeDetails = cakeDetailsOptional.get();
            cakeDetails.setStatus(cakeStatus);
            cakeDetilsRepository.save(cakeDetails);
        }
    }

    @Override
    public void deleteCakeDetails(long cakeId) {
        cakeDetilsRepository.deleteById(cakeId);
    }
}