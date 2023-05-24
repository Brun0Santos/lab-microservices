package io.github.bruno.msclient.repositories;

import io.github.bruno.msclient.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
    void deleteById(Integer id);
}
