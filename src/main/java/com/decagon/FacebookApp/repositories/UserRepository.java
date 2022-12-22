package com.decagon.FacebookApp.repositories;

import com.decagon.FacebookApp.entities.User;
import com.decagon.FacebookApp.pojos.UserLoginDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findUserByUsernameAndPassword(String username, String password);
}
