package ru.digitalleague.taxiservicespringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.taxiservicespringdata.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
