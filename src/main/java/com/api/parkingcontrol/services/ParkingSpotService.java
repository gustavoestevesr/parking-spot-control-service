package com.api.parkingcontrol.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import com.api.parkingcontrol.models.ParkingSpotModel;

public interface ParkingSpotService {
    
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel);

    public boolean existsByLicensePlateCar(String licensePlateCar);

    public boolean existsByParkingSpotNumber(String parkingSpotNumber);

    public boolean existsByApartmentAndBlock(String apartment, String block);

    // public Page<ParkingSpotModel> findAll(Pageable pageable);

    public Optional<ParkingSpotModel> findById(UUID id);
    
    public void delete(ParkingSpotModel parkingSpotModel);

}
