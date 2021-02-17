package me.guillaume.playground.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PippoRepository extends JpaRepository<Pippo, Long> {

    Pippo findByName(String name);

}
