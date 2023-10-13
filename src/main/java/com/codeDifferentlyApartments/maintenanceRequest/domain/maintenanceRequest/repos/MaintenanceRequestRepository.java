package com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.repos;

import com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.models.MaintenanceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaintenanceRequestRepository extends JpaRepository<MaintenanceRequest, Long>{
    Optional<MaintenanceRequest> findByEmail(String email);

}
