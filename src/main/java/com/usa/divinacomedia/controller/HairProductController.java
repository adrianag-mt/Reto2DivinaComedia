/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.divinacomedia.controller;

import com.usa.divinacomedia.model.HairProduct;
import com.usa.divinacomedia.service.HairProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author drida
 */
@RestController
@RequestMapping("hairproducts")
@CrossOrigin(origins = "*", methods= {GET, POST, PUT, DELETE})
public class HairProductController {
    
    /**
     * Instancia con @Autowired de la clase servicio service.
     */
    @Autowired
    private HairProductService service;
    
  /**
     * Metodo GET
     * @return
     */
    @GetMapping("/all") //GET
    public List<HairProduct> getHairProducts(){
        return service.getAll();
    }

    /**
     * Metodo POST
     * @param hairProduct
     * @return
     */
    @PostMapping("/new") //POST
    @ResponseStatus(HttpStatus.CREATED)
    public HairProduct save(@RequestBody HairProduct hairProduct){
        return service.save(hairProduct);
    }
    
    
    /**
     * Metodo PUT que actualiza un usuario
     *
     * @param hairProduct
     * @return
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public HairProduct  update(@RequestBody HairProduct hairProduct) {
        return service.update(hairProduct);
    }

    /**
     * Metodo DELETE que actualiza un usuario
     * @param id
     * @return 
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

}

