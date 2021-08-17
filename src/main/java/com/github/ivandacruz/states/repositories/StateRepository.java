package com.github.ivandacruz.staties.repositories;


import com.github.ivandacruz.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
