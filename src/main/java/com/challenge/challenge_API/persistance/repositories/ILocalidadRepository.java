package com.challenge.challenge_API.persistance.repositories;

import com.challenge.challenge_API.persistance.entities.LocalidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocalidadRepository extends JpaRepository<LocalidadEntity, Integer> {
}
