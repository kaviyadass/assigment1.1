package com.example.demo.service;
import com.example.demo.model.AuthResponse;
import com.example.demo.model.LoginRequest;  // Add this import statement

public interface AuthenticationService {
    AuthResponse authenticateUser(LoginRequest request);
}
