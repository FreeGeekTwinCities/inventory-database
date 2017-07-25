package org.freegeektwincities.inventorydatabase.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by tom on 5/22/17.
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:inventory.properties"),
        @PropertySource("file:$APP_PROPERTIES/inventory.properties")
})
public class InventoryConfig {

}
