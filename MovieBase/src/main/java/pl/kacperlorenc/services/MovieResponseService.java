package pl.kacperlorenc.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.kacperlorenc.models.MovieResponse;

@Service
public class MovieResponseService {
    private MovieResponse response;

    private void initResponse(String movieTitle) {

        this.response = new RestTemplate().getForObject(
                "http://www.omdbapi.com/?t=" + movieTitle.replaceAll(" ","+").replaceAll("\\s",""), MovieResponse.class
        );
    }
    public MovieResponse getResponse(String movieTitle){
        initResponse(movieTitle);
        return response;
    }
}
