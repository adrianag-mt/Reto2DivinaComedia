
package com.usa.divinacomedia.controller;

import com.usa.divinacomedia.model.HairProduct;
import com.usa.divinacomedia.model.User;
import java.util.Date;
import java.util.Map;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author drida
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="orders")
public class Order {

    @Id
    private Integer id;
    private Date registerDay;
    private String status;
    private User salesMan;

    private Map<String, HairProduct> products;
    private Map<String, Integer> quantities;

}

