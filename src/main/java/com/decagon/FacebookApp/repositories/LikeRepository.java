package com.decagon.FacebookApp.repositories;

import com.decagon.FacebookApp.entities.Like;
import com.decagon.FacebookApp.pojos.LikeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
}
