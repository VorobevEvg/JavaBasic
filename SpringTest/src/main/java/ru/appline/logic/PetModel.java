package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PetModel implements Serializable {

    private static final PetModel instance = new PetModel();

    private final Map<Integer, Pet> model;

    public PetModel()
    {
        model = new HashMap<Integer, Pet>();
        model.put(1, new Pet("Rich", "Dog", 5));
        model.put(2, new Pet("Bars", "Cat", 1));
    }

    public static PetModel getInstance()
    {
        return instance;
    }

    public void Add(Pet pet, int id) {
        model.put(id, pet);
    }
    public Pet getFromList(int id) {
        return model.get(id);
    }
    public Map<Integer, Pet> getAll() {
        return model;
    }
    public void Delete(Pet pet, int id) {
        model.remove(id, pet);
    }
    public void Put(Pet pet, int id) {
        model.replace(id, pet);
    }
}