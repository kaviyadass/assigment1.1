package com.example.demo.controller;
import com.example.demo.model.AuditLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.AuditService;
import java.util.List;

@RestController
@RequestMapping("/api/audit")
public class AuditController {
    @Autowired
    private AuditService auditService;

    @GetMapping("/logs")
    public ResponseEntity<List<AuditLog>> getAuditLogs() {
        List<AuditLog> auditLogs = auditService.getAuditLogs();
        return ResponseEntity.ok(auditLogs);
    }
}
