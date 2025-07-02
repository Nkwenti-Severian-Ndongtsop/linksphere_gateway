package com.linksphere.frontendgateway.frontendgateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/api/fallback")
    public ResponseEntity<String> fallback() {
        return ResponseEntity.ok("Please check your connection and try again.");
    }
}
