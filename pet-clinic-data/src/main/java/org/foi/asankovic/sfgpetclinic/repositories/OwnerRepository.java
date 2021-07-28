package org.foi.asankovic.sfgpetclinic.repositories;

import org.foi.asankovic.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Sankovic on 28.7.2021.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
