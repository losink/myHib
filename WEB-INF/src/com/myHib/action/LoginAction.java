package com.myHib.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.myHib.bean.People;
import com.myHib.domain.Login;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport {
	@Resource
	private Login login;
	private String msg;
	private People user;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public People getUser() {
		return user;
	}
	public void setUser(People user) {
		this.user = user;
	}
	public String login(){
		boolean isSuccess = login.login(user);
		if(isSuccess){
			setMsg("登录成功");
		}else{
			setMsg("登录失败");
		}
		return "loginAfter";
	}
}

