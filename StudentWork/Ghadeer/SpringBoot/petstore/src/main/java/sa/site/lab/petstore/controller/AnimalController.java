package sa.site.lab.petstore.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.w3c.dom.ls.LSOutput;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalController {

    String add(Model model);

    String create(Animal animal);

    String findById(int id, Model model);

    String findAll(Model model);

    String delete (int id);



}
