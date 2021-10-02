package ru.digitalleague.taxiservicespringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.taxiservicespringdata.model.CityQueue;

import java.util.List;

public interface CityQueueRepository extends JpaRepository<CityQueue,Long> {
}
