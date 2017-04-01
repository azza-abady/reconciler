package com.reconciler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reconciler.model.Execution;

public interface ExecutionRepository extends JpaRepository<Execution, Long> {

}
