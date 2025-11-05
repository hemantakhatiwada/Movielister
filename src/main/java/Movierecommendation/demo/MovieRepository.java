package Movierecommendation.demo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
List<Movie> findByCategory(String category , Pageable pageable);

List<Movie>findByCategory(String category);

List<Movie>findByCategoryAndFeatured(String category,boolean featured,Pageable pageable);
}
