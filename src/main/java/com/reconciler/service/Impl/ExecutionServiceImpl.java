package com.reconciler.service.Impl;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.reconciler.model.Configuration;
import com.reconciler.model.Reconciler;
import com.reconciler.repository.ReconcilerRepository;
import com.reconciler.repository.util.DataSourceFactory;
import com.reconciler.service.IExecutionService;
import com.reconciler.util.ExecutionUtils;
import com.reconciler.util.IConstant;

@Service
public class ExecutionServiceImpl implements IExecutionService {

	@Autowired
	private ReconcilerRepository reconRepo;

	@Autowired
    private DataSourceFactory dataSourceFactory;
	 	

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rescheduleExection() {
		// TODO Auto-generated method stub

	}

	@Override
	public Reconciler getselectedRecon(String name) {
		if (name != null && !name.equalsIgnoreCase("")) {
			return reconRepo.findByName(name);
		} else {
			return null;
		}
	}

	@Override
	public List<String> getAllReconNames() {
		return reconRepo.getAllReconNames();
	}

	@Override
	public JdbcTemplate getJdbcTemplateForConfiguration(Configuration config) {
		if (config != null) {
			String url=ExecutionUtils.prepareDSUrl(config);
			return dataSourceFactory.getJdbcTemplate(dataSourceFactory.buildDataSource(url, config.getDbType().getDriverClassName(), config.getUserName(), config.getPassword()));
		} else {
			return null;
		}	

	}

}
