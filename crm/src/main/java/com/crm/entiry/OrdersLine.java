package com.crm.entiry;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * OrdersLine entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orders_line")
public class OrdersLine extends IdEntity {

	// Fields
	private Long oddId;
	private Long oddOrderId;
	private Long oddProdId;
	private Integer oddCount;
	private String oddUnit;
	private Double oddPrice;

	// Constructors

	/** default constructor */
	public OrdersLine() {
	}

	/** minimal constructor */
	public OrdersLine(Long oddId, Long oddOrderId, Long oddProdId, Integer oddCount) {
		this.oddId = oddId;
		this.oddOrderId = oddOrderId;
		this.oddProdId = oddProdId;
		this.oddCount = oddCount;
	}

	/** full constructor */
	public OrdersLine(Long oddId, Long oddOrderId, Long oddProdId, Integer oddCount, String oddUnit, Double oddPrice) {
		this.oddId = oddId;
		this.oddOrderId = oddOrderId;
		this.oddProdId = oddProdId;
		this.oddCount = oddCount;
		this.oddUnit = oddUnit;
		this.oddPrice = oddPrice;
	}

	// Property accessors

	public Long getOddId() {
		return this.oddId;
	}

	public void setOddId(Long oddId) {
		this.oddId = oddId;
	}

	public Long getOddOrderId() {
		return this.oddOrderId;
	}

	public void setOddOrderId(Long oddOrderId) {
		this.oddOrderId = oddOrderId;
	}

	public Long getOddProdId() {
		return this.oddProdId;
	}

	public void setOddProdId(Long oddProdId) {
		this.oddProdId = oddProdId;
	}

	public Integer getOddCount() {
		return this.oddCount;
	}

	public void setOddCount(Integer oddCount) {
		this.oddCount = oddCount;
	}

	public String getOddUnit() {
		return this.oddUnit;
	}

	public void setOddUnit(String oddUnit) {
		this.oddUnit = oddUnit;
	}

	public Double getOddPrice() {
		return this.oddPrice;
	}

	public void setOddPrice(Double oddPrice) {
		this.oddPrice = oddPrice;
	}

}