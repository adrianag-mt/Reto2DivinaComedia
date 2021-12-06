/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.divinacomedia.service;

import com.usa.divinacomedia.model.HairProduct;
import com.usa.divinacomedia.repository.HairProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author drida
 */
@Service
public class HairProductService {
    
    /**
     * 
     */
    @Autowired
    private HairProductRepository repository;
    

     /**
     * Obtener todos los registros
     * @return
     */
    public List<HairProduct> getAll(){
        return repository.getAll();
    }

    
    /**
     * 
     * @param product
     * @return
     */
    public HairProduct save(HairProduct product){
        if(product.getId()==null){
            return product;
        }else{
            Optional<HairProduct> existsProduct = repository.getByReference(product.getId());
            if(existsProduct.isEmpty()){
                return repository.save(product);
            }else {
                return product;
            }
        }
    }

    
    public HairProduct update(HairProduct hairproduct){
        Optional<HairProduct> existsProduct = repository.getByReference(hairproduct.getId());
        if(existsProduct.isPresent()){
            if (hairproduct.getId()!=null){
                existsProduct.get().setId(hairproduct.getId());
            }
            if (hairproduct.getBrand()!=null){
                existsProduct.get().setBrand(hairproduct.getBrand());
            }
            if (hairproduct.getCategory()!=null){
                existsProduct.get().setCategory(hairproduct.getCategory());
            }    
            if (hairproduct.getName()!=null){
                existsProduct.get().setName(hairproduct.getName());
            }
            if (hairproduct.getDescription()!=null){
                existsProduct.get().setDescription(hairproduct.getDescription());
            }
            
            /**
            if (hairproduct.getAvailability()!=null){
                existsProduct.get().setAvailability(hairproduct.Availability());
            }
            */
            if (hairproduct.getPrice()!=0){
                existsProduct.get().setPrice(hairproduct.getPrice());
            }
            if (hairproduct.getQuantity()!=0){
                existsProduct.get().setQuantity(hairproduct.getQuantity());
            }
            if (hairproduct.getPhotography()!=null){
                existsProduct.get().setPhotography(hairproduct.getPhotography());
            }
        
            return repository.save(existsProduct.get());
            
        }else {
            return hairproduct;
        }
    }
    
    /**
     * 
     * @param id
     * @return
     */
    public boolean delete(String id){
        Boolean aBoolean = repository.getByReference(id).map(hairproduct -> {
            repository.delete(hairproduct.getId());
            return true;
        }).orElse(false);
        return aBoolean;
    }

}