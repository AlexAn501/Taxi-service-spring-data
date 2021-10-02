package ru.digitalleague.taxiservicespringdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.taxiservicespringdata.model.TaxiDriveInfo;
import ru.digitalleague.taxiservicespringdata.repository.TaxiDriveInfoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaxiDriveInfoServiceImpl implements TaxiDriveInfoService {

    @Autowired
    TaxiDriveInfoRepository taxiDriveInfoRepository;

    @Override
    public TaxiDriveInfo getTaxiDriveInfo(long id) {
        Optional<TaxiDriveInfo> optionalTaxiDriveInfo = taxiDriveInfoRepository.findById(id);
        if (optionalTaxiDriveInfo.isPresent()) {
            return optionalTaxiDriveInfo.get();
        } else {
            throw new RuntimeException("This TaxiDriver does not exist");
        }
    }

    @Override
    public void saveOrUpdateTaxiDriveInfo(TaxiDriveInfo taxiDriveInfo) {
        taxiDriveInfoRepository.save(taxiDriveInfo);
    }

    @Override
    public void deleteTaxiDriveInfo(long id) {
        taxiDriveInfoRepository.deleteById(id);
    }

    @Override
    public List<TaxiDriveInfo> getAllCityQueue() {
        return taxiDriveInfoRepository.findAll();
    }
}
