package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AuditLog;

import java.time.LocalDateTime; 
import java.util.List;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
    
    List<AuditLog> findByUsername(String username);
    List<AuditLog> findByEndpoint(String endpoint);
    List<AuditLog> findByRequestTimeBetween(LocalDateTime startTime, LocalDateTime endTime);
}
