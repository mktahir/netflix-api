package com.ott.netflixapi.controller;

import com.ott.netflixapi.entity.Movie;
import com.ott.netflixapi.respository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.MarshalledObject;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository;
    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie res){
        Movie movie = movieRepository.findTopByOrderByIdDesc();
        Long lastNum = movie!=null?movie.getId():0;
        res.setId(lastNum+1);
        return movieRepository.save(res);
    }

    @GetMapping("/movies")
    public List getMovies(){
        List list = movieRepository.findAll();
        return list;
    }

        @GetMapping("/movies/{id}")
        public Movie getMovie(@PathVariable Long id){
            Movie movie = movieRepository.findById(id).orElseThrow();
            return movie;
        }
        @PutMapping("/movies/{id}")
        public Movie updateMovie(@RequestBody Movie request, @PathVariable Long id){
            Movie movie = movieRepository.findById(id).orElseThrow();
            movie.setMovie(request.getMovie());
            movie.setImage(request.getImage());
            movie.setYear(request.getYear());
            movie.setDuration(request.getDuration());
            movie.setVideo(request.getVideo());
            movie.setAction(request.getAction());
            return movieRepository.save(movie);
        }


}
