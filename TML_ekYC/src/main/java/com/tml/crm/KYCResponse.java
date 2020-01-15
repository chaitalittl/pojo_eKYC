package com.tml.crm;

import org.apache.camel.Exchange;

public class KYCResponse {

	KYCOutput output;

	public KYCResponse() {
		this.output=new KYCOutput();
	}
	
	public void response(final Exchange exchange) throws Exception {
        this.output.setStatusMsg("SUCCESS");
        exchange.getOut().setBody((Object)this.output);
    }
	
}
