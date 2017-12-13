/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1104.controller;

import com.Kuis1104.entity.cv_1104;
import com.Kuis1104.service.cv_1104Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv")
public class cv_1104Controller {

    @Autowired
    private cv_1104Service cv_1104Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1104 insert(@RequestBody cv_1104 cv_1104) {
        return cv_1104Service.insert(cv_1104);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1104 update(@RequestBody cv_1104 cv_1104) {
        return cv_1104Service.update(cv_1104);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1104Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv_1104 getById(@PathVariable("id") Long id){
        return cv_1104Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1104> getAll(){
        return cv_1104Service.getAll();
    }
}
