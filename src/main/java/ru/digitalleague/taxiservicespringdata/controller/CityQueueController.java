package ru.digitalleague.taxiservicespringdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.taxiservicespringdata.model.CityQueue;
import ru.digitalleague.taxiservicespringdata.service.CityQueueService;

import java.util.List;

@RestController
public class CityQueueController {

    @Autowired
    private CityQueueService cityQueueService;

    @GetMapping("/cities/{id}")
    public CityQueue getCityQueue(@PathVariable long id){
        return cityQueueService.getCityQueue(id);
    }

    @PostMapping("/cities")
    public CityQueue addNewCityQueue(@RequestBody CityQueue cityQueue){
        cityQueueService.saveOrUpdateCityQueue(cityQueue);
        return cityQueue;
    }

    @PutMapping("/cities")
    public CityQueue updateCityQueue(@RequestBody CityQueue cityQueue){
        cityQueueService.saveOrUpdateCityQueue(cityQueue);
        return cityQueue;
    }

    @DeleteMapping("/cities/{id}")
    public String deleteCityQueue(@PathVariable long id){
        cityQueueService.getCityQueue(id);
        cityQueueService.deleteCityQueue(id);
        return String.format("CityQueue with ID = %d was deleted", id);
    }

    @GetMapping("/cities")
    public List<CityQueue> getAllCitiesQueue(){
        return cityQueueService.getAllCityQueue();
    }
}
