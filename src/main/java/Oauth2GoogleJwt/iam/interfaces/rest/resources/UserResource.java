package Oauth2GoogleJwt.iam.interfaces.rest.resources;

import Oauth2GoogleJwt.iam.domain.model.enums.AuthProvider;

public record UserResource(Long id, String name, String email, AuthProvider authProvider) {
}