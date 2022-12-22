package com.decagon.FacebookApp.services;

import com.decagon.FacebookApp.entities.User;
import com.decagon.FacebookApp.pojos.UserSignUpDto;
import com.decagon.FacebookApp.pojos.UserLoginDto;
import lombok.NonNull;

public interface UserService {
    User registerUser(UserSignUpDto userDto);
    User getUserById(@NonNull Long userId);
    User authenticateUser (UserLoginDto userLoginDto);
}
