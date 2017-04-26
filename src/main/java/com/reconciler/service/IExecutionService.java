package com.reconciler.service;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;

import com.reconciler.model.Configuration;
import com.reconciler.model.Reconciler;

public interface IExecutionService {
	

	void execute();

	void rescheduleExection();
	
	Reconciler getselectedRecon(String name);
	
	List<String> getAllReconNames();
	
	JdbcTemplate getJdbcTemplateForConfiguration(Configuration config);
}
