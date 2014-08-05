package com.fpt.ruby.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PRODUCTION_COUNTRY")
public class ProductionCountry {
	@Id
	@Column (name = "ISO_3166_1", nullable = false)
	private int iso_3166_1;

	@Column(name = "NAME", nullable = false)
	private String name;

	
	public int getIso_3166_1() {
		return iso_3166_1;
	}

	public void setIso_3166_1(int iso_3166_1) {
		this.iso_3166_1 = iso_3166_1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
