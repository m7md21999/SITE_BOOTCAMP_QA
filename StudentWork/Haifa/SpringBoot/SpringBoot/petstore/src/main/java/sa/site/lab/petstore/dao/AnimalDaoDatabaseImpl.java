package sa.site.lab.petstore.dao;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import java.util.List;



@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {

    public Animal findPet(int id) {
        System.out.println("* AnimalDaoDatabaseImpl.findPet" + id);
        throw new RuntimeException("Not available yet");
    }

    public List<Animal> findAll() {

        System.out.println("* AnimalDaoDatabaseImpl.findAll" );
        throw new RuntimeException("Not available yet");
    }
}