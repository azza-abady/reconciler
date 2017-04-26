/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reconciler.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author azza
 */

@Entity
@Table(name = "execution")
public class Execution implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private Timestamp creationDate;
	private Timestamp executionDate;
	private String executionType;

	@OneToOne
	@JoinColumn(name = "reconciler_id")
	private Reconciler reconciler;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Timestamp executionDate) {
		this.executionDate = executionDate;
	}

	public String getExecutionType() {
		return executionType;
	}

	public void setExecutionType(String executionType) {
		this.executionType = executionType;
	}

	public Reconciler getReconciler() {
		return reconciler;
	}

	public void setReconciler(Reconciler reconciler) {
		this.reconciler = reconciler;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result
				+ ((executionDate == null) ? 0 : executionDate.hashCode());
		result = prime * result
				+ ((executionType == null) ? 0 : executionType.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((reconciler == null) ? 0 : reconciler.hashCode());
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
		Execution other = (Execution) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (executionDate == null) {
			if (other.executionDate != null)
				return false;
		} else if (!executionDate.equals(other.executionDate))
			return false;
		if (executionType == null) {
			if (other.executionType != null)
				return false;
		} else if (!executionType.equals(other.executionType))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (reconciler == null) {
			if (other.reconciler != null)
				return false;
		} else if (!reconciler.equals(other.reconciler))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Execution [id=" + id + ", name=" + name + ", creationDate="
				+ creationDate + ", executionDate=" + executionDate
				+ ", executionType=" + executionType + ", reconciler="
				+ reconciler + "]";
	}
	
	
}
