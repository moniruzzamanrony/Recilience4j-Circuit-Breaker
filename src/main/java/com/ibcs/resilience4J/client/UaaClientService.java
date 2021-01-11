package com.ibcs.resilience4J.client;


import com.ibcs.resilience4J.client.dto.response.GameSetResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
@FeignClient(value = "UaaClientService", url = "http://localhost:8088/")
public interface UaaClientService {

    @GetMapping("/api/auth/common/show/games")
    Optional<List<GameSetResponse>> getGames();

}
