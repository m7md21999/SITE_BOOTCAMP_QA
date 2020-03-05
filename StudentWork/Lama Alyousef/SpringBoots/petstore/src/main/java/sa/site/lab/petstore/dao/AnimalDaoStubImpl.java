package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Data Access for Pet Domain Object
 *
 * CRUD
 *
 * Stereotypes:
 *
 * Component
 * Service
 * Repository
 * Controller
 *
 * Stub: Brut Force / Hard Coded
 * Mock: Mockito / EasyMock
 * */

@Repository
public class AnimalDaoStubImpl implements AnimalDao {
        // LAP: Creat Map of Animals.
    private Map <Integer,Animal> animals = new HashMap<>();

    private int counter = 0;

    public AnimalDaoStubImpl(){
        // LAB: Populate Map with 3+ Animals.
        animals.put(++counter, new Cat("Bella"));
        animals.put(++counter, new Cat("Kitty"));
        animals.put(++counter, new Dog("Fido"));
    }


     // Method level
    public Animal findById(int id) {
        System.out.println("* AnimalDao: " + id);
         // LAB: pull SINGLE animal from Map
        if(animals.containsKey(id)){
        return animals.get(id); }
        else{
            return null;
        }
    }

    public List<Animal> findAll(){
        System.out.println(" * AnimalDao.findAll()");

        // LAB: return List<Animal> from Map
        ArrayList<Animal> valueList = new ArrayList<Animal>(animals.values());

        return valueList;
    }

    @Override
    public void add(Animal animal){
        System.out.println("* AnimalDaoDatabaseImpl.add() ");
        animals.put(++counter, animal);
    }
}