package Oauth2GoogleJwt.iam.interfaces.rest.transform;

import Oauth2GoogleJwt.iam.domain.model.aggregates.User;
import Oauth2GoogleJwt.iam.interfaces.rest.resources.UserResource;

public class UserResourceFromEntityAssembler {
    public static UserResource toResourceFromEntity(User user){
        return new UserResource(user.getId(), user.getName(), user.getEmail(), user.getAuthProvider());
    }
}
