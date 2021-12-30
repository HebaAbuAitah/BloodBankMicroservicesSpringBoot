/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service2.ManageRequest.RequestService;

import com.Service2.ManageRequest.RequestReposotries.RequestReposotries;
import com.Service2.ManageRequest.VO.ResponseTamplateVO;
import com.Service2.ManageRequest.VO.donor_data;
import com.Service2.ManageRequest.model.donorrequest;
import static java.lang.Math.log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author HP
 */
@Service
@Slf4j
public class RequestService {
    @Autowired
    private RequestReposotries requestReposotries;
    
    @Autowired
    private RestTemplate restTemplate;

    public donorrequest saveRequest(donorrequest request) {
      // log.info("Inside saveDonor of DonorService"); 
       return requestReposotries.save(request); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  /*  public Donor findDonorById(Integer DonorID) {
       log.info("Inside saveDonor of DonorService"); 
       return donorReposotries.findDonorById(DonorID);
    }*/
    
    

    public ResponseTamplateVO updateBoundIdAtDonor(int donorId, int boundId) {
  ResponseTamplateVO vo = new ResponseTamplateVO();
  // donor donor = get donor data by donor id
  // put bound id in return donor 
   // save donor value 
   // change request statue to complete
  
        restTemplate.put("http://localhost:9098/donor_data/boundId=" + boundId,
                donor_data.class);
   
        return vo;
    }

    public donorrequest getRequestByStatus(Integer status) {
   return requestReposotries.getRequestByStatus(status);}
        
    
    
    
}
