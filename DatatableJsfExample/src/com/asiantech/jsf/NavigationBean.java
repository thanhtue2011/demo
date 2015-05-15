package com.asiantech.jsf;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(value="navigationBean")
@SessionScoped
public class NavigationBean implements Serializable {

	private static final long serialVersionUID = 1520318172495977648L;
	public String redirectToLogin() {
		return "./login.jsf?faces-redirect=true";
	}
	public String toLogin() {
		return "./login.xhtml";
	}
	public String redirectToInfo() {
	     return "./home.xhtml";
	 }
	public String redirectToWelcome() {
		return "./home.jsf";
	}
	
}