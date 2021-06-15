package com.learning.insurance.party.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class PartyBO extends AbstractBO {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "party_phone_table", joinColumns = @JoinColumn(name = "party_id"))
	private Set<PhoneBO> phones = new HashSet<PhoneBO>();
	
	@Column(name = "expired_status", nullable = true)
	private Boolean expiredStatus;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Set<PhoneBO> getPhones() {
		return phones;
	}
	public void setPhones(Set<PhoneBO> phones) {
		this.phones = phones;
	}
	public Boolean getExpiredStatus() {
		return expiredStatus;
	}
	public void setExpiredStatus(Boolean expiredStatus) {
		this.expiredStatus = expiredStatus;
	}
}
