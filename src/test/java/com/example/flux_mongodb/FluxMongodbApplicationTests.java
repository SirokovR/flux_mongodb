package com.example.flux_mongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@AutoConfigureWebTestClient(timeout = "36000")
@SpringBootTest
class FluxMongodbApplicationTests {

    @Test
    void contextLoads() {
    }

}
