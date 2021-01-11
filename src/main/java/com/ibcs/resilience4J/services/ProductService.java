package com.ibcs.resilience4J.services;

import com.ibcs.resilience4J.client.UaaClientService;
import com.ibcs.resilience4J.client.dto.response.GameSetResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class ProductService {

    private final UaaClientService uaaClientService;

    public List<GameSetResponse> getGameDetails()
    {
        Optional<List<GameSetResponse>> gameSetResponse = uaaClientService.getGames();
        if(!gameSetResponse.isPresent())
        {
            throw new RuntimeException("Can't connect to server");
        }
        return gameSetResponse.get();
    }


}
