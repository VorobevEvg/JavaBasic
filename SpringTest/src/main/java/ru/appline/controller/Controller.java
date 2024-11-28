package ru.appline.controller;

import org.springframework.web.bind.annotation.*;
import ru.appline.logic.Information;
import ru.appline.logic.Pet;
import ru.appline.logic.PetModel;

import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {

    private static PetModel petModel = PetModel.getInstance();
    private static final AtomicInteger newid = new AtomicInteger(3);

    @PostMapping(value = "/createPet", consumes = "application/json")
    public void  createPet(@RequestBody Pet pet){
        petModel.Add(pet, newid.getAndIncrement());
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    public Map<Integer, Pet> getAll(){
        return petModel.getAll();
    }

    @GetMapping(value = "/getPet", consumes = "application/json", produces = "application/json")
    public Pet getPet(@RequestBody Map<String, Integer> id)
    {
        return petModel.getFromList(id.get("id"));
    }

    @DeleteMapping(value = "/deletePet", consumes = "application/json", produces = "application/json")
    public void deletePet(@RequestBody Map<String, Integer> id)
    {
        Pet pet = petModel.getFromList(id.get("id"));
        petModel.Delete(pet, id.get("id"));
    }

    @PutMapping(value = "/putPet", consumes = "application/json" , produces = "application/json")
    public Pet putPet(@RequestBody Map<String, String> json)
    {
        int id = Integer.parseInt(json.get("id"));
        String name = json.get("name");
        String type = json.get("type");
        int age = Integer.parseInt(json.get("age"));
        Pet putPet = new Pet(name, type, age);
        petModel.Put(putPet, id);
        return putPet;
    }

}