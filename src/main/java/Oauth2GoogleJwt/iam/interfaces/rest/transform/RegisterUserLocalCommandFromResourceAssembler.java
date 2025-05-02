package Oauth2GoogleJwt.iam.interfaces.rest.transform;

import Oauth2GoogleJwt.iam.domain.model.commands.RegisterUserLocalCommand;
import Oauth2GoogleJwt.iam.interfaces.rest.resources.RegisterUserLocalResource;

public class RegisterUserLocalCommandFromResourceAssembler {
    public static RegisterUserLocalCommand toCommandFromResource(RegisterUserLocalResource resource) {
        return new RegisterUserLocalCommand(
                resource.name(),
                resource.email(),
                resource.password()
        );
    }
}
