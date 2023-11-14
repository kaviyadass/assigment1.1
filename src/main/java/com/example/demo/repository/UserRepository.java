package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(String email); // Find a user by email
    
    List<User> findByRoleName(String roleName); // Find users by role name
    User findByUsername(String username); // Add this method to find a user by username
        // Add other custom query methods as needed
    // Define a custom query to find users by their name and email
    @Query("SELECT u FROM User u WHERE u.name = :name AND u.email = :email")
    List<User> findByNameAndEmail(String name, String email);
    
    // Define a custom query to find users by a partial name match
    @Query("SELECT u FROM User u WHERE u.name LIKE %:partialName%")
    List<User> findUsersByPartialName(String partialName);
    
    // Define a custom query to find users by a set of role names
    @Query("SELECT u FROM User u JOIN u.roles r WHERE r.name IN :roleNames")
    List<User> findUsersByRoleNames(List<String> roleNames);
    
    // You can add more custom queries based on your requirements
}
