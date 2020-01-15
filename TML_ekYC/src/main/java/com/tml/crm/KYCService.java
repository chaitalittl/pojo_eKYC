package com.tml.crm;



import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(targetNamespace = "http://com.tml.crm/")
public interface KYCService {

	
	 @WebMethod
	    @RequestWrapper(localName = "", targetNamespace = "http://com.tml.crm/", className = "com.tml.crm.KYCInput")
	    @ResponseWrapper(localName = "", targetNamespace = "http://com.tml.crm/", className = "com.tml.crm.KYCOutput")
	    @WebResult(name = "status", targetNamespace = "")
		public KYCOutput KYCInput(KYCInput input);
}
