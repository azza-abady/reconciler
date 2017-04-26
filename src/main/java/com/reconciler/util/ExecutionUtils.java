package com.reconciler.util;

import com.reconciler.model.Configuration;

public class ExecutionUtils {
	
	public static String prepareDSUrl(Configuration config) {

			if (config.getDbType().getUrl() != null && !config.getDbType().getUrl().equalsIgnoreCase("")) {
				if (config.getIp() != null
						&& !config.getIp().equalsIgnoreCase("")) {
					config.getDbType().getUrl().replace(IConstant.localhost, config.getIp().trim());
				}
				if (config.getPort() != null
						&& !config.getPort().equalsIgnoreCase("")) {
					config.getDbType().getUrl().replace(IConstant.port, config.getPort().trim());
				}
				if (config.getServiceName() != null && !config.getServiceName().equalsIgnoreCase("")) {
					config.getDbType().getUrl().replace(IConstant.serviceName,
							config.getServiceName());
				}
			}
		return config.getDbType().getUrl();
	}
}
