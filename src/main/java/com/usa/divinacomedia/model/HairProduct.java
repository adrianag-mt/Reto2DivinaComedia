/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.divinacomedia.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author drida
 */
@Document(collection = "hairproducts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HairProduct {

    @Id
    @JsonProperty("reference")
    private String id;
    
    @JsonProperty("brand")
    private String brand;
    
    @JsonProperty("category")
    private String category;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("description")
    private String description;

    @JsonProperty("availability")
    private boolean availability = true;

    @JsonProperty("price")
    private double price;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("photography")
    private String photography;

}

