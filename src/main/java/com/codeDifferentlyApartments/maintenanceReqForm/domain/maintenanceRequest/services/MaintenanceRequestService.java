package com.codeDifferentlyApartments.maintenanceReqForm.domain.maintenanceRequest.services;

import com.codeDifferentlyApartments.maintenanceReqForm.domain.core.exceptions.ResourceCreationException;
import com.codeDifferentlyApartments.maintenanceReqForm.domain.core.exceptions.ResourceNotFoundException;
import com.codeDifferentlyApartments.maintenanceReqForm.domain.maintenanceRequest.models.MaintenanceRequest;

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
