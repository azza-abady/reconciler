/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reconciler.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 *
 * @author azza
 */

@Entity
@Table(name = "reconciler")
public class Reconciler implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reconciler_id", unique=true, nullable=false)
	private Long id;
	
	@Column(unique=true,nullable=false)
	private String name;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "reconciler")
	private List<Configuration> configurationList = new ArrayList<Configuration>();

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

	public List<Configuration> getConfigurationList() {
		return configurationList;
	}

	public void setConfigurationList(List<Configuration> configurationList) {
		this.configurationList = configurationList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((configurationList == null) ? 0 : configurationList
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Reconciler other = (Reconciler) obj;
		if (configurationList == null) {
			if (other.configurationList != null)
				return false;
		} else if (!configurationList.equals(other.configurationList))
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
		return true;
	}

	@Override
	public String toString() {
		return "Reconciler [id=" + id + ", name=" + name
				+ ", configurationList=" + configurationList + "]";
	}

}
