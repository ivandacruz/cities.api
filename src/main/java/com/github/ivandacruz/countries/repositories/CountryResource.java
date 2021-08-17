package com.github.ivandacruz.countries.repositories;

import com.github.ivandacruz.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}