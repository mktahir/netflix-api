package com.ott.netflixapi.controller;

import com.ott.netflixapi.respository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ott.netflixapi.entity.Movie;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository;
    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie res){
        Movie movie = movieRepository.findTopByOrderByIdDesc();
        Long lastNum = movie!=null?movie.getId():0;
        res.setId(lastNum+1);
        return  movieRepository.save(res);
    }

    @GetMapping("/movies")
    public List getlists() {
        List list = movieRepository.findAll();
        return list;
    }
    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable Long id){
    Movie movie = movieRepository.findById(id).orElseThrow();
        return movie;
    }
    @PutMapping("/movies/{id}")
    public Movie update (@RequestBody Movie request,@PathVariable Long id){
        Movie movie = movieRepository.findById(id).orElseThrow();
        movie.setImage(request.getImage());
        movie.setTitle(request.getTitle());
        movie.setThumbnailImage(request.getThumbnailImage());
        movie.setTitleImage(request.getTitleImage());
        movie.setDescription(request.getDescription());
        movie.setYear(request.getYear());
        movie.setGenre(request.getGenre());
        movie.setDuration(request.getDuration());
        movie.setLimit(request.getLimit());
        movie.setIsSeries(request.getIsSeries());
        movie.setTrailer(request.getTrailer());
        movie.setVideo(request.getVideo());
        return movieRepository.save(movie);
    }


}
