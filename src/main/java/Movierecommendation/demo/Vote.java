package Movierecommendation.demo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="votes")
public class Vote {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private Long movieid;

    @Column(nullable=false)
    private String userid;

    @Column(nullable=false)
    private LocalDateTime votedat;

    public Vote()
    {

    }

    public Vote(Long movieid, String userid) {
        this.movieid = movieid;
        this.userid = userid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieid() {
        return movieid;
    }

    public void setMovieid(Long movieid) {
        this.movieid = movieid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getVotedat() {
        return votedat;
    }

    public void setVotedat(LocalDateTime votedat) {
        this.votedat = votedat;
    }
}
