package com.asiantech.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="bank")
@SessionScoped
public class UserBean implements Serializable{
  private static final long serialVersionUID = 1L;
  private String name;
  private Date time;
  private String status;
  private boolean pub;
  
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
private static final ArrayList<Bank> bankList = new ArrayList<Bank>(Arrays.asList( 
    new Bank("Tue",new Date(20/1/2015),"Dang su dung",true),
    new Bank("Hoa",new Date(20/3/2015),"Dang su dung",false),
    new Bank("Hai",new Date(20/2/2015),"Ngung su dung",false),
    new Bank("Duc",new Date(20/4/2015),"Dang su dung",true),
    new Bank("Khiem",new Date(20/5/2015),"Tam dung",true)
  ));
   
  public ArrayList<Bank> getBankList() {
    return bankList;
  }
  public String addAction() {
    Bank bank = new Bank(this.name, this.time, 
      this.status, this.pub);
    bankList.add(bank);
    return "";
  }
  public String deleteAction(Bank bank) {
    bankList.remove(bank);
    return "";
  }
}
