package com.reconciler.repository.util;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDataSource;


public class DataSourceFactory extends AbstractDataSource  {


	public  DataSource buildDataSource(String url,String driverClass,String user,String password) {
        return DataSourceBuilder.create()
            .driverClassName(driverClass)
            .url(url)
            .username(user).password(password)
            .build();
    }
	
	public  JdbcTemplate getJdbcTemplate(DataSource datasource){
		if(datasource!=null)
			return new JdbcTemplate(datasource);
		else
			return null;
	}

	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Connection getConnection(String username, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
