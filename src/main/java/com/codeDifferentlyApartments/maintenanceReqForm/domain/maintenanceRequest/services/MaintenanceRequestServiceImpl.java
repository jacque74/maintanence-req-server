package com.codeDifferentlyApartments.maintenanceReqForm.domain.maintenanceRequest.services;

import com.codeDifferentlyApartments.maintenanceReqForm.domain.core.exceptions.ResourceCreationException;
import com.codeDifferentlyApartments.maintenanceReqForm.domain.core.exceptions.ResourceNotFoundException;
import com.codeDifferentlyApartments.maintenanceReqForm.domain.maintenanceRequest.models.MaintenanceRequest;

import java.util.List;

public class MaintenanceRequestServiceImpl implements MaintenanceRequestService {

    @Override
    public MaintenanceRequest create(MaintenanceRequest maintenanceRequest) throws ResourceCreationException {
        return null;
    }

    @Override
    public MaintenanceRequest getById(Long id) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public MaintenanceRequest getByEmail(String email) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public MaintenanceRequest getByAptNumber(String aptNumber) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public MaintenanceRequest getByDate(String createdAt) throws ResourceCreationException {
        return null;
    }

    @Override
    public List<MaintenanceRequest> getAll() {
        return null;
    }

    @Override
    public MaintenanceRequest update(Long id, MaintenanceRequest maintenanceRequestDetail) throws ResourceNotFoundException {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
