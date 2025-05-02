package Oauth2GoogleJwt.iam.domain.services;

import Oauth2GoogleJwt.iam.domain.model.aggregates.User;
import Oauth2GoogleJwt.iam.domain.model.commands.DeleteUserByIdCommand;
import Oauth2GoogleJwt.iam.domain.model.commands.LoginUserGoogleCommand;
import Oauth2GoogleJwt.iam.domain.model.commands.LoginUserLocalCommand;
import Oauth2GoogleJwt.iam.domain.model.commands.RegisterUserLocalCommand;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Optional;

public interface UserCommandService {
    Optional<User> handle(RegisterUserLocalCommand command);
    Optional<ImmutablePair<User, String>> handle(LoginUserLocalCommand command);
    Optional<ImmutablePair<User, String>> handle(LoginUserGoogleCommand command);
    void handle(DeleteUserByIdCommand command);
}
