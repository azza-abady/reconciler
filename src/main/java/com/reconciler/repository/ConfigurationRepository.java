package com.reconciler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reconciler.model.Configuration;

public interface ConfigurationRepository extends
		JpaRepository<Configuration, Long> {

}
