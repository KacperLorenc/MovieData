package pl.kacperlorenc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.kacperlorenc.dao.entities.Movie;
import pl.kacperlorenc.services.MovieManager;

@RestController
@RequestMapping("api/data")
public class DataBaseApi {
    MovieManager manager;

    @Autowired
    public DataBaseApi(MovieManager manager) {
        this.manager = manager;
    }

    @GetMapping
    public Movie findByTitle(@RequestParam String title){
       return manager.downloadByTitle(title);
    }
}
