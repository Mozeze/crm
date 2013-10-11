package com.crm.entiry;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SysRoleRight entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_role_right")
public class SysRoleRight extends IdEntity {

	// Fields
	private SysRight sysRight;
	private SysRole sysRole;

	// Constructors

	/** default constructor */
	public SysRoleRight() {
	}

	// Property accessors
	@ManyToOne(targetEntity = SysRight.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "sysRightId")
	public SysRight getSysRight() {
		return sysRight;
	}

	public void setSysRight(SysRight sysRight) {
		this.sysRight = sysRight;
	}

	@ManyToOne(targetEntity = SysRole.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "sysRoleId")
	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

}