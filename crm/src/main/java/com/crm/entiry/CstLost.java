package com.crm.entiry;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CstLost entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cst_lost")
public class CstLost extends IdEntity {

	// Fields
	private Long lstId;
	private CstCustomer cstCustomer;
	private String lstCustName;
	private Long lstCustManagerId;
	private String lstCustManagerName;
	private Timestamp lstLastOrderDate;
	private Timestamp lstLostDate;
	private String lstDelay;
	private String lstReason;
	private String lstStatus;

	// Constructors

	/** default constructor */
	public CstLost() {
	}

	/** minimal constructor */
	public CstLost(Long lstId, CstCustomer cstCustomer, Long lstCustManagerId, String lstCustManagerName, String lstStatus) {
		this.lstId = lstId;
		this.cstCustomer = cstCustomer;
		this.lstCustManagerId = lstCustManagerId;
		this.lstCustManagerName = lstCustManagerName;
		this.lstStatus = lstStatus;
	}

	/** full constructor */
	public CstLost(Long lstId, CstCustomer cstCustomer, String lstCustName, Long lstCustManagerId, String lstCustManagerName, Timestamp lstLastOrderDate, Timestamp lstLostDate,
			String lstDelay, String lstReason, String lstStatus) {
		this.lstId = lstId;
		this.cstCustomer = cstCustomer;
		this.lstCustName = lstCustName;
		this.lstCustManagerId = lstCustManagerId;
		this.lstCustManagerName = lstCustManagerName;
		this.lstLastOrderDate = lstLastOrderDate;
		this.lstLostDate = lstLostDate;
		this.lstDelay = lstDelay;
		this.lstReason = lstReason;
		this.lstStatus = lstStatus;
	}

	// Property accessors

	public Long getLstId() {
		return this.lstId;
	}

	public void setLstId(Long lstId) {
		this.lstId = lstId;
	}
	@ManyToOne(targetEntity = CstCustomer.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "cstCustomerId")
	public CstCustomer getCstCustomer() {
		return this.cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	public String getLstCustName() {
		return this.lstCustName;
	}

	public void setLstCustName(String lstCustName) {
		this.lstCustName = lstCustName;
	}

	public Long getLstCustManagerId() {
		return this.lstCustManagerId;
	}

	public void setLstCustManagerId(Long lstCustManagerId) {
		this.lstCustManagerId = lstCustManagerId;
	}

	public String getLstCustManagerName() {
		return this.lstCustManagerName;
	}

	public void setLstCustManagerName(String lstCustManagerName) {
		this.lstCustManagerName = lstCustManagerName;
	}

	public Timestamp getLstLastOrderDate() {
		return this.lstLastOrderDate;
	}

	public void setLstLastOrderDate(Timestamp lstLastOrderDate) {
		this.lstLastOrderDate = lstLastOrderDate;
	}

	public Timestamp getLstLostDate() {
		return this.lstLostDate;
	}

	public void setLstLostDate(Timestamp lstLostDate) {
		this.lstLostDate = lstLostDate;
	}

	public String getLstDelay() {
		return this.lstDelay;
	}

	public void setLstDelay(String lstDelay) {
		this.lstDelay = lstDelay;
	}

	public String getLstReason() {
		return this.lstReason;
	}

	public void setLstReason(String lstReason) {
		this.lstReason = lstReason;
	}

	public String getLstStatus() {
		return this.lstStatus;
	}

	public void setLstStatus(String lstStatus) {
		this.lstStatus = lstStatus;
	}

}