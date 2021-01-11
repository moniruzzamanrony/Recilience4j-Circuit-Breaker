package com.ibcs.resilience4J.client.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter

public class GameSetResponse {

    private String id;

    private String createdBy;

    private LocalDateTime createdAt;


    private String updatedBy;


    private LocalDateTime updatedAt;
    private String gameNumber;

    private String gameType;


    private String gameName;


    private String version;

    private String map;

    private String gameStatus;

    private int totalPrize;

    private int perKillPrize;

    private int entryFee;

    private boolean gameIsActive;


}

