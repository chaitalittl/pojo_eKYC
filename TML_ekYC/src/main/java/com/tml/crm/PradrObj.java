package com.tml.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PradrObj", propOrder = {
    "em",
    "adr",
    "addr",
    "mb",
    "ntr"
    
})
public class PradrObj {

	
	String em;
	String adr;
	String addr;
	String mb;
	String ntr;
	public String getEm() {
		return em;
	}
	public void setEm(String em) {
		this.em = em;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMb() {
		return mb;
	}
	public void setMb(String mb) {
		this.mb = mb;
	}
	public String getNtr() {
		return ntr;
	}
	public void setNtr(String ntr) {
		this.ntr = ntr;
	}
	
	
}
