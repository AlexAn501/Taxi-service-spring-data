package ru.digitalleague.taxiservicespringdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.taxiservicespringdata.model.Car;
import ru.digitalleague.taxiservicespringdata.repository.CarRepository;

import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public Car getCar(long id) {
        Optional<Car> carOptional = carRepository.findById(id);
        if(carOptional.isPresent()){
            return carOptional.get();
        }
        else {
            throw new RuntimeException("This car does not exist");
        }
    }

    @Override
    public void saveOrUpdateCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void deleteCar(long id) {
        carRepository.deleteById(id);
    }
}
