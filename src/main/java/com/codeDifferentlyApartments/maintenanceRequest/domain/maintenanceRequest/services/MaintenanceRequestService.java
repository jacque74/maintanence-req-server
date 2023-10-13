package com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.services;

import com.codeDifferentlyApartments.maintenanceRequest.domain.core.exceptions.ResourceCreationException;
import com.codeDifferentlyApartments.maintenanceRequest.domain.core.exceptions.ResourceNotFoundException;
import com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.models.MaintenanceRequest;

import java.util.List;

public interface MaintenanceRequestService {
    MaintenanceRequest create(MaintenanceRequest maintenanceRequest) throws ResourceCreationException;
    MaintenanceRequest getById(Long id) throws ResourceNotFoundException;
    MaintenanceRequest getByEmail(String email) throws ResourceNotFoundException;
    MaintenanceRequest getByAptNumber(String aptNumber) throws ResourceNotFoundException;
    MaintenanceRequest getByDate(String createdAt) throws ResourceCreationException;
    List<MaintenanceRequest> getAll();
    MaintenanceRequest update(Long id,MaintenanceRequest maintenanceRequestDetail) throws ResourceNotFoundException;
    void delete(Long id);
}
