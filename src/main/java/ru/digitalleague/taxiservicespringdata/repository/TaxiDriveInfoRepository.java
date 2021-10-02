package ru.digitalleague.taxiservicespringdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.digitalleague.taxiservicespringdata.model.TaxiDriveInfo;

public interface TaxiDriveInfoRepository extends JpaRepository<TaxiDriveInfo, Long> {
}
