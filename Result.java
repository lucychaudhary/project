package com.cg.flight.response;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Result {

	private String status;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String message;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String seatNumber;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String count;

	public Result() {
		super();
	
	}

	public Result(String status, String message, String seatNumber, String count) {
		super();
		this.status = status;
		this.message = message;
		this.seatNumber = seatNumber;
		this.count = count;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + ", seatNumber=" + seatNumber + ", count=" + count
				+ "]";
	}
	
	
}
