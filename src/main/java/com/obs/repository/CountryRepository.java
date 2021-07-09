package com.obs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.obs.domain.Country;

public interface CountryRepository extends CrudRepository<Country, String> {

//	List<Country> get();
    List<Country> findAll();


}
