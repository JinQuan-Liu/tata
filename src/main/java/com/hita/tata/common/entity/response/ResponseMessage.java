package com.hita.tata.common.entity.response;

import java.io.Serializable;
import java.util.Date;

public class ResponseMessage implements Serializable {
	public final static int STATUS_OK=1;
	public final static int STATUS_ERROR=-1;
	public final static int STATUS_NOT_ALLOW=403;
	
	private int status;
	private Object data;
	private String message;
	private Long timestamp;
	
	
	public ResponseMessage(int status, Object data, String message) {
		this.status = status;
		this.data = data;
		this.message = message;
		this.timestamp=new Date().getTime();
	}

	public ResponseMessage() {
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public static ResponseMessage newOkInstance(Object data, String message){
        return new ResponseMessage(ResponseMessage.STATUS_OK,data,message);
    }

    public static ResponseMessage newOkInstance(String message){
        return new ResponseMessage(ResponseMessage.STATUS_OK,null,message);
    }
	
	public static ResponseMessage newOkInstance(Object data){
		return new ResponseMessage(ResponseMessage.STATUS_OK,data,null);
	}
	
	public static ResponseMessage newErrorInstance(String message){
		return new ResponseMessage(ResponseMessage.STATUS_ERROR,null,message);
	}
	
	
}
