package com.tino.loginAssessment.service;

import com.tino.loginAssessment.dto.UserDto;
import com.tino.loginAssessment.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByFullname(String name);

    List<UserDto> findAllUsers();
}
