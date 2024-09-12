package com.challenge.challenge_API.persistance.repositories;

import com.challenge.challenge_API.persistance.entities.ProvinciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinciaRepository extends JpaRepository<ProvinciaEntity, Integer> {
}
