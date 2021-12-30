/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service2.ManageRequest.RequestReposotries;

import com.Service2.ManageRequest.model.donorrequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface RequestReposotries extends JpaRepository<donorrequest,Integer>{

    public donorrequest getRequestByDonorId(int donorId);
    
    public donorrequest getRequestByStatus (int status);
    
    
}


