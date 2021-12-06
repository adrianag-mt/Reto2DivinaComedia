/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.divinacomedia.repository.crud;

import com.usa.divinacomedia.model.HairProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author drida
 */
public interface HairProductCrudRepository extends MongoRepository<HairProduct,String>{ 
    
}
