package com.example.demo.model;
public class AuthResponse {
    private String accessToken;
    private String username;
    private boolean authenticationStatus;
    private String errorMessage;

    // Constructors
    public AuthResponse() {
    }

    public AuthResponse(String accessToken, String username, boolean authenticationStatus) {
        this.accessToken = accessToken;
        this.username = username;
        this.authenticationStatus = authenticationStatus;
    }

    public AuthResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    // Getter and Setter methods
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(boolean authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
