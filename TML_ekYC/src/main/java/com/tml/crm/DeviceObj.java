package com.tml.crm;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceObj", propOrder = {
    "s3g_support",
    "device_activation_date",
    "imei",
    "model"
})


public class DeviceObj {

	
	String s3g_support;
	String device_activation_date;
	String imei;
	String model;
	public String getS3g_support() {
		return s3g_support;
	}
	public void setS3g_support(String s3g_support) {
		this.s3g_support = s3g_support;
	}
	public String getDevice_activation_date() {
		return device_activation_date;
	}
	public void setDevice_activation_date(String device_activation_date) {
		this.device_activation_date = device_activation_date;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
