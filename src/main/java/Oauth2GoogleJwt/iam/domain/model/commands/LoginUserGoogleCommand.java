package Oauth2GoogleJwt.iam.domain.model.commands;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

public record LoginUserGoogleCommand(OAuth2AuthenticationToken token) {}

