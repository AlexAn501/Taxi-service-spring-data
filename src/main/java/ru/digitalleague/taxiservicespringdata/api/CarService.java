package ru.digitalleague.taxiservicespringdata.api;

import ru.digitalleague.taxiservicespringdata.model.Car;

public interface CarService {
    Car getCar(long id);

    void saveOrUpdateCar(Car car);

    void deleteCar(long id);
}