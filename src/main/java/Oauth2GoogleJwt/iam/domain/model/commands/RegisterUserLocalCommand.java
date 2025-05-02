package Oauth2GoogleJwt.iam.domain.model.commands;

public record RegisterUserLocalCommand(
        String name,
        String email,
        String password
) {
}
