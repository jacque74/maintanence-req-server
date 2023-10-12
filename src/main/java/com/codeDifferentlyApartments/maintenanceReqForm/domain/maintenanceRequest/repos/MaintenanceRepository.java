package com.codeDifferentlyApartments.maintenanceReqForm.domain.maintenanceRequest.repos;

import com.codeDifferentlyApartments.maintenanceReqForm.domain.maintenanceRequest.models.MaintenanceRequest;
import com.codeDifferentlyApartments.maintenanceReqForm.domain.maintenanceRequest.models.MaintenanceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaintenanceRepository extends JpaRepository<MaintenanceRequest, Long>{
    Optional<MaintenanceRequest> findByEmail(String email);

}
