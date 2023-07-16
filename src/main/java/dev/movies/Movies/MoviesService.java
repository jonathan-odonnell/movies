package dev.movies.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepository moviesRepository;
    public List<Movies> allMovies() {
        return moviesRepository.findAll();
    } 
    public Optional<Movies> singleMovie(String imdbid) {
        return moviesRepository.findMovieByImdbId(imdbid);
    }
}
