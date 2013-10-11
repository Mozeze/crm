package com.crm.entiry;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BasDict entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "bas_dict")
public class BasDict extends IdEntity {

	// Fields
	private Long dictId;
	private String dictType;
	private String dictItem;
	private String dictValue;
	private Boolean dictIsEditable = false;

	// Constructors

	/** default constructor */
	public BasDict() {
	}

	// Property accessors
	public Long getDictId() {
		return dictId;
	}

	public void setDictId(Long dictId) {
		this.dictId = dictId;
	}

	public String getDictType() {
		return this.dictType;
	}

	public void setDictType(String dictType) {
		this.dictType = dictType;
	}

	public String getDictItem() {
		return this.dictItem;
	}

	public void setDictItem(String dictItem) {
		this.dictItem = dictItem;
	}

	public String getDictValue() {
		return this.dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}

	public Boolean getDictIsEditable() {
		return this.dictIsEditable;
	}

	public void setDictIsEditable(Boolean dictIsEditable) {
		this.dictIsEditable = dictIsEditable;
	}

}