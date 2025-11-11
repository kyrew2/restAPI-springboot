package br.edu.atitus.api_example.repositories;

import br.edu.atitus.api_example.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}
