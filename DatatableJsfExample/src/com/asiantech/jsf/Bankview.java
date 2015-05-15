package com.asiantech.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
@ManagedBean(name="dataview")
@ViewScoped
public class Bankview implements Serializable {
	private ArrayList<Bank> banks;
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
	
    @ManagedProperty("#{bankservice}")
    private Bankservice service;
 
    @PostConstruct
    public void init() {
        banks = service.getBankList();
    }
     
    public List<Bank> getBanks() {
        return banks;
    }
 
    public void setService(Bankservice service) {
        this.service = service;
    }
    public String addAction() {
    	  Bank bank = new Bank(this.name,this.time,this.status,this.pub);
          banks.add(bank);
        return null;
    }
 
    public void onCancel(RowEditEvent event) {  
    	FacesMessage msg = new FacesMessage("Xoa thanh cong!");   
    	FacesContext.getCurrentInstance().addMessage(null, msg); 
        banks.remove((Bank) event.getObject());
     }  
    public void onEdit(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Sua thanh cong!",((Bank) event.getObject()).getName());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    } 

}