package com.tml.crm;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactObj", propOrder = {
    "address",
    "alt_contact",
    "email_id",
    "work_email"
})


public class ContactObj {

	
	String address;
	String alt_contact;
	String email_id;
	String work_email;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAlt_contact() {
		return alt_contact;
	}
	public void setAlt_contact(String alt_contact) {
		this.alt_contact = alt_contact;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getWork_email() {
		return work_email;
	}
	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}
	
	
}
