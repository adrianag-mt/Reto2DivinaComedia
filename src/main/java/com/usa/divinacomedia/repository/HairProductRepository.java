/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.divinacomedia.repository;

import com.usa.divinacomedia.model.HairProduct;
import com.usa.divinacomedia.repository.crud.HairProductCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author drida
 */
@Repository
public class HairProductRepository {

    /**
     * Inyectar dependencias
     */
    @Autowired
    private HairProductCrudRepository repository;
    
    
     /**
     * Obtener registro por Id
     * @param id
     * @return
     */
    public Optional<HairProduct> getProductById(String id){
        return repository.findById(id);
    }
    
    /**
     * 
     * @param reference
     * @return 
     */
    public Optional<HairProduct> getByReference(String reference) {
        return repository.findById(reference);
    }

    /**
     * Obtener registro
     * @return
     */
    public List<HairProduct> getAll(){
        return (List<HairProduct>) repository.findAll();
    }
    
     /**
     * Guardar registro
     * @param hairproduct
     * @return
     */
    public HairProduct save(HairProduct hairproduct){
        return repository.save(hairproduct);
    }

    /**
     * Guardar registro
     * @param id
     */
    public void delete(String id){
        repository.deleteById(id);
    }
    
 
    
    
}