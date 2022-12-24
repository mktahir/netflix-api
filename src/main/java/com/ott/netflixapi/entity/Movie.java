package com.ott.netflixapi.entity;

public class Movie {
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

    public Movie(String image, String titleImage, String thumbnailImage, String title, String description, String year, String genre, String duration, String limit, String isSeries, String trailer, String video) {
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

    @Override
    public String toString() {
        return "Movies{" +
                "image='" + image + '\'' +
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
