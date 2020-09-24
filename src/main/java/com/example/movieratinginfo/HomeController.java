package com.example.movieratinginfo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/getMovieRatings")
    public ResponseEntity<List<Movie>> getMovieRating() throws InterruptedException {

        System.out.println("In Movie Info V Application");

        List<Movie> movies = new ArrayList<Movie>();
        movies=Arrays.asList(new Movie("Gravity","4.5"),new Movie("Avengers","4.2"),new Movie("Joker","5"));

        return new ResponseEntity<>(movies, HttpStatus.OK);
        //return Arrays.asList(new Movie("Gravity","4.5"),new Movie("Avengers","4.2"),new Movie("Joker","5"));
      //  return ResponseEntity.ok().body(Arrays.asList(new Movie("Gravity","4.5"),new Movie("Avengers","4.2"),new Movie("Joker","5")));
       // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Arrays.asList(new Movie("Gravity","4.5"),new Movie("Avengers","4.2"),new Movie("Joker","5")));
       // return new ResponseEntity<Object>(Arrays.asList(new Movie("Gravity","4.5"),new Movie("Avengers","4.2"),new Movie("Joker","5")), HttpStatus.OK);

    }
}
