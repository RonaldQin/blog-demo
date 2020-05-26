package com.sideboy.blog.entity;

/**
 * 后台管理员信息封装实体类。
 * 
 * @author qinbiao
 *
 */
public class AdminUser {

	private Integer adminUserId; // 管理员ID
	private String loginUserName; // 登录用户名
	private String loginPassword; // 登录密码
	private String nickName; // 管理员别名
	private Byte locked; // 标识账号状态

	public AdminUser() {

	}

	public AdminUser(Integer adminUserId, String loginUserName, String loginPassword, String nickName, Byte locked) {
		super();
		this.adminUserId = adminUserId;
		this.loginUserName = loginUserName == null ? null : loginUserName.trim();
		this.loginPassword = loginPassword == null ? null : loginPassword.trim();
		this.nickName = nickName == null ? null : nickName.trim();
		this.locked = locked;
	}

	public Integer getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(Integer adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName == null ? null : loginUserName.trim();
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword == null ? null : loginPassword.trim();
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
	}

	public Byte getLocked() {
		return locked;
	}

	public void setLocked(Byte locked) {
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "AdminUser [adminUserId=" + adminUserId + ", loginUserName=" + loginUserName + ", nickName=" + nickName
				+ ", locked=" + locked + "]";
	}


}
