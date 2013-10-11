package com.crm.entiry;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CstActivity entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cst_activity")
public class CstActivity extends IdEntity {

	// Fields
	private Long atvId;
	private CstCustomer cstCustomer;
	private String atvCustName;
	private Timestamp atvDate;
	private String atvPlace;
	private String atvTitle;
	private String atvDesc;

	// Constructors

	/** default constructor */
	public CstActivity() {
	}

	/** minimal constructor */
	public CstActivity(Long atvId, Timestamp atvDate, String atvPlace, String atvTitle) {
		this.atvId = atvId;
		this.atvDate = atvDate;
		this.atvPlace = atvPlace;
		this.atvTitle = atvTitle;
	}

	/** full constructor */
	public CstActivity(Long atvId, CstCustomer cstCustomer, String atvCustName, Timestamp atvDate, String atvPlace, String atvTitle, String atvDesc) {
		this.atvId = atvId;
		this.cstCustomer = cstCustomer;
		this.atvCustName = atvCustName;
		this.atvDate = atvDate;
		this.atvPlace = atvPlace;
		this.atvTitle = atvTitle;
		this.atvDesc = atvDesc;
	}

	// Property accessors

	public Long getAtvId() {
		return this.atvId;
	}

	public void setAtvId(Long atvId) {
		this.atvId = atvId;
	}
	@ManyToOne(targetEntity = CstCustomer.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "cstCustomerId")
	public CstCustomer getCstCustomer() {
		return this.cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	public String getAtvCustName() {
		return this.atvCustName;
	}

	public void setAtvCustName(String atvCustName) {
		this.atvCustName = atvCustName;
	}

	public Timestamp getAtvDate() {
		return this.atvDate;
	}

	public void setAtvDate(Timestamp atvDate) {
		this.atvDate = atvDate;
	}

	public String getAtvPlace() {
		return this.atvPlace;
	}

	public void setAtvPlace(String atvPlace) {
		this.atvPlace = atvPlace;
	}

	public String getAtvTitle() {
		return this.atvTitle;
	}

	public void setAtvTitle(String atvTitle) {
		this.atvTitle = atvTitle;
	}

	public String getAtvDesc() {
		return this.atvDesc;
	}

	public void setAtvDesc(String atvDesc) {
		this.atvDesc = atvDesc;
	}

}