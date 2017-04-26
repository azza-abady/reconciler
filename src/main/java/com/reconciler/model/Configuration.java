/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reconciler.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author azza
 */

@Entity
@Table(name="configuration")
public class Configuration implements Serializable {
 
	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name = "config_id", unique = true, nullable = false)
    private Long configId;
    
	@Column(nullable = false)
	private String condfigName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dbType_id",nullable=false)
	private DBType dbType;
    
	@Column(nullable = false)
    private String ip;
	
    private String port;
    
	@Column(nullable = false)
    private String userName;
    
	@Column(nullable = false)
    private String password;
	
    @Column(nullable = false)
    private String serviceName;
   
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reconciler_id",nullable=false)
    private Reconciler reconciler;

    @Column(nullable = false)
    private boolean reference;

	public Long getConfigId() {
		return configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
	}
	
	public DBType getDbType() {
		return dbType;
	}

	public void setDbType(DBType type) {
		this.dbType = type;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Reconciler getReconciler() {
		return reconciler;
	}

	public void setReconciler(Reconciler reconciler) {
		this.reconciler = reconciler;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isReference() {
		return reference;
	}

	public void setReference(boolean reference) {
		this.reference = reference;
	}

	public String getCondfigName() {
		return condfigName;
	}

	public void setCondfigName(String condfigName) {
		this.condfigName = condfigName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((condfigName == null) ? 0 : condfigName.hashCode());
		result = prime * result
				+ ((configId == null) ? 0 : configId.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((port == null) ? 0 : port.hashCode());
		result = prime * result
				+ ((reconciler == null) ? 0 : reconciler.hashCode());
		result = prime * result + (reference ? 1231 : 1237);
		result = prime * result
				+ ((serviceName == null) ? 0 : serviceName.hashCode());
		result = prime * result + ((dbType == null) ? 0 : dbType.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuration other = (Configuration) obj;
		if (condfigName == null) {
			if (other.condfigName != null)
				return false;
		} else if (!condfigName.equals(other.condfigName))
			return false;
		if (configId == null) {
			if (other.configId != null)
				return false;
		} else if (!configId.equals(other.configId))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (port == null) {
			if (other.port != null)
				return false;
		} else if (!port.equals(other.port))
			return false;
		if (reconciler == null) {
			if (other.reconciler != null)
				return false;
		} else if (!reconciler.equals(other.reconciler))
			return false;
		if (reference != other.reference)
			return false;
		if (serviceName == null) {
			if (other.serviceName != null)
				return false;
		} else if (!serviceName.equals(other.serviceName))
			return false;
		if (dbType == null) {
			if (other.dbType != null)
				return false;
		} else if (!dbType.equals(other.dbType))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Configuration [configId=" + configId + ", condfigName="
				+ condfigName + ", type=" + dbType + ", ip=" + ip + ", port="
				+ port + ", userName=" + userName + ", password=" + password
				+ ", serviceName=" + serviceName
				+ ", reconciler=" + reconciler + ", reference=" + reference
				+ "]";
	}

}
