package com.example.demo.service;
import com.example.demo.model.Role;

public interface RoleService {
    Role createRole(Role role);
    Role findRoleById(Long id);
    Role updateRole(Long id, Role role);
    void deleteRole(Long id);
}
