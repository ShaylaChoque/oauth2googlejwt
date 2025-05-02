package Oauth2GoogleJwt.iam.interfaces.rest.resources;

public record AuthenticatedResponseResource(UserResource user, String token) { }
