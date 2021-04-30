package com.example.flux_mongodb.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class MongoController {
    @GetMapping("/flux")
    public Flux<Integer> returnFlux(){
        return Flux.just(1,2,3,4,5)
                .delayElements(Duration.ofSeconds(2))
                .log();
    }

    @GetMapping(value = "/fluxstream", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Integer> returnFluxStream(){
        return Flux.just(1,2,3,4,5)
                .delayElements(Duration.ofSeconds(2))
                .log();
    }
}
