package com.example.chatserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class TokenDto {
    private String grantType;
    private String accessToken;
    private String refreshToken;
}
