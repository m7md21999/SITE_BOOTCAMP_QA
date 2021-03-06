package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Data access for pet domain object
 * <p>
 * CRUD
 * <p>
 * Stereotype
 * <p>
 * Component
 * Services
 * Repository
 * Controller
 */
@Repository
public class AnimalDaoStubImpl implements AnimalDao {// animalDao

    // Map
/*    Map <Object, Animal> animals = new HashMap<>();
    animals.put ("foo","foo");*/

    private Map<Integer, Animal> animals;
    private int counter = 0;

    public AnimalDaoStubImpl() {
        animals = new HashMap<>();
        animals.put(++counter, new Animal("kitty"));
        animals.put(++counter, new Animal("Puppy"));
    }

    // Method Level
    public Animal findById(int id) {
        System.out.println("* AnimalDao: " + id);

        if (animals.containsKey(id)) {
            return animals.get(id);
        } else {
            return null;
        }
        //return new Cat("Kitty");
    }//End findPet method

    @Override
    public List<Animal> findAll() {
        System.out.println(" *AnimalDao.findAll()");
        return animals.values().stream().collect(Collectors.toList());
        //return (List<Animal>)animals.values();
        // from map
    }
    @Override
    public void add (Animal animal) {
        System.out.println(" *AnimalDao.add()");
        animals.put(++counter, animal);
        //throw new RuntimeException("Not Available Yet");

    }
    @Override
    public boolean delete(int id) {
        System.out.println("* AnimalDao: " + id);

        if (animals.containsKey(id)) {
            animals.remove(id);
            return true;
        } else {
            return false;
        }
        //return new Cat("Kitty");
    }//En
}// The End..
