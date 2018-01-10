package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateComplateAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object> session;
	private UserCreateComplateDAO userCreateComplateDAO = new UserCreateComplateDAO();
	public String execute() throws SQLException{

	}

}
