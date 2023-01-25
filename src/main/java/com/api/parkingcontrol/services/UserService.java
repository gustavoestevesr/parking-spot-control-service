package com.api.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.api.parkingcontrol.models.UserModel;

public interface UserService {
    
    public UserModel save(UserModel userModel);

    public boolean existsByUsername(String username);

    public List<UserModel> findAll();

    public Optional<UserModel> findById(UUID id);
    
    public void delete(UserModel parkingSpotModel);
    
}
