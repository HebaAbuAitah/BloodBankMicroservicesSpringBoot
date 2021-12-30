/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AbuAitah.Donor.controllers;

import com.AbuAitah.Donor.models.donor_data;
import com.AbuAitah.Donor.servcices.DonorService;
import static java.lang.Math.log;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/donor_data")
@Slf4j
public class DonorController {
    
    @Autowired
    private DonorService dononrService;
    
    @PostMapping("/")
    public donor_data saveDonor(@RequestBody donor_data donor){
        log.info("Inside saveDonor of DonorController");
        return dononrService.saveDonor(donor);
        
    }
   
    
    @GetMapping("/")
    public List<donor_data> getRequest() {
        return (List<donor_data>) dononrService.getdonor();
    }
    
    
}
