package com.ott.netflixapi.respository;

import com.ott.netflixapi.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie,Long> {

}
