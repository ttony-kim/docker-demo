package com.docker.docker_demo.user;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("/api/users")
  public ResponseEntity<List<UserDto>> findUserList() {
    List<UserDto> userList = userService.findByUsers();

    return ResponseEntity.ok(userList);
  }

}
