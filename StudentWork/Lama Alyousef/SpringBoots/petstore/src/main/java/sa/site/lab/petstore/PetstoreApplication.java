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

@SpringBootApplication
public class PetstoreApplication {


    @Autowired
    private AnimalController controller;


    public static void main(String[] args) {
        System.out.println("* Start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* End main()");

    } // End of MAIN Method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* Start CommandLineRunner *");

            System.out.println("Add a new Dog: ");
            Animal dog = new Animal(); // To add new dog
            dog.setName("Fido");
            dog.setSound("woof");
            dog.setType("DOG"); // DOG or CAT


            Animal animal1 = controller.findById(1);
            if(animal1 == null){
                System.out.println("animal is null");
            }
            controller.add(dog);

            Animal animal2 = controller.findById(1);

            if(animal1 == null){
                System.out.println("animal is null");
            } else {
                System.out.println("Animal: " + animal2.getName());
            }



            System.out.println("* End CommandLineRunner *");


        };
    }

}

