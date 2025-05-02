package Oauth2GoogleJwt.iam.application.internal.queryservices;

import Oauth2GoogleJwt.iam.domain.model.aggregates.User;
import Oauth2GoogleJwt.iam.domain.model.queries.GetAllUsersQuery;
import Oauth2GoogleJwt.iam.domain.model.queries.GetUserByIdQuery;
import Oauth2GoogleJwt.iam.domain.services.UserQueryService;
import Oauth2GoogleJwt.iam.infrastructure.persistence.jpa.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserQueryServiceImpl implements UserQueryService {
    private final UserRepository userRepository;

    @Override
    public List<User> handle(GetAllUsersQuery query) {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> handle(GetUserByIdQuery query) {
        return userRepository.findById(query.userId());
    }
}