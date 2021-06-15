package com.learning.insurance.party.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person_table")
public class PersonBO extends PartyBO {
	private static final long serialVersionUID = 1L;

	@Embedded
	private PersonNameBO personName;

	@Column(name = "personal_idno", length = 10, nullable = false, unique = true)
	private String personalIdNo;

	public PersonNameBO getPersonName() {
		return personName;
	}

	public void setPersonName(PersonNameBO personName) {
		this.personName = personName;
	}

	public String getPersonalIdNo() {
		return personalIdNo;
	}

	public void setPersonalIdNo(String personalIdNo) {
		this.personalIdNo = personalIdNo;
	}
}
