package com.reconciler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reconciler.model.DBType;
import com.reconciler.model.Reconciler;

public interface ReconcilerRepository extends JpaRepository<Reconciler, Long> {
	@Query(value = "FROM Reconciler WHERE name = ?1")
    Reconciler findByName(String name);
	
	@Query(value = "select name FROM Reconciler")
	List<String> getAllReconNames();
}
