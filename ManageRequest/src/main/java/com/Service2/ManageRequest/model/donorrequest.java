/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Service2.ManageRequest.model;

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
@Entity     
@Data
@AllArgsConstructor
@NoArgsConstructor
public class donorrequest {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    private Integer DonorID;
    private Integer  RequestID;
    private Integer Status;
    
    
}
