package sa.site.lab.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Dog;
import sa.site.lab.petstore.dao.AnimalDao;

import java.util.List;
import java.util.Map;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired @Qualifier("animalServiceStub")
    private AnimalDao dao;

    public Animal findPet(int id) {
        System.out.println("AnimalService.findPet:" + id);

        return dao.findPet(id);
    } //End findPet method

    public List<Animal> findAll() {
        System.out.println("AnimalService.findAll()");

        return dao.findAll();
    }
//    }
//    public void fillMethod(){
//        dao.fillMethod();
//    }

}
