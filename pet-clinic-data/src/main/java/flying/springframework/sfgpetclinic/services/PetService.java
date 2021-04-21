package flying.springframework.sfgpetclinic.services;

import flying.springframework.sfgpetclinic.model.Owner;
import flying.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
