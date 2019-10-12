package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/")
public class MainController {


    @GetMapping
    public String sayhello(){
        return "Hello Atefa, my darling!";
    }

}
