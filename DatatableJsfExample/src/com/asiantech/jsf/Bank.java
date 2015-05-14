package com.asiantech.jsf;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="bank")
@SessionScoped
public class Bank {
		private String name;
		private Date time;
		private String status;
		private boolean pub;
		public Bank(String name, Date time, String status, boolean pub) {
			this.name = name;
			this.time = time;
			this.status = status;
			this.pub = pub;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getTime() {
			return time;
		}
		public void setTime(Date time) {
			this.time = time;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public boolean isPub() {
			return pub;
		}
		public void setPub(boolean pub) {
			this.pub = pub;
		}	

	}