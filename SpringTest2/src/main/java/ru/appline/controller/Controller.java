package ru.appline.controller;

import org.springframework.web.bind.annotation.*;
import ru.appline.logic.CompassModel;
import ru.appline.logic.Ranges;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {


    private static CompassModel compassModel = CompassModel.getInstance();
    private static final AtomicInteger newid = new AtomicInteger(1);

    @PostMapping(value = "/range", consumes = "application/json")
    public void range(@RequestBody Ranges range) {

        compassModel.Delete(range, 1);
        compassModel.Add(range, newid.getAndIncrement());
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    public Map<Integer, Ranges> getAll() {
        return compassModel.getAll();
    }

}