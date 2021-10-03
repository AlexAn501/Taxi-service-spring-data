package ru.digitalleague.taxiservicespringdata.api;


import ru.digitalleague.taxiservicespringdata.model.TaxiDriveInfo;

import java.util.List;

public interface TaxiDriveInfoService {
    TaxiDriveInfo getTaxiDriveInfo(long id);

    void saveOrUpdateTaxiDriveInfo(TaxiDriveInfo taxiDriveInfo);

    void deleteTaxiDriveInfo(long id);

    List<TaxiDriveInfo> getAllCityQueue();
}
