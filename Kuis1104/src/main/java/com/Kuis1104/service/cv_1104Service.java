/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1104.service;

import com.Kuis1104.entity.cv_1104;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis1104.repo.cv_1104Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("cv_1104Service")
@Transactional
public class cv_1104Service {

    @Autowired
    private cv_1104Repo repo;

    public cv_1104 insert(cv_1104 cv_1104) {
        return repo.save(cv_1104);
    }
    
    public cv_1104 update(cv_1104 cv_1104) {
        return repo.save(cv_1104);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1104 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1104> getAll(){
        return repo.findAllcv_1104();
    }
}
