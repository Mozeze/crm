package com.crm.entiry;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SalPlan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sal_plan")
public class SalPlan extends IdEntity {

	// Fields
	private Long plaId;
	private SalChance salChance;
	private Date plaDate;
	private String plaTodo;
	private String plaResult;

	// Constructors

	/** default constructor */
	public SalPlan() {
	}

	/** minimal constructor */
	public SalPlan(Long plaId, SalChance salChance, Timestamp plaDate, String plaTodo) {
		this.plaId = plaId;
		this.salChance = salChance;
		this.plaDate = plaDate;
		this.plaTodo = plaTodo;
	}

	/** full constructor */
	public SalPlan(Long plaId, SalChance salChance, Timestamp plaDate, String plaTodo, String plaResult) {
		this.plaId = plaId;
		this.salChance = salChance;
		this.plaDate = plaDate;
		this.plaTodo = plaTodo;
		this.plaResult = plaResult;
	}

	// Property accessors

	public Long getPlaId() {
		return this.plaId;
	}

	public void setPlaId(Long plaId) {
		this.plaId = plaId;
	}
	@ManyToOne(targetEntity = SalChance.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "salChanceId")
	public SalChance getSalChance() {
		return this.salChance;
	}

	public void setSalChance(SalChance salChance) {
		this.salChance = salChance;
	}

	public Date getPlaDate() {
		return this.plaDate;
	}

	public void setPlaDate(Date plaDate) {
		this.plaDate = plaDate;
	}

	public String getPlaTodo() {
		return this.plaTodo;
	}

	public void setPlaTodo(String plaTodo) {
		this.plaTodo = plaTodo;
	}

	public String getPlaResult() {
		return this.plaResult;
	}

	public void setPlaResult(String plaResult) {
		this.plaResult = plaResult;
	}

}