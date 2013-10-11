package com.crm.entiry;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.google.common.collect.Sets;

/**
 * SalChance entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sal_chance")
public class SalChance extends IdEntity {

	// Fields
	private Long chcId;
	private String chcSource;
	private String chcCustName;
	private String chcTitle;
	private Integer chcRate;
	private String chcLinkman;
	private String chcTel;
	private String chcDesc;
	private Long chcCreateId;
	private String chcCreateBy;
	private Timestamp chcCreateDate;
	private Long chcDueId;
	private String chcDueTo;
	private Timestamp chcDueDate;
	private String chcStatus;
	private Set<SalPlan> salPlans = Sets.newHashSet();

	// Constructors

	/** default constructor */
	public SalChance() {
	}

	/** minimal constructor */
	public SalChance(Long chcId, String chcCustName, String chcTitle, Integer chcRate, String chcDesc, Long chcCreateId, String chcCreateBy, Timestamp chcCreateDate,
			String chcStatus) {
		this.chcId = chcId;
		this.chcCustName = chcCustName;
		this.chcTitle = chcTitle;
		this.chcRate = chcRate;
		this.chcDesc = chcDesc;
		this.chcCreateId = chcCreateId;
		this.chcCreateBy = chcCreateBy;
		this.chcCreateDate = chcCreateDate;
		this.chcStatus = chcStatus;
	}

	/** full constructor */
	public SalChance(Long chcId, String chcSource, String chcCustName, String chcTitle, Integer chcRate, String chcLinkman, String chcTel, String chcDesc, Long chcCreateId,
			String chcCreateBy, Timestamp chcCreateDate, Long chcDueId, String chcDueTo, Timestamp chcDueDate, String chcStatus, Set salPlans) {
		this.chcId = chcId;
		this.chcSource = chcSource;
		this.chcCustName = chcCustName;
		this.chcTitle = chcTitle;
		this.chcRate = chcRate;
		this.chcLinkman = chcLinkman;
		this.chcTel = chcTel;
		this.chcDesc = chcDesc;
		this.chcCreateId = chcCreateId;
		this.chcCreateBy = chcCreateBy;
		this.chcCreateDate = chcCreateDate;
		this.chcDueId = chcDueId;
		this.chcDueTo = chcDueTo;
		this.chcDueDate = chcDueDate;
		this.chcStatus = chcStatus;
		this.salPlans = salPlans;
	}

	// Property accessors

	public Long getChcId() {
		return this.chcId;
	}

	public void setChcId(Long chcId) {
		this.chcId = chcId;
	}

	public String getChcSource() {
		return this.chcSource;
	}

	public void setChcSource(String chcSource) {
		this.chcSource = chcSource;
	}

	public String getChcCustName() {
		return this.chcCustName;
	}

	public void setChcCustName(String chcCustName) {
		this.chcCustName = chcCustName;
	}

	public String getChcTitle() {
		return this.chcTitle;
	}

	public void setChcTitle(String chcTitle) {
		this.chcTitle = chcTitle;
	}

	public Integer getChcRate() {
		return this.chcRate;
	}

	public void setChcRate(Integer chcRate) {
		this.chcRate = chcRate;
	}

	public String getChcLinkman() {
		return this.chcLinkman;
	}

	public void setChcLinkman(String chcLinkman) {
		this.chcLinkman = chcLinkman;
	}

	public String getChcTel() {
		return this.chcTel;
	}

	public void setChcTel(String chcTel) {
		this.chcTel = chcTel;
	}

	public String getChcDesc() {
		return this.chcDesc;
	}

	public void setChcDesc(String chcDesc) {
		this.chcDesc = chcDesc;
	}

	public Long getChcCreateId() {
		return this.chcCreateId;
	}

	public void setChcCreateId(Long chcCreateId) {
		this.chcCreateId = chcCreateId;
	}

	public String getChcCreateBy() {
		return this.chcCreateBy;
	}

	public void setChcCreateBy(String chcCreateBy) {
		this.chcCreateBy = chcCreateBy;
	}

	public Timestamp getChcCreateDate() {
		return this.chcCreateDate;
	}

	public void setChcCreateDate(Timestamp chcCreateDate) {
		this.chcCreateDate = chcCreateDate;
	}

	public Long getChcDueId() {
		return this.chcDueId;
	}

	public void setChcDueId(Long chcDueId) {
		this.chcDueId = chcDueId;
	}

	public String getChcDueTo() {
		return this.chcDueTo;
	}

	public void setChcDueTo(String chcDueTo) {
		this.chcDueTo = chcDueTo;
	}

	public Timestamp getChcDueDate() {
		return this.chcDueDate;
	}

	public void setChcDueDate(Timestamp chcDueDate) {
		this.chcDueDate = chcDueDate;
	}

	public String getChcStatus() {
		return this.chcStatus;
	}

	public void setChcStatus(String chcStatus) {
		this.chcStatus = chcStatus;
	}
	@OneToMany(targetEntity = SalPlan.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "salPlanId")
	public Set getSalPlans() {
		return this.salPlans;
	}

	public void setSalPlans(Set salPlans) {
		this.salPlans = salPlans;
	}

}