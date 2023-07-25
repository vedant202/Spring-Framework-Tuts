package com.SpringBootTuts.SpringBootJpaTuts.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private String lang;
	
	public int getaid() {
		return aid;
	}
	public void setaid(int aid) {
		this.aid = aid;
	}
	public String getaname() {
		return aname;
	}
	public void setaname(String aname) {
		this.aname = aname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public String toString() {
		return "Id: "+this.aid+" Name: "+aname+" language: "+lang;
	}
	
}
