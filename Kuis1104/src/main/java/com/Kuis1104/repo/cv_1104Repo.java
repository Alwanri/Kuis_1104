/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1104.repo;

import com.Kuis1104.entity.cv_1104;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface cv_1104Repo extends CrudRepository<cv_1104, Long> {

    @Query("select c from Category c")
    public List<cv_1104> findAllcv_1104();
}
