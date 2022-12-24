package com.ott.netflixapi.respository;

import com.ott.netflixapi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findTopByOrderByIdDesc();
}
