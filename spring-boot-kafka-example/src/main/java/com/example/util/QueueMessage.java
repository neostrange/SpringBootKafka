package com.example.util;

public class QueueMessage {

	private String index;
	
	private String type;
	
	private Object source;

	public QueueMessage() {
		super();
	}


	public QueueMessage(String index, String type, Object source) {
		super();
		this.setIndex(index);
		this.setType(type);
		this.setSource(source);
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Object getSource() {
		return source;
	}


	public void setSource(Object source) {
		this.source = source;
	}


	public String getIndex() {
		return index;
	}


	public void setIndex(String index) {
		this.index = index;
	}
	
	
}
