package pl.kacperlorenc.dao.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class Movie {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private String year;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String plot;
    private String actors;

    public Movie() {
    }

    public Movie(String title, String year, String runtime, String genre, String director,
                 String writer, String plot, String actors) {
        this.title = title;
        this.year = year;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.plot = plot;
        this.actors = actors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "pl.kacperlorenc.demo.entities.Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", runtime='" + runtime + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", actors='" + actors + '\'' +
                '}';
    }
}
