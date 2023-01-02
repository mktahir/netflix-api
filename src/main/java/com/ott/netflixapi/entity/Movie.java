package com.ott.netflixapi.entity;

import org.springframework.data.annotation.Id;

public class Movie {
    @Id
    private Long id;
    private String movie;
    private String image;
    private String year;
    private String duration;
    private String video;
    private String action;

    public Movie(Long id, String movie, String image, String year, String duration, String video, String action) {
        this.id = id;
        this.movie = movie;
        this.image = image;
        this.year = year;
        this.duration = duration;
        this.video = video;
        this.action = action;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movie='" + movie + '\'' +
                ", image='" + image + '\'' +
                ", year='" + year + '\'' +
                ", duration='" + duration + '\'' +
                ", video='" + video + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
