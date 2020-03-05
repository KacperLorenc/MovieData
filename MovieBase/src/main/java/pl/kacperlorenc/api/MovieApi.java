package pl.kacperlorenc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.kacperlorenc.dao.entities.Movie;
import pl.kacperlorenc.services.MovieManager;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/movies")
public class MovieApi {
    MovieManager manager;

    @Autowired
    public MovieApi(MovieManager manager) {
        this.manager = manager;
    }

    @GetMapping("/all")
    public List<Movie> getAll(){
        return manager.findAll();
    }
    @GetMapping
    public Optional<Movie> findMovieByTitle(@RequestParam String title){
        return manager.findByTitle(title);
    }
    @PostMapping
    public void saveByTitle(@RequestParam String title){
        manager.saveByTitle(title);
    }
    @DeleteMapping
    @Transactional
    public void deleteMovieByTitle(String title){
        manager.deleteMovieByTitle(title);
    }
}
