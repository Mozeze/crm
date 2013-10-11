package com.crm.entiry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Storage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Storage")
public class Storage extends IdEntity {

	// Fields
	private Long stkId;
	private Long stkProdId;
	private String stkWarehouse;
	private String stkWare;
	private Integer stkCount;
	private String stkMemo;

	// Constructors

	/** default constructor */
	public Storage() {
	}

	/** minimal constructor */
	public Storage(Long stkId, Long stkProdId, String stkWarehouse, String stkWare, Integer stkCount) {
		this.stkId = stkId;
		this.stkProdId = stkProdId;
		this.stkWarehouse = stkWarehouse;
		this.stkWare = stkWare;
		this.stkCount = stkCount;
	}

	/** full constructor */
	public Storage(Long stkId, Long stkProdId, String stkWarehouse, String stkWare, Integer stkCount, String stkMemo) {
		this.stkId = stkId;
		this.stkProdId = stkProdId;
		this.stkWarehouse = stkWarehouse;
		this.stkWare = stkWare;
		this.stkCount = stkCount;
		this.stkMemo = stkMemo;
	}

	// Property accessors

	public Long getStkId() {
		return this.stkId;
	}

	public void setStkId(Long stkId) {
		this.stkId = stkId;
	}

	public Long getStkProdId() {
		return this.stkProdId;
	}

	public void setStkProdId(Long stkProdId) {
		this.stkProdId = stkProdId;
	}

	public String getStkWarehouse() {
		return this.stkWarehouse;
	}

	public void setStkWarehouse(String stkWarehouse) {
		this.stkWarehouse = stkWarehouse;
	}

	public String getStkWare() {
		return this.stkWare;
	}

	public void setStkWare(String stkWare) {
		this.stkWare = stkWare;
	}

	public Integer getStkCount() {
		return this.stkCount;
	}

	public void setStkCount(Integer stkCount) {
		this.stkCount = stkCount;
	}

	public String getStkMemo() {
		return this.stkMemo;
	}

	public void setStkMemo(String stkMemo) {
		this.stkMemo = stkMemo;
	}

}