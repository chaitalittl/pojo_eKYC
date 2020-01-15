package com.tml.crm;

import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlType(name = "KYCOutput", propOrder = {
		"statusMsg","requestId","statusCode","result"

}) 
@XmlRootElement(name = "KYCOutput" ,namespace="http://schemas.xmlsoap.org/soap/envelope/")
public class KYCOutput {
	
	protected String statusMsg;
	protected String requestId;
	//@XmlElement(name="status-code")
	protected String statusCode;
	
	
	@XmlElement(name="result")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	protected List<ResultObj> result ;

	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@XmlElement(name="status-code")
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	
	
	
	/* public List<ResultObj> getResult() {
			
			if (result == null) {
				result = new ArrayList<ResultObj>();
	        }
	        return this.result;
		}
	 

	public void setResult(List<ResultObj> result) {
		this.result = result;
	}*/
	
	

}
