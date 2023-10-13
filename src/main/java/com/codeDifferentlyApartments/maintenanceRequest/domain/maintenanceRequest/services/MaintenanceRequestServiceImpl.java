package com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.services;

import com.codeDifferentlyApartments.maintenanceRequest.domain.core.exceptions.ResourceCreationException;
import com.codeDifferentlyApartments.maintenanceRequest.domain.core.exceptions.ResourceNotFoundException;
import com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.models.MaintenanceRequest;
import com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.repos.MaintenanceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaintenanceRequestServiceImpl implements MaintenanceRequestService {
    private MaintenanceRequestRepository maintenanceRequestRepository;

    @Autowired
    public MaintenanceRequestServiceImpl(MaintenanceRequest maintenanceRequestRepository) {
        this.maintenanceRequestRepository = (MaintenanceRequestRepository) maintenanceRequestRepository;
    }

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
