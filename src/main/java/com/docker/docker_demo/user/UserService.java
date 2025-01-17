package com.docker.docker_demo.user;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public List<UserDto> findByUsers() {
    List<User> userList = userRepository.findAll();

    return userList.stream().map(user -> new UserDto(user.getName(), user.getPassword()))
      .collect(Collectors.toList());
  }

}
