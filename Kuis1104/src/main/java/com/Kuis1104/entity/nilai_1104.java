/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1104.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "nilai_1104")
public class nilai_1104 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String name;
   
    @Column(length = 255, nullable = true)
    private String nilai_harian;
    
    @Column(length = 255, nullable = true)
    private String nilai_ulangan;
    
    @Column(length = 255, nullable = true)
    private String nilai_ujian;
    
    @ManyToOne
    private cv_1104 cv_1104;
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getnilai_harian() {
        return nilai_harian;
    }

    /**
     * @param description the description to set
     */
    public void setnilai_harian(String nilai_harian) {
        this.nilai_harian = nilai_harian;
    }
    
       /**
     * @return the description
     */
    public String getnilai_ulangan() {
        return nilai_ulangan;
    }

    /**
     * @param description the description to set
     */
    public void setnilai_ulangan(String nilai_ulangan) {
        this.nilai_harian = nilai_harian;
    }

       /**
     * @return the description
     */
    public String getnilai_ujian() {
        return nilai_ujian;
    }

    /**
     * @param description the description to set
     */
    public void setnilai_ujian(String nilai_ujian) {
        this.nilai_ujian = nilai_ujian;
    }

}
