package Movierecommendation.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class Controller {

    @Autowired
    private MovieService movieservice;

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Movie>>getMoviesByCategory(@PathVariable String category)
    {
        List<Movie> movies =movieservice.getTopMoviesByCategory(category);
        return ResponseEntity.ok(movies);
    }

    @PostMapping
    public ResponseEntity<Movie>addmovie(@RequestBody Movie movie)
    {
        Movie savedMovie =movieservice.addmovie(movie);
        return ResponseEntity.ok(savedMovie);
    }
}
