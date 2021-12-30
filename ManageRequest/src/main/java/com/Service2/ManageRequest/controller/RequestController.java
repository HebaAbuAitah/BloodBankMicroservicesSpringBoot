/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service2.ManageRequest.controller;

import com.Service2.ManageRequest.RequestService.RequestService;
import com.Service2.ManageRequest.VO.ResponseTamplateVO;
import com.Service2.ManageRequest.VO.donor_data;
import com.Service2.ManageRequest.model.donorrequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/donorrequest")
@Slf4j
public class RequestController {
     @Autowired
    private RequestService dononrRequest;
    
    @PostMapping("/")
    public donorrequest saveRequest(@RequestBody donorrequest request){
        //log.info("Inside saveDonor of DonorController");
        return dononrRequest.saveRequest(request);
      
    }
    
     @GetMapping("/status")
    public donorrequest getRequestByStatus(@PathVariable("status") Integer status){
        
        //log.info("Inside saveDonor of DonorController");
        return dononrRequest.getRequestByStatus(status);
      
    }
    
   
    
      @PutMapping("/BoundID,BoundID")
    public ResponseTamplateVO updateBoundIdAtDoner(@PathVariable("BoundID ") Integer donorId,@PathVariable("BoundID") Integer bountId){
       // log.info("Inside updateBoundIdAtDoner of DonorController");
        return dononrRequest.updateBoundIdAtDonor( donorId, bountId);
     
    }
    
    
    
    @GetMapping("/")
    public String getData(){
        return("HH");
    }
    
    
    
}
