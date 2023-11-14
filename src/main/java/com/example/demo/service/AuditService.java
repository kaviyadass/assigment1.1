package com.example.demo.service;

import java.util.List;
import com.example.demo.model.AuditLog;  // Add this import statement

public interface AuditService {
    List<AuditLog> getAuditLogs();
}
