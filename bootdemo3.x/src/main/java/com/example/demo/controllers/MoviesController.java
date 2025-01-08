package com.example.demo.controllers;

import com.example.demo.model.ResponseBean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(value = "*")
public class MoviesController {
    @GetMapping(path = "/allMovies")
    public @ResponseBody List<ResponseBean> getAllMovies(){
        List<ResponseBean> allMovies = new ArrayList<ResponseBean>();
        ResponseBean bean = ResponseBean.builder().id("100").title("Movie1").releaseDate("01012020").build();
        allMovies.add(bean);
        bean = ResponseBean.builder().id("200").title("Movie2").releaseDate("01012020").build();
        allMovies.add(bean);
        bean = ResponseBean.builder().id("300").title("Movie3").releaseDate("02012020").build();
        allMovies.add(bean);
        bean = ResponseBean.builder().id("400").title("Movie4").releaseDate("03012020").build();
        allMovies.add(bean);
        bean = ResponseBean.builder().id("500").title("Movie5").releaseDate("04012020").build();
        allMovies.add(bean);
        bean = ResponseBean.builder().id("600").title("Movie6").releaseDate("05012020").build();
        allMovies.add(bean);
        return allMovies;
    }

    @GetMapping(path = "searchMovie")
    private @ResponseBody List<ResponseBean> getMovieDetails(@RequestParam String query){
        return this.getAllMovies().stream().filter(movie -> movie.getTitle().equalsIgnoreCase(query)).collect(Collectors.toList());
    }

}
