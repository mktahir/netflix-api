package com.ott.netflixapi.controller;

import com.ott.netflixapi.respository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository;
}
