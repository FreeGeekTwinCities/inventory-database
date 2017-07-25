package org.freegeektwincities.inventorydatabase.services;

import org.freegeektwincities.inventorydatabase.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by boun on 7/25/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
