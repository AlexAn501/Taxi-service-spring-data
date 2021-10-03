package ru.digitalleague.taxiservicespringdata.api;

import ru.digitalleague.taxiservicespringdata.model.CityQueue;

import java.util.List;

public interface CityQueueService {
    CityQueue getCityQueue(long id);

    void saveOrUpdateCityQueue(CityQueue cityQueue);

    void deleteCityQueue(long id);

    List<CityQueue> getAllCityQueue();
}
