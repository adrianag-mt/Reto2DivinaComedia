/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.divinacomedia.repository;

import com.usa.divinacomedia.model.User;
import com.usa.divinacomedia.repository.crud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author drida , capa repositorio, la cual conecta con los datos 
 */
@Repository
public class UserRepository {
    
    @Autowired // inyectamos independencias 
    private UserCrudRepository repository;
    
    
    /**
     * 
     * @return 
     */
    public List<User> getAll(){
        return (List<User>) repository.findAll();
        
    }
    /**
     * 
     * @param id
     * @return 
     */
    public Optional<User> getUserById (Integer id){
        return repository.findById(id);
        
    }
    /**
     * 
     * @param name
     * @return 
     */
    
    public Optional<User>getUserByName(String name){
        return repository.findByName(name);
    }
    /**
     * Acceso al metodo 
     * @param email
     * @return 
     */
    public Optional<User>getUserByEmail(String email){
        return  repository.findByEmail(email);
    }
    /**
     * Metodo que recibe un email y un password para cosnultar si existe o no
     * @param name
     * @param email
     * @return 
     */
        
    public List<User>getUserByNameOrEmail(String name,String email){
        return repository.findByNameOrEmail(name, email);
        
    }
    /**
     * 
     * @param email
     * @param password
     * @return 
     */
    public Optional<User>getUserByEmailAndPassword(String email,String password){
        return repository.findByEmailAndPassword(email, password);
        
    }
    /**
     * 
     * @param user
     * @return 
     */
    public User save(User user){
        return repository.save(user);
    }
       public void update(User user) {
        repository.save(user);
    }
    
 
    /**
     * Eliminar un registro
     * @param id 
     */
    public void delete(Integer id){
        repository.deleteById(id);
    }
    
    
    /**
     * 
     * @param id
     * @param email
     * @param name
     * @return
     */
    public List<User> getUserByIdOrEmailOrName(Integer id, String email, String name){
        return repository.findByIdOrEmailOrName(id,email,name);
    }


    
    
}
