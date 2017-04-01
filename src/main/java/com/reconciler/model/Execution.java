/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reconciler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author azza
 */

@Entity
@Table(name = "execution")
public class Execution {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
   
}
