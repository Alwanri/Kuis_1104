/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1104.service;

import com.Kuis1104.entity.nilai_1104;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis1104.repo.nilai_1104Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("nilai_1104Service")
@Transactional
public class nilai_1104Service {

    @Autowired
    private nilai_1104Repo repo;

    public nilai_1104 insertOrUpdate(nilai_1104 product) {
        return repo.save(product);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<nilai_1104> findAll() {
        return repo.findAllProduct();
    }

    public List<nilai_1104> findByCategory(Long categoryId) {
        return repo.findByCategory(categoryId);
    }

    public List<nilai_1104> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
