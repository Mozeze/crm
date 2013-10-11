package com.crm.entiry;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Orders")
public class Orders extends IdEntity {

	// Fields
	private Long odrId;
	private String odrCustomer;
	private Timestamp odrDate;
	private String odrAddr;
	private String odrStatus;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Long odrId, String odrCustomer, Timestamp odrDate, String odrStatus) {
		this.odrId = odrId;
		this.odrCustomer = odrCustomer;
		this.odrDate = odrDate;
		this.odrStatus = odrStatus;
	}

	/** full constructor */
	public Orders(Long odrId, String odrCustomer, Timestamp odrDate, String odrAddr, String odrStatus) {
		this.odrId = odrId;
		this.odrCustomer = odrCustomer;
		this.odrDate = odrDate;
		this.odrAddr = odrAddr;
		this.odrStatus = odrStatus;
	}

	// Property accessors

	public Long getOdrId() {
		return this.odrId;
	}

	public void setOdrId(Long odrId) {
		this.odrId = odrId;
	}

	public String getOdrCustomer() {
		return this.odrCustomer;
	}

	public void setOdrCustomer(String odrCustomer) {
		this.odrCustomer = odrCustomer;
	}

	public Timestamp getOdrDate() {
		return this.odrDate;
	}

	public void setOdrDate(Timestamp odrDate) {
		this.odrDate = odrDate;
	}

	public String getOdrAddr() {
		return this.odrAddr;
	}

	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr;
	}

	public String getOdrStatus() {
		return this.odrStatus;
	}

	public void setOdrStatus(String odrStatus) {
		this.odrStatus = odrStatus;
	}

}