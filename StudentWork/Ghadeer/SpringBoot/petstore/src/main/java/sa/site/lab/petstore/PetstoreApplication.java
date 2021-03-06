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

import static java.lang.System.*;
/*
todo:
1. Add ADD, Delete function for thymeleaf
2. Add Rest Support
 */
@SpringBootApplication
public class PetstoreApplication {

    //only fields/variables go here...
//    @Autowired
//private AnimalDao dao;
//    @Autowired
//    private AnimalService service;
    @Autowired
//    private AnimalController controller;


    public static void main(String[] args) {//start of main method
        out.println("**Start Main()**");
        SpringApplication.run(PetstoreApplication.class, args);
        out.println("**End main**");


    }//end of main method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("commanLinearRunner");
            out.println("sand box code only");
//            Animal dog= new Animal();
//            dog.setName("goofy");
//            dog.setSound("hhh");
//            dog.setType("DOG");
//
////            List<Animal> animals=controller.findAll();
////            System.out.println("Animals: "+animals);
//
//           Animal animal1=controller.findById(1);
//           if(animal1==null){
//               System.out.println("animal is null");
//           }
////            controller.add(dog);
//            Animal animal2=controller.findById(1);
//            if(animal2==null){
//                System.out.println("animal is null");
//            }else{
//                out.println("Animals: "+animal2.getName());
//            }
////             animals=controller.findAll();
////            System.out.println("Animals: "+animals);
//
//
//

            out.println("*End commandLineRunner");


        };
    }

}//end of class

