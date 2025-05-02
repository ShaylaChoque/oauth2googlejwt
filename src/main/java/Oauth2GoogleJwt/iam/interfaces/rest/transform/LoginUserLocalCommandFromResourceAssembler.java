package Oauth2GoogleJwt.iam.interfaces.rest.transform;

import Oauth2GoogleJwt.iam.domain.model.commands.LoginUserLocalCommand;
import Oauth2GoogleJwt.iam.interfaces.rest.resources.LoginUserLocalResource;

public class LoginUserLocalCommandFromResourceAssembler {
    public static LoginUserLocalCommand toCommandFromResource(LoginUserLocalResource resource) {
        return new LoginUserLocalCommand(
                resource.identifier(),
                resource.password()
        );
    }
}
