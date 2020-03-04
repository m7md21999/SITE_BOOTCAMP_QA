package sa.site.lab.petstore.service;

import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;


public interface AnimalService {
    public Animal findPet(int id);

    List<Animal> findAll();
}
