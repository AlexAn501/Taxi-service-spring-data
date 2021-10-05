package ru.digitalleague.taxiservicespringdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.taxiservicespringdata.exception_handling.NoSuchEntityException;
import ru.digitalleague.taxiservicespringdata.model.Car;
import ru.digitalleague.taxiservicespringdata.api.CarService;

import java.util.List;


@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable long id) {
        Car car = carService.getCar(id);
        if (car == null) {
            throw new NoSuchEntityException(String.format("Car with ID = %d does not exist", id));
        }
        return carService.getCar(id);
    }

    @GetMapping("/cars")
    public List<Car> getAllCar() {
        return carService.getAllCar();
    }

    @PostMapping("/cars")
    public Car addNewCar(@RequestBody Car car) {
        carService.saveOrUpdateCar(car);
        return car;
    }

    @PutMapping("/cars")
    public Car updateCar(@RequestBody Car car) {
        carService.saveOrUpdateCar(car);
        return car;
    }

    @DeleteMapping("/cars/{id}")
    public String deleteCar(@PathVariable long id) {
        carService.getCar(id);
        carService.deleteCar(id);
        return String.format("Car with ID = %d was deleted", id);
    }
}