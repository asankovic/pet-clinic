package org.foi.asankovic.sfgpetclinic.services.map;

import org.foi.asankovic.sfgpetclinic.model.Owner;
import org.foi.asankovic.sfgpetclinic.model.Speciality;
import org.foi.asankovic.sfgpetclinic.model.Vet;
import org.foi.asankovic.sfgpetclinic.services.CrudService;
import org.foi.asankovic.sfgpetclinic.services.SpecialtyService;
import org.foi.asankovic.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {

        if(vet.getSpecialities().size() > 0){
            vet.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
