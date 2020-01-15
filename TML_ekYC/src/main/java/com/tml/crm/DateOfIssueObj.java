package com.tml.crm;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOfIssueObj", propOrder = {
    "dispatchedOnFromSource",
    "dateOfIssueMatch"
})


public class DateOfIssueObj {

	
	String dispatchedOnFromSource;
	String dateOfIssueMatch;
	public String getDispatchedOnFromSource() {
		return dispatchedOnFromSource;
	}
	public void setDispatchedOnFromSource(String dispatchedOnFromSource) {
		this.dispatchedOnFromSource = dispatchedOnFromSource;
	}
	public String getDateOfIssueMatch() {
		return dateOfIssueMatch;
	}
	public void setDateOfIssueMatch(String dateOfIssueMatch) {
		this.dateOfIssueMatch = dateOfIssueMatch;
	}
	
}
