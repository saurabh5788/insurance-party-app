package com.learning.insurance.party.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "organization_table")
public class OrganizationBO extends PartyBO {
	private static final long serialVersionUID = 1L;

	@Embedded
	@AttributeOverride(name = "firstName", column = @Column(name = "contact_first_name"))
	@AttributeOverride(name = "lastName", column = @Column(name = "contact_last_name"))
	private PersonNameBO personName;

	@Column(name = "corporate_idno", length = 10, nullable = false, unique = true)
	private String corporateIdNo;

	public PersonNameBO getPersonName() {
		return personName;
	}

	public void setPersonName(PersonNameBO personName) {
		this.personName = personName;
	}

	public String getCorporateIdNo() {
		return corporateIdNo;
	}

	public void setCorporateIdNo(String corporateIdNo) {
		this.corporateIdNo = corporateIdNo;
	}
}
