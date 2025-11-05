//Movie Entity/Data


package Movierecommendation.demo;

import jakarta.persistence.*;


@Entity
@Table(name="movies")
public class Movie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
private String title;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private Integer year;

    private String director;
    private String description;



    @Column(nullable=false)
    private Boolean featured = false;

    @Column(nullable=false)
    private Integer voteCount=0;

    public Movie()
    {

    }

    public Movie(String title, String category, Integer year, Boolean featured, Integer voteCount) {
        this.title = title;
        this.category = category;
        this.year = year;
        this.featured = featured;
        this.voteCount = voteCount;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
