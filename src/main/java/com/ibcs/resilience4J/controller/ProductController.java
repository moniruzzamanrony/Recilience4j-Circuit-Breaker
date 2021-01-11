package com.ibcs.resilience4J.controller;


import com.ibcs.resilience4J.client.dto.response.GameSetResponse;
import com.ibcs.resilience4J.services.ProductService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductController {


    private final ProductService productService;
//    @GetMapping("/status")
//    @CircuitBreaker(name = "statusBreak",fallbackMethod = "statusFallBack")
//    public String getStatus()
//    {
//        System.err.println("Work Done");
//        return "Work Done";
//    }

    @GetMapping("/games")
    @CircuitBreaker(name = "statusBreak", fallbackMethod = "statusFallBack")
    public List<GameSetResponse> getGames()
    {
        return productService.getGameDetails();

    }

    public List<GameSetResponse> statusFallBack(Throwable th){
        System.err.println("8088 Server Port is down");
        return null;
    }
}
