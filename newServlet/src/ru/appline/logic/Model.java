package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable {

    private static final Model instance = new Model();

    private final Map<Integer, User> model;

    public static Model getInstance(){
        return instance;
    }

    private Model() {
        model = new HashMap<>();

        model.put(1,new User("Ivan1", "Ivanov1", 555551));
        model.put(2,new User("Ivan2", "Ivanov2", 555552));
        model.put(3,new User("Ivan3", "Ivanov3", 555553));
    }

    public void add(User user, int id){
        model.put(id,user);
    }

    public Map<Integer, User> getFromList(){
        return model;
    }

    public void delete(int id){
        model.remove(id);
    }
}
