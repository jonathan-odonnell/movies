package dev.movies.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MoviesController {
    @Autowired 
    private MoviesService moviesService;
    @GetMapping
    public ResponseEntity<List<Movies>> getAllMovies() {
        return new ResponseEntity<List<Movies>>(moviesService.allMovies(), HttpStatus.OK);
    }
    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbid) {
         return new ResponseEntity<Optional<Movies>>(moviesService.singleMovie(imdbid), HttpStatus.OK);
    }
}
