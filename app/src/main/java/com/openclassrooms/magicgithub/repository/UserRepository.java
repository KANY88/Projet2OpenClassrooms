package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; //

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // FAIT AK
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // FAIT AK
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // FAIT AK
        apiService.deleteUser(user);
    }
}
