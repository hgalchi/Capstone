package com.example.PicMouse.Oauth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GoogleOAuthToken {
    private String access_tocke;
    private int expires_in;
    private String scope;
    private String token_type;
    private String id_token;
}