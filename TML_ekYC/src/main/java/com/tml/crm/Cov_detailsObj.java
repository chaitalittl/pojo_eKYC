package com.tml.crm;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cov_detailsObj", propOrder = {
    "issue_date",
    "cov"    
})


public class Cov_detailsObj {

	
	String issue_date;
	String cov;
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getCov() {
		return cov;
	}
	public void setCov(String cov) {
		this.cov = cov;
	}
	
}
