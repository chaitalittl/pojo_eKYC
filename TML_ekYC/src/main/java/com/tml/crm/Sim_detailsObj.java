package com.tml.crm;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sim_detailsObj", propOrder = {
    "activation_date",
    "last_activity_date",
    "otp_validated",
    "provider",
    "type"
})


public class Sim_detailsObj {

	
	String activation_date;
	String last_activity_date;
	String otp_validated;
	String provider;
	String type;
	
	public String getActivation_date() {
		return activation_date;
	}
	public void setActivation_date(String activation_date) {
		this.activation_date = activation_date;
	}
	public String getLast_activity_date() {
		return last_activity_date;
	}
	public void setLast_activity_date(String last_activity_date) {
		this.last_activity_date = last_activity_date;
	}
	public String getOtp_validated() {
		return otp_validated;
	}
	public void setOtp_validated(String otp_validated) {
		this.otp_validated = otp_validated;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
