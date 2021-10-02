package ru.digitalleague.taxiservicespringdata.service;

import antlr.CharQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.taxiservicespringdata.model.CityQueue;
import ru.digitalleague.taxiservicespringdata.repository.CityQueueRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CityQueueServiceImpl implements CityQueueService{
    @Autowired
    CityQueueRepository cityQueueRepository;

    @Override
    public CityQueue getCityQueue(long id) {
        Optional<CityQueue> optionalCityQueue = cityQueueRepository.findById(id);
        if(optionalCityQueue.isPresent()){
            return optionalCityQueue.get();
        }
        else
            throw new RuntimeException("This cityQueue does not exist");
    }

    @Override
    public void saveOrUpdateCityQueue(CityQueue cityQueue){
        cityQueueRepository.save(cityQueue);
    }

    @Override
    public void deleteCityQueue(long id) {
        cityQueueRepository.deleteById(id);
    }

    @Override
    public List<CityQueue> getAllCityQueue() {
        return cityQueueRepository.findAll();
    }
}
