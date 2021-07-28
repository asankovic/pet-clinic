package org.foi.asankovic.sfgpetclinic.repositories;

import org.foi.asankovic.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sankovic on 28.7.2021.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
