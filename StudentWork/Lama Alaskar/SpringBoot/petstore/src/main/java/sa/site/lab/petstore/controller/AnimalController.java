package sa.site.lab.petstore.controller;

import sa.site.lab.petstore.domain.Animal;
import java.util.List;

public interface AnimalController {

    Animal findById(int id);

    List<Animal> findAll();

    void add(Animal animal);


} // The End...
