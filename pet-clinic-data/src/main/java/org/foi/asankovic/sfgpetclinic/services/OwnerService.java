package org.foi.asankovic.sfgpetclinic.services;

import org.foi.asankovic.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastname);
}
