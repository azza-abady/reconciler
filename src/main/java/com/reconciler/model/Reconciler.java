/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reconciler.model;

import javax.persistence.*;


/**
 *
 * @author azza
 */
 
@Entity
@Table(name = "reconciler")
public class Reconciler {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
}
