package Oauth2GoogleJwt.iam.domain.services;

import Oauth2GoogleJwt.iam.domain.model.aggregates.User;
import Oauth2GoogleJwt.iam.domain.model.queries.GetAllUsersQuery;
import Oauth2GoogleJwt.iam.domain.model.queries.GetUserByIdQuery;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {
    List<User> handle(GetAllUsersQuery query);
    Optional<User> handle(GetUserByIdQuery query);
}
