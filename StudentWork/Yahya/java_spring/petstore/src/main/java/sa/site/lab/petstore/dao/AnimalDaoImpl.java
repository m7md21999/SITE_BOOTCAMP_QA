package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Data access for Pet Domain Object
 * <p>
 * CRUD
 * <p>
 * Stereotype:
 * <p>
 * Component
 * Service
 * Repository
 * Controller
 */
@Repository
public class AnimalDaoImpl implements AnimalDao {

    // LAB: Create Map<?, Animal> of Animals.
    private Map<Integer, Animal> animals;

    public AnimalDaoImpl() {
        // LAB: Populate Map with 3+ Animals.
        animals = new HashMap<>();

        animals.put(1, new Dog("Fido"));
        animals.put(2, new Cat("Kitty"));
    }

    // Method level
    public Animal findPet(int id) {
        System.out.println("* AnimalDao: " + id);

        // LAB: pull SINGLE animal from Map
        if(animals.containsKey(id)) {
            return animals.get(id);
        } else {
            return null;
        }
    } // end findPet method


    public List<Animal> findAll() {
        System.out.println("* AnimalDao.findAll()");
        // LAB: return List<Animal> from Map
        return animals.values() // List of Keys
                .stream() // Java 8 Stream API
                .collect(Collectors.toList()); // converting steam to a List
    }

} // The End..
