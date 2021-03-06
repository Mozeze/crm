package com.crm.entiry;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CstLinkman entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cst_linkman")
public class CstLinkman extends IdEntity {

	// Fields
	private Long lkmId;
	private CstCustomer cstCustomer;
	private String lkmCustName;
	private String lkmName;
	private String lkmSex;
	private String lkmPostion;
	private String lkmTel;
	private String lkmMobile;
	private String lkmMemo;

	// Constructors

	/** default constructor */
	public CstLinkman() {
	}

	/** minimal constructor */
	public CstLinkman(Long lkmId, CstCustomer cstCustomer, String lkmName, String lkmTel) {
		this.lkmId = lkmId;
		this.cstCustomer = cstCustomer;
		this.lkmName = lkmName;
		this.lkmTel = lkmTel;
	}

	/** full constructor */
	public CstLinkman(Long lkmId, CstCustomer cstCustomer, String lkmCustName, String lkmName, String lkmSex, String lkmPostion, String lkmTel, String lkmMobile, String lkmMemo) {
		this.lkmId = lkmId;
		this.cstCustomer = cstCustomer;
		this.lkmCustName = lkmCustName;
		this.lkmName = lkmName;
		this.lkmSex = lkmSex;
		this.lkmPostion = lkmPostion;
		this.lkmTel = lkmTel;
		this.lkmMobile = lkmMobile;
		this.lkmMemo = lkmMemo;
	}

	// Property accessors

	public Long getLkmId() {
		return this.lkmId;
	}

	public void setLkmId(Long lkmId) {
		this.lkmId = lkmId;
	}
	@ManyToOne(targetEntity = CstCustomer.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "cstCustomerId")
	public CstCustomer getCstCustomer() {
		return this.cstCustomer;
	}

	public void setCstCustomer(CstCustomer cstCustomer) {
		this.cstCustomer = cstCustomer;
	}

	public String getLkmCustName() {
		return this.lkmCustName;
	}

	public void setLkmCustName(String lkmCustName) {
		this.lkmCustName = lkmCustName;
	}

	public String getLkmName() {
		return this.lkmName;
	}

	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}

	public String getLkmSex() {
		return this.lkmSex;
	}

	public void setLkmSex(String lkmSex) {
		this.lkmSex = lkmSex;
	}

	public String getLkmPostion() {
		return this.lkmPostion;
	}

	public void setLkmPostion(String lkmPostion) {
		this.lkmPostion = lkmPostion;
	}

	public String getLkmTel() {
		return this.lkmTel;
	}

	public void setLkmTel(String lkmTel) {
		this.lkmTel = lkmTel;
	}

	public String getLkmMobile() {
		return this.lkmMobile;
	}

	public void setLkmMobile(String lkmMobile) {
		this.lkmMobile = lkmMobile;
	}

	public String getLkmMemo() {
		return this.lkmMemo;
	}

	public void setLkmMemo(String lkmMemo) {
		this.lkmMemo = lkmMemo;
	}

}