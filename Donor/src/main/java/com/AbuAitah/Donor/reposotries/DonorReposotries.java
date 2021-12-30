/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AbuAitah.Donor.reposotries;

import com.AbuAitah.Donor.models.donor_data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface DonorReposotries extends JpaRepository<donor_data,Integer>{

    public donor_data findDonorById(Integer DonorID);
    
    
}
