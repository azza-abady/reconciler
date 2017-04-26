package com.reconciler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reconciler.model.DBType;

public interface DBTypeRepository extends JpaRepository<DBType, Long>{
	@Query(value = "FROM DBType WHERE typeName = ?1")
    DBType findByTypeName(String typename);
}
