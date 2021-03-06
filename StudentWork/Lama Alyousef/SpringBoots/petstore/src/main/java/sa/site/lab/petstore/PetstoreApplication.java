package sa.site.lab.petstore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

/**
 * TODO:
 * 1. Add REST Support
 * 2. Add ADD, Delete function for Thymeleaf
 */

@SpringBootApplication
public class PetstoreApplication {


    public static void main(String[] args) { // Start of MAIN method
        System.out.println("* Start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* End main()");

    } // End of MAIN Method

    // CLIENT CODE
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* Start CommandLineRunner *");
            System.out.println("* Sand box code only *");


            /* System.out.println("Add a new Dog: ");
            Animal dog = new Animal(); // To add new dog
            dog.setName("Fido");
            dog.setSound("woof");
            dog.setType("DOG"); // DOG or CAT

            //-----------------------------------------------------------------------------------

           // List<Animal> animals = controller.findAll();
           // System.out.println(" Animal: " + animals);

            //--------------------------------------------------------------------------------

            // controller.add(dog);

            //---------------------------------------------------------------------------------
            Animal animal2 = controller.findById(1);

            if (animal2 == null) {
                System.out.println("animal is null");
            } else {
                System.out.println("Animal: " + animal2.getName());
            }
            //----------------------------------------------------------------------------------

            // animals = controller.findAll();
            // System.out.println("List of Animal: " + animals);


            System.out.println("* End CommandLineRunner *"); */


        };
    }

}

