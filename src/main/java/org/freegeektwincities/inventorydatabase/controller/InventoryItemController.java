package org.freegeektwincities.inventorydatabase.controller;

import org.freegeektwincities.inventorydatabase.data.InventoryItemRepository;
import org.freegeektwincities.inventorydatabase.model.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tom on 5/24/17.
 */
@Controller
@RequestMapping("inventoryitem/")
public class InventoryItemController {

    @Autowired
    private InventoryItemRepository inventoryItemRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody List<InventoryItem> getAdd() {
        List<InventoryItem> inventoryItems = new ArrayList<>();
        inventoryItemRepository.findAll().forEach(inventoryItems::add);
        return inventoryItems;
    }
}

