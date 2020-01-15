package com.tml.crm;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedetailsObj", propOrder = {
    "nameMatch",
    "surnameFromPassport",
    "nameScore",
    "nameFromPassport"
})
public class NamedetailsObj {

	
	String nameMatch;
	String surnameFromPassport;
	String nameScore;
	String nameFromPassport;
	public String getNameMatch() {
		return nameMatch;
	}
	public void setNameMatch(String nameMatch) {
		this.nameMatch = nameMatch;
	}
	public String getSurnameFromPassport() {
		return surnameFromPassport;
	}
	public void setSurnameFromPassport(String surnameFromPassport) {
		this.surnameFromPassport = surnameFromPassport;
	}
	public String getNameScore() {
		return nameScore;
	}
	public void setNameScore(String nameScore) {
		this.nameScore = nameScore;
	}
	public String getNameFromPassport() {
		return nameFromPassport;
	}
	public void setNameFromPassport(String nameFromPassport) {
		this.nameFromPassport = nameFromPassport;
	}
	
}
