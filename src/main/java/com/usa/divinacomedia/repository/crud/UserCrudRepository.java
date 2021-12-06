/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.divinacomedia.repository.crud;

import com.usa.divinacomedia.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author drida
 * abtraccion , es un modelo una idea de algo , hereda los atributos de la interfaz crud repository (tae las 
 * operaciones basicas del crud). se pueden implemntar nueva operaciones para validar datos 
 * implemntar nuevas 
 */
public interface UserCrudRepository  extends MongoRepository<User, Integer>{
    
    //validar a nivel de usuario Optional, si no lo encuentra ni devulva nada , son como consulta para la db
    /**
     * 
     * @param name
     * @return 
     */
    public Optional<User>findByName(String name);
    /**
     * 
     * @param name
     * @param email
     * @return 
     */
    public List <User> findByNameOrEmail(String name,String email);
    /**
     * Buscar un usuario por email
     * @param email
     * @return 
     */
    public Optional<User>findByEmail(String email);
    /**
     * Buscar un usuario por email y password
     * @param email
     * @param password
     * @return 
     */
    public Optional<User>findByEmailAndPassword(String email,String password);

     /**
     * 
     * @param id
     * @param email
     * @param name
     * @return
     */
    public List<User> findByIdOrEmailOrName(Integer id, String email, String name);
    
}
    