package com.reconciler.DTO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class SourceDTO {
	
	private JdbcTemplate jdbcTemplate;
	private String sqlStatment;
	private String confgName;
	private SqlRowSet result;

	
	
	public String getSqlStatment() {
		return sqlStatment;
	}
	public void setSqlStatment(String sqlStatment) {
		this.sqlStatment = sqlStatment;
	}
	public String getConfgName() {
		return confgName;
	}
	public void setConfgName(String confgName) {
		this.confgName = confgName;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public SqlRowSet getResult() {
		return result;
	}
	public void setResult(SqlRowSet result) {
		this.result = result;
	}
	
}
