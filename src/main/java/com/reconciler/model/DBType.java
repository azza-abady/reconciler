package com.reconciler.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dbtypelookup")
public class DBType implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="dbType_id", unique=true, nullable=false)
	private Long typeId;
	
	@Column(unique = true, nullable = false)
	private String typeName;
	
	@Column(unique = true, nullable = false)
	private String driverClassName;
	
	@Column(unique = true, nullable = false)
	private String selectSchemaTablesStmt;
	
	@Column(unique = true,nullable = false)
	private String selectColumnsofSelectedTablesStmt;
	
	private String url;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dbType")
	private List<Configuration> configurationList = new ArrayList<Configuration>();
	
	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	public List<Configuration> getConfigurationList() {
		return configurationList;
	}

	public void setConfigurationList(List<Configuration> configurationList) {
		this.configurationList = configurationList;
	}

	public String getSelectSchemaTablesStmt() {
		return selectSchemaTablesStmt;
	}

	public void setSelectSchemaTablesStmt(String selectSchemaTablesStmt) {
		this.selectSchemaTablesStmt = selectSchemaTablesStmt;
	}

	public String getSelectColumnsofSelectedTablesStmt() {
		return selectColumnsofSelectedTablesStmt;
	}

	public void setSelectColumnsofSelectedTablesStmt(
			String selectColumnsofSelectedTablesStmt) {
		this.selectColumnsofSelectedTablesStmt = selectColumnsofSelectedTablesStmt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((configurationList == null) ? 0 : configurationList
						.hashCode());
		result = prime * result
				+ ((driverClassName == null) ? 0 : driverClassName.hashCode());
		result = prime
				* result
				+ ((selectColumnsofSelectedTablesStmt == null) ? 0
						: selectColumnsofSelectedTablesStmt.hashCode());
		result = prime
				* result
				+ ((selectSchemaTablesStmt == null) ? 0
						: selectSchemaTablesStmt.hashCode());
		result = prime * result + ((typeId == null) ? 0 : typeId.hashCode());
		result = prime * result
				+ ((typeName == null) ? 0 : typeName.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		DBType other = (DBType) obj;
		if (configurationList == null) {
			if (other.configurationList != null)
				return false;
		} else if (!configurationList.equals(other.configurationList))
			return false;
		if (driverClassName == null) {
			if (other.driverClassName != null)
				return false;
		} else if (!driverClassName.equals(other.driverClassName))
			return false;
		if (selectColumnsofSelectedTablesStmt == null) {
			if (other.selectColumnsofSelectedTablesStmt != null)
				return false;
		} else if (!selectColumnsofSelectedTablesStmt
				.equals(other.selectColumnsofSelectedTablesStmt))
			return false;
		if (selectSchemaTablesStmt == null) {
			if (other.selectSchemaTablesStmt != null)
				return false;
		} else if (!selectSchemaTablesStmt.equals(other.selectSchemaTablesStmt))
			return false;
		if (typeId == null) {
			if (other.typeId != null)
				return false;
		} else if (!typeId.equals(other.typeId))
			return false;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DBType [typeId=" + typeId + ", typeName=" + typeName
				+ ", driverClassName=" + driverClassName
				+ ", selectSchemaTablesStmt=" + selectSchemaTablesStmt
				+ ", selectColumnsofSelectedTablesStmt="
				+ selectColumnsofSelectedTablesStmt + ", url=" + url
				+ ", configurationList=" + configurationList + "]";
	}


	
}
