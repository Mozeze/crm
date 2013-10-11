package com.crm.entiry;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SysRight entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_right")
public class SysRight extends IdEntity {

	// Fields
	private String rightCode;
	private String rightParentCode;
	private String rightType;
	private String rightText;
	private String rightUrl;
	private String rightTip;
	private Set<SysRoleRight> sysRoleRights;

	// Constructors

	/** default constructor */
	public SysRight() {
	}

	// Property accessors

	public String getRightCode() {
		return this.rightCode;
	}

	public void setRightCode(String rightCode) {
		this.rightCode = rightCode;
	}

	public String getRightParentCode() {
		return this.rightParentCode;
	}

	public void setRightParentCode(String rightParentCode) {
		this.rightParentCode = rightParentCode;
	}

	public String getRightType() {
		return this.rightType;
	}

	public void setRightType(String rightType) {
		this.rightType = rightType;
	}

	public String getRightText() {
		return this.rightText;
	}

	public void setRightText(String rightText) {
		this.rightText = rightText;
	}

	public String getRightUrl() {
		return this.rightUrl;
	}

	public void setRightUrl(String rightUrl) {
		this.rightUrl = rightUrl;
	}

	public String getRightTip() {
		return this.rightTip;
	}

	public void setRightTip(String rightTip) {
		this.rightTip = rightTip;
	}

	@OneToMany(targetEntity = SysRoleRight.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "sysRoleRightId")
	public Set<SysRoleRight> getSysRoleRights() {
		return this.sysRoleRights;
	}

	public void setSysRoleRights(Set<SysRoleRight> sysRoleRights) {
		this.sysRoleRights = sysRoleRights;
	}

}