package pwr.entity;

import java.time.LocalDate;

public class Movie {

    private long id;
    private String title;
    private String director;
    private LocalDate releaseDate;
    private String coverURL;

    public Movie() { }

    public Movie(long id, String title, String director, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public Movie(long id, String title, String director, LocalDate releaseDate, String coverURL) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.coverURL = coverURL;
    }

    public Movie(String title, String director, LocalDate releaseDate, String coverURL) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.coverURL = coverURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void setCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }

    @Override
    public String toString() {
        return  "Title = '" + title + '\'' +
                "Director = '" + director + '\'' +
                "release date = '" + releaseDate.toString() + '\'';
    }
}
