package Oauth2GoogleJwt.iam.domain.model.aggregates;

import Oauth2GoogleJwt.iam.domain.model.enums.AuthProvider;
import Oauth2GoogleJwt.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "users")
public class User extends AuditableAbstractAggregateRoot<User> {
    private String name;
    private String email;
    private String password;

    @Enumerated
    private AuthProvider authProvider;
}
