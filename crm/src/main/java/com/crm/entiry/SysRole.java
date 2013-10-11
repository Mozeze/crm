package com.crm.entiry;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.common.collect.Sets;

/**
 * SysRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_role")
public class SysRole extends IdEntity {

	// Fields
	private String roleName;
	private String roleDesc;
	private Integer roleFlag;
	private Set<SysUser> sysUsers = Sets.newHashSet();
	private Set<SysRoleRight> sysRoleRights = Sets.newHashSet();

	// Constructors

	/** default constructor */
	public SysRole() {
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public Integer getRoleFlag() {
		return this.roleFlag;
	}

	public void setRoleFlag(Integer roleFlag) {
		this.roleFlag = roleFlag;
	}

	@OneToMany(targetEntity = SysUser.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "sysUserId")
	public Set<SysUser> getSysUsers() {
		return sysUsers;
	}

	public void setSysUsers(Set<SysUser> sysUsers) {
		this.sysUsers = sysUsers;
	}

	@OneToMany(targetEntity = SysRoleRight.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "sysRoleRightId")
	public Set<SysRoleRight> getSysRoleRights() {
		return sysRoleRights;
	}

	public void setSysRoleRights(Set<SysRoleRight> sysRoleRights) {
		this.sysRoleRights = sysRoleRights;
	}

}