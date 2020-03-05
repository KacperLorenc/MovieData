package pl.kacperlorenc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kacperlorenc.dao.entities.Movie;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
        Optional<Movie> findByTitle(String title);
        void deleteByTitle(String title);

}
