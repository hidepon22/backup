package com.internousdev.template.dto;

public class LoginDTO {
	private String LoginID;
	private String loginPassword;
	private String userName;
	private boolean loginFlg = false;

	public String getLoginId(){
		return LoginID;
	}
	public void setLoginId(String loginId){
		this.LoginID = loginId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}

}
