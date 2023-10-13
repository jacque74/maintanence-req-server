package com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.controllers;

import com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.models.MaintenanceRequest;
import com.codeDifferentlyApartments.maintenanceRequest.domain.maintenanceRequest.services.MaintenanceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/maintenanceRequest")
public class MaintenanceRequestController {

    private MaintenanceRequestService maintenanceRequestService;
    @Autowired
    public MaintenanceRequestController(MaintenanceRequestService maintenanceRequestService) {
        this.maintenanceRequestService = maintenanceRequestService;
    }

    @GetMapping
    public ResponseEntity<List<MaintenanceRequest>> getAll(){
        List<MaintenanceRequest> maintenanceRequests = maintenanceRequestService.getAll();
        return new ResponseEntity<>(maintenanceRequests, HttpStatus.OK);
    }
}
