package com.learning.insurance.party.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PhoneBO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "phone_no", nullable = false, unique = false, insertable = true, updatable = true)
	private Long phoneNo;
	@Column(name = "country_cd", nullable = false, unique = false, insertable = true, updatable = true)
	private Long countryCode;
	@Column(name = "area_cd", nullable = false, unique = false, insertable = true, updatable = true)
	private Long areaCode;
	@Column(name = "extn", nullable = false, unique = false, insertable = true, updatable = true)
	private Long extension;

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Long getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Long countryCode) {
		this.countryCode = countryCode;
	}

	public Long getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public Long getExtension() {
		return extension;
	}

	public void setExtension(Long extension) {
		this.extension = extension;
	}
}
