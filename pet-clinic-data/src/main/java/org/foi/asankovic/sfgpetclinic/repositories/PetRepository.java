package org.foi.asankovic.sfgpetclinic.repositories;

import org.foi.asankovic.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sankovic on 28.7.2021.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
