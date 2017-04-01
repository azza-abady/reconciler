package com.reconciler.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reconciler.model.Role;
import com.reconciler.model.User;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
    Set<Role> findByUsers(User user);
	
}
