package org.freegeektwincities.inventorydatabase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by tom on 5/24/17.
 */
@Entity
public class InventoryItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long uniqueId;

    public String manufacturer;

    public String model;


}
