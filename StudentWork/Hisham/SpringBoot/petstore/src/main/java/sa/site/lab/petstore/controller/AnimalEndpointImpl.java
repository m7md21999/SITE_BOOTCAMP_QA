package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

<<<<<<< Updated upstream
import java.util.List;
=======
import javax.persistence.PostUpdate;
import java.util.List;
import java.util.Map;
>>>>>>> Stashed changes


@RestController
@RequestMapping("/api/animals")
public class AnimalEndpointImpl
{
    @Autowired
    private AnimalService service;


    @GetMapping("/")
    public List<Animal> findAll()
    {
        List<Animal> animals = service.findAll();
        return animals;
    }

    @GetMapping("/{id}")
    public Animal findById(@PathVariable int id, Model model)
    {
        return service.findById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Animal create(@RequestBody Animal animal)
    {
        service.add(animal);
        return animal;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable int id)
    {
        service.delete(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@PathVariable int id,@RequestBody Animal animal)
    {
        service.update(id,animal);
    }

}
