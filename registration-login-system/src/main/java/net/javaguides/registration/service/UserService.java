package net.javaguides.registration.service;

import net.javaguides.registration.dto.UserDto;
import net.javaguides.registration.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto );

    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
