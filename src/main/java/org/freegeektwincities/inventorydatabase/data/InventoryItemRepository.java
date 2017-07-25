package org.freegeektwincities.inventorydatabase.data;

import org.freegeektwincities.inventorydatabase.model.InventoryItem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tom on 5/24/17.
 */
public interface InventoryItemRepository extends CrudRepository<InventoryItem, Long> {
}
