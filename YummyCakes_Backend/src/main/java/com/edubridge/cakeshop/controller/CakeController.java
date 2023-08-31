package com.edubridge.cakeshop.controller;

import com.edubridge.cakeshop.constant.CakeStatus;
import com.edubridge.cakeshop.constant.ControllerMappingName;
import com.edubridge.cakeshop.constant.EntityFields;
import com.edubridge.cakeshop.model.CakeDetailResponse;
import com.edubridge.cakeshop.service.CakeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@Controller
@RequestMapping(value = ControllerMappingName.ADMIN_MAPPING)
public class CakeController {

    @Autowired
    CakeServiceI adminServiceI;

    @GetMapping(value = {ControllerMappingName.GET_CAKE_DETAIL}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<CakeDetailResponse> getCakeDetails(@RequestParam(defaultValue = "10") int size,
                                                   @RequestParam(defaultValue = "0") int page) {
      return adminServiceI.getCakeDetails(PageRequest.of(page, size, Sort.Direction.DESC, EntityFields.UPDATED_DATE));
    }

    @PutMapping(value = {ControllerMappingName.SAVE_CAKE_DETAIL})
    @ResponseBody
    public String saveCakeDetails(@RequestBody CakeDetailResponse cakeDetailResponse) {
        adminServiceI.saveCakeDetails(cakeDetailResponse);
        return "Cake detail saved successfully...!";
    }

    @PostMapping(value = {ControllerMappingName.UPDATE_CAKE_DETAIL})
    @ResponseBody
    public String updateCakeDetails(@RequestBody CakeDetailResponse cakeDetailResponse) {
        adminServiceI.updateCakeDetails(cakeDetailResponse);
        return "Cake detail updated successfully...!";
    }

    @PostMapping(value = {ControllerMappingName.UPDATE_CAKE_STATUS})
    @ResponseBody
    public String updateCakeStatus(@RequestParam(name = "cakeId") long cakeId, @RequestParam(name = "status") CakeStatus cakeStatus) {
       adminServiceI.updateCakeStatus(cakeId, cakeStatus);
        return "Cake status updated successfully...!";
    }

    @DeleteMapping(value = {ControllerMappingName.DELETE_CAKE_DETAIL})
    @ResponseBody
    public String deleteCakeDetails(@RequestParam(name = "cakeId") long cakeId) {
        adminServiceI.deleteCakeDetails(cakeId);
        return "Cake detail deleted successfully...!";
    }
}