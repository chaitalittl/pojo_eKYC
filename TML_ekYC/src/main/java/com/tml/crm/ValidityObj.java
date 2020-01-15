package com.tml.crm;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityObj", propOrder = {
    "non_transport",
    "transport"    
})


public class ValidityObj {

	
	String non_transport;
	String transport;
	
	public String getNon_transport() {
		return non_transport;
	}
	public void setNon_transport(String non_transport) {
		this.non_transport = non_transport;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
}
