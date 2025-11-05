package Movierecommendation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@Service
public class MovieService {

    @Autowired//construcotor use garera this. usegarera garnun parenah autowired use garda
    private MovieRepository movieRepository;


//    private VoteRepository voteRepository;

    public List<Movie> getTopMoviesByCategory(String category)
    {
        PageRequest pageRequest =PageRequest.of(0,30, Sort.by((Sort.Order.desc("featured")),Sort.Order.desc("voteCount")));

        return movieRepository.findByCategory(category,pageRequest);
    }

    public Movie addmovie(Movie movie)
    {
        return movieRepository.save(movie);
    }
    

}
