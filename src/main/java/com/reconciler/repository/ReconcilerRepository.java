package com.reconciler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reconciler.model.Reconciler;

public interface ReconcilerRepository extends JpaRepository<Reconciler, Long> {

}
