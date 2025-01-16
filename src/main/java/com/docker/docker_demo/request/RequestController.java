package com.docker.docker_demo.request;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

  @GetMapping("/api/request")
  public ResponseEntity<String> getRequest() {
    return ResponseEntity.ok("request");
  }

}
