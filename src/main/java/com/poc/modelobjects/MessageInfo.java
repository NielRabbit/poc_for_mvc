/**
 * 
 */
package com.poc.modelobjects;

import java.util.Date;

/**
 * @author niel_liu
 *
 */
public class MessageInfo {
	
	private long id;

	private String timestamp;
	
	private String sender;
	
	private String recipient;
	
	private String subject;
	
	public MessageInfo()
	{
		timestamp = (new Date()).toString();
		sender = "";
		recipient = "";
		subject = "";
	}

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
