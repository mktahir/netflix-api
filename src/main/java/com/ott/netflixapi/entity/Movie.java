package com.ott.netflixapi.entity;

import org.springframework.data.annotation.Id;

public class Movie {
    @Id
    private Long id;
    private String image;
    private String titleImage;
    private String thumbnailImage;
    private String title;
    private String description;
    private String year;
    private String genre;
    private String duration;
    private String limit;
    private String isSeries;
    private String trailer;
    private String video;

    public Movie(Long id, String image, String titleImage, String thumbnailImage, String title, String description, String year, String genre, String duration, String limit, String isSeries, String trailer, String video) {
        this.id = id;
        this.image = image;
        this.titleImage = titleImage;
        this.thumbnailImage = thumbnailImage;
        this.title = title;
        this.description = description;
        this.year = year;
        this.genre = genre;
        this.duration = duration;
        this.limit = limit;
        this.isSeries = isSeries;
        this.trailer = trailer;
        this.video = video;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getIsSeries() {
        return isSeries;
    }

    public void setIsSeries(String isSeries) {
        this.isSeries = isSeries;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", titleImage='" + titleImage + '\'' +
                ", thumbnailImage='" + thumbnailImage + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", duration='" + duration + '\'' +
                ", limit='" + limit + '\'' +
                ", isSeries='" + isSeries + '\'' +
                ", trailer='" + trailer + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
