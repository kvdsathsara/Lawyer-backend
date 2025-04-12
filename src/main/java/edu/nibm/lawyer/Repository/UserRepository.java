package edu.nibm.lawyer.Repository;

import edu.nibm.lawyer.dto.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    boolean existsByEmail(String email);
    UserEntity findByEmail(String email);
}
