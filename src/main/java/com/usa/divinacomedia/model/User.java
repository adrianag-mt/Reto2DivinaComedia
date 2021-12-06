/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.divinacomedia.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author drida entidad user
 */
// lombok independencia relaiza los getter yu setter,encapsulamiento , anotación data
@Data
@NoArgsConstructor //construtor vacio 
@AllArgsConstructor // contructor con argumentos
@Document(collection="user")
public class User {
    
    @Id // id 
   // @GeneratedValue(strategy= GenerationType.IDENTITY)//autoincremnetable del id  
    private Integer id;
private String identification;

private String name;

private Date birthtDay;

private String monthBirthtDay;

private String address;

private String cellPhone;

private String email;

private String password;

private String zone;

private String type;
    //construtor vacio 

    }

        
    