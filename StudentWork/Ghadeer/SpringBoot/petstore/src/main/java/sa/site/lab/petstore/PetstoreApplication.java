package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Dog;


import java.util.List;

import static java.lang.System.*;

@SpringBootApplication
public class PetstoreApplication {

    //only fields/variables go here...
//    @Autowired
//private AnimalDao dao;
//    @Autowired
//    private AnimalService service;
    @Autowired
    private AnimalController controller;


    public static void main(String[] args) {//start of main method
        out.println("**Start Main()**");
        SpringApplication.run(PetstoreApplication.class, args);
        out.println("**End main**");


    }//end of main method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("commanLinearRunner");

            //runnable code goes here
            System.out.println("Animal DAO output:");
            //Animal DAO goes here
            Animal animal = controller.findById(4);
            System.out.println("Animal founded:");

            if (animal != null) {
                animal.eat();
            } else out.println("animal has not founded");

            List<Animal> animals = controller.findAll();

            out.println("Number of animals: "+animals.size());

            controller.add(new Dog("Bob"));

            List<Animal> animals2 = controller.findAll();

            out.println("Number of animals: "+animals2.size());



            out.println("*End commandLineRunner");


        };
    }

}//end of class

