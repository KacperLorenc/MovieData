package pl.kacperlorenc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kacperlorenc.dao.MovieRepository;
import pl.kacperlorenc.dao.entities.Movie;
import pl.kacperlorenc.models.MovieResponse;

import java.util.Optional;

@Service
public class MovieManager {
    private MovieRepository repository;
    private MovieResponseService responseService;

    @Autowired
    public MovieManager(MovieRepository repository, MovieResponseService responseService) {
        this.repository = repository;
        this.responseService = responseService;
    }

    public Movie findByTitle(String title) {
        Optional<MovieResponse> response = Optional.ofNullable(responseService.getResponse(title));

        if (response.isPresent()) {
            MovieResponse movieResponse = response.get();
            return new Movie(movieResponse.getTitle(), movieResponse.getYear(), movieResponse.getRuntime(), movieResponse.getGenre(),
                    movieResponse.getDirector(), movieResponse.getWriter(), movieResponse.getPlot(), movieResponse.getActors());
        }
        return null;
    }

    public void saveMovieByTitle(String title) {
        Optional<Movie> movieToSave = Optional.ofNullable(findByTitle(title));
        movieToSave.ifPresent(movie -> repository.save(movie));
    }
}
