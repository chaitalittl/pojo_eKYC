package com.tml.crm;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "Check", propOrder = {
	    "pDOC_TYPE",
	  "pROW_ID",
	    "pCONSENT",
	    "pDOCUMENT_NO",
	    "pFULL_NAME",
	    "pDOB",
	    "pSERVICE_PROVIDER",
	    "pMOBILE_NO",
	    "pOTP",
	    "pLOGIN_ID",
		"pState",
		"pDOI",
		"pFileNo"
	})
public class KYCInput {

	protected String pDOC_TYPE;
	protected String pROW_ID;
	protected String pCONSENT;
	protected String pDOCUMENT_NO;
	protected String pFULL_NAME;
	protected String pDOB;
	protected String pSERVICE_PROVIDER;
	
	protected String pMOBILE_NO;
	protected String pOTP;
	protected String pLOGIN_ID;
	protected String pState;
	protected String pDOI;
	protected String pFileNo;
	public String getpDOC_TYPE() {
		return pDOC_TYPE;
	}
	public void setpDOC_TYPE(String pDOC_TYPE) {
		this.pDOC_TYPE = pDOC_TYPE;
	}
	public String getpCONSENT() {
		return pCONSENT;
	}
	public void setpCONSENT(String pCONSENT) {
		this.pCONSENT = pCONSENT;
	}
	public String getpDOCUMENT_NO() {
		return pDOCUMENT_NO;
	}
	public void setpDOCUMENT_NO(String pDOCUMENT_NO) {
		this.pDOCUMENT_NO = pDOCUMENT_NO;
	}
	public String getpFULL_NAME() {
		return pFULL_NAME;
	}
	public void setpFULL_NAME(String pFULL_NAME) {
		this.pFULL_NAME = pFULL_NAME;
	}
	public String getpDOB() {
		return pDOB;
	}
	public void setpDOB(String pDOB) {
		this.pDOB = pDOB;
	}
	public String getpSERVICE_PROVIDER() {
		return pSERVICE_PROVIDER;
	}
	public void setpSERVICE_PROVIDER(String pSERVICE_PROVIDER) {
		this.pSERVICE_PROVIDER = pSERVICE_PROVIDER;
	}
	public String getpMOBILE_NO() {
		return pMOBILE_NO;
	}
	public void setpMOBILE_NO(String pMOBILE_NO) {
		this.pMOBILE_NO = pMOBILE_NO;
	}
	public String getpOTP() {
		return pOTP;
	}
	public void setpOTP(String pOTP) {
		this.pOTP = pOTP;
	}
	public String getpLOGIN_ID() {
		return pLOGIN_ID;
	}
	public void setpLOGIN_ID(String pLOGIN_ID) {
		this.pLOGIN_ID = pLOGIN_ID;
	}
	public String getpState() {
		return pState;
	}
	public void setpState(String pState) {
		this.pState = pState;
	}
	public String getpDOI() {
		return pDOI;
	}
	public void setpDOI(String pDOI) {
		this.pDOI = pDOI;
	}
	public String getpFileNo() {
		return pFileNo;
	}
	public void setpFileNo(String pFileNo) {
		this.pFileNo = pFileNo;
	}
	public String getpROW_ID() {
		return pROW_ID;
	}
	public void setpROW_ID(String pROW_ID) {
		this.pROW_ID = pROW_ID;
	}
	
	
}
