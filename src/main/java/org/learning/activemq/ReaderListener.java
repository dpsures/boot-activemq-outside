package org.learning.activemq;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReaderListener {

	@JmsListener(destination="bulkSms")
	public void receiveMessage(final Message msg){
		System.out.println("Received Msg in bulk SMS ---"+msg);
	}
}
