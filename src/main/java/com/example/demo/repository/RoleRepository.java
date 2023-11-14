package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Role;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    
    Role findByName(String name); // Find a role by name
    
    List<Role> findRolesByUsersId(Long userId); // Find roles by user ID
    
    // Define a custom query to find roles by a set of role names
    @Query("SELECT r FROM Role r WHERE r.name IN :roleNames")
    List<Role> findRolesByNames(List<String> roleNames);
    
    // You can add more custom queries based on your requirements
}
