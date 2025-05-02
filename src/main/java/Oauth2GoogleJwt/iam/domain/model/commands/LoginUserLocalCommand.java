package Oauth2GoogleJwt.iam.domain.model.commands;

public record LoginUserLocalCommand(
        String identifier,
        String password
) {
}
