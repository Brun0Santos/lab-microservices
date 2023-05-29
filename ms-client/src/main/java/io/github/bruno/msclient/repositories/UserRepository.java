package io.github.bruno.msclient.repositories;

import io.github.bruno.msclient.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUserName(@Param("username") String username);
}
