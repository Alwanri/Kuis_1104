/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1104.repo;

import com.Kuis1104.entity.nilai_1104;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface nilai_1104Repo extends CrudRepository<nilai_1104, Long>{
    
    @Query("select p from Product p")
    public List<nilai_1104> findAllProduct();
    
    @Query("select p from Product p where p.category.id= :id")
    public List<nilai_1104> findByCategory(@Param("id") Long id);
    
    @Query("select p from Product p where LOWER(p.name) LIKE LOWER(:name)")
    public List<nilai_1104> findByName(@Param("name") String name);
}
