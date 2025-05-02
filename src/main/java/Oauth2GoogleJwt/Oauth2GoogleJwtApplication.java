package Oauth2GoogleJwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Oauth2GoogleJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2GoogleJwtApplication.class, args);
	}

}
