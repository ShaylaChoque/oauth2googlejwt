package Oauth2GoogleJwt.iam.interfaces.rest.transform;

import Oauth2GoogleJwt.iam.domain.model.aggregates.User;
import Oauth2GoogleJwt.iam.interfaces.rest.resources.AuthenticatedResponseResource;
import Oauth2GoogleJwt.iam.interfaces.rest.resources.UserResource;

public class AuthenticatedResponseResourceFromEntityAssembler {
    public static AuthenticatedResponseResource toResourceFromEntity(User user, String token) {
        UserResource userResource = UserResourceFromEntityAssembler.toResourceFromEntity(user);
        return new AuthenticatedResponseResource(userResource, token);
    }
}