package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CompassModel implements Serializable{

    private static final CompassModel instance = new CompassModel();

    private final Map<Integer, Ranges> model;

    public CompassModel()
    {
        model = new HashMap<Integer, Ranges>();
        model.put(1, new Ranges("41-115","42-125","43-135","44-145","45-13555","46-165","47-175","48-185"));
    }

    public static CompassModel getInstance()
    {
        return instance;
    }

    public void Add(Ranges range, int id) {
        model.put(id, range);
    }
    public Ranges getFromList(int id) {
        return model.get(id);
    }
    public Map<Integer, Ranges> getAll() {
        return model;
    }
    public void Delete(Ranges range, int id) {
        model.remove(id, range);
    }
    public void Put(Ranges range, int id) {
        model.replace(id, range);
    }
}
