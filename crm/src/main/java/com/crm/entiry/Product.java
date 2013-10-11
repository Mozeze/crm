package com.crm.entiry;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Product")
public class Product extends IdEntity {

	// Fields
	private Long prodId;
	private String prodName;
	private String prodType;
	private String prodBatch;
	private String prodUnit;
	private Double prodPrice;
	private String prodMemo;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Long prodId, String prodName, String prodType) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodType = prodType;
	}

	/** full constructor */
	public Product(Long prodId, String prodName, String prodType, String prodBatch, String prodUnit, Double prodPrice, String prodMemo) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodType = prodType;
		this.prodBatch = prodBatch;
		this.prodUnit = prodUnit;
		this.prodPrice = prodPrice;
		this.prodMemo = prodMemo;
	}

	// Property accessors

	public Long getProdId() {
		return this.prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdBatch() {
		return this.prodBatch;
	}

	public void setProdBatch(String prodBatch) {
		this.prodBatch = prodBatch;
	}

	public String getProdUnit() {
		return this.prodUnit;
	}

	public void setProdUnit(String prodUnit) {
		this.prodUnit = prodUnit;
	}

	public Double getProdPrice() {
		return this.prodPrice;
	}

	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdMemo() {
		return this.prodMemo;
	}

	public void setProdMemo(String prodMemo) {
		this.prodMemo = prodMemo;
	}

}