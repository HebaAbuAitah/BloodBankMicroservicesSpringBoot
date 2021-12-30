/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AbuAitah.Donor.servcices;

import com.AbuAitah.Donor.models.donor_data;
import com.AbuAitah.Donor.reposotries.DonorReposotries;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
@Slf4j
public class DonorService {
    @Autowired
    private DonorReposotries donorReposotries;

    public donor_data saveDonor(donor_data donor) {
       log.info("Inside saveDonor of DonorService"); 
       return donorReposotries.save(donor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   public donor_data findDonorById(Integer DonorID) {
       log.info("Inside saveDonor of DonorService"); 
       return donorReposotries.findDonorById(DonorID);
    }
    
    public List<donor_data> getdonor() {
        return donorReposotries.findAll();
    }
}
