package com.tml.crm;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassportNumberObj", propOrder = {
    "passportNumberFromSource",
    "passportNumberMatch"
})


public class PassportNumberObj {

String passportNumberFromSource;
	
	String passportNumberMatch;

	public String getPassportNumberFromSource() {
		return passportNumberFromSource;
	}

	public void setPassportNumberFromSource(String passportNumberFromSource) {
		this.passportNumberFromSource = passportNumberFromSource;
	}

	public String getPassportNumberMatch() {
		return passportNumberMatch;
	}

	public void setPassportNumberMatch(String passportNumberMatch) {
		this.passportNumberMatch = passportNumberMatch;
	}
	
}
