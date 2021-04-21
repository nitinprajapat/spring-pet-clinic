package flying.springframework.sfgpetclinic.services;

import flying.springframework.sfgpetclinic.model.Owner;
import flying.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
