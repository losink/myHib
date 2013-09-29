package com.myHib.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.myHib.bean.People;
import com.myHib.domain.Regedit;
import com.opensymphony.xwork2.ActionSupport;

@Controller("regeditAction")
@Scope("prototype")
public class RegeditAction extends ActionSupport {
	@Resource
	private Regedit regedit;
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
	public String reg(){
		try {
			regedit.saveUser(user);
			setMsg("注册成功");
		} catch (Exception e) {
			e.printStackTrace();
			setMsg("注册失败");
		}
		return "regAfter";
	}
}

