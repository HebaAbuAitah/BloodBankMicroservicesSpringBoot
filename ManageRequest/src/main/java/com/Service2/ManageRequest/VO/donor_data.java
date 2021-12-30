/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service2.ManageRequest.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author HP
 */


  
@Data
@AllArgsConstructor
@NoArgsConstructor

public class donor_data {
    
 

    
    
    private Integer DonorID;
    private String  DonorName;
    private Integer PhoneNumber;
    private Integer MobileNumber;
    private String  DirtheDay;
    private Integer  BoundID;
    private String    gender; 
   // private  List<Question>  QuestionID;
    //private  Integer  QuestionID;
    
}
    
    

