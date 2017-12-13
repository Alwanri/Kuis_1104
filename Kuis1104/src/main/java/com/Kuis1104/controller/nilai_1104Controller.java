/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1104.controller;

import com.Kuis1104.entity.nilai_1104;
import com.Kuis1104.service.nilai_1104Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Kuis1104.repo.nilai_1104Repo;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/Nilai")
public class nilai_1104Controller {
    
    @Autowired
    private nilai_1104Service nilai_1104Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public nilai_1104 insertOrUpdate(@RequestBody nilai_1104 product){
        return nilai_1104Service.insertOrUpdate(product);
    }
  
}
