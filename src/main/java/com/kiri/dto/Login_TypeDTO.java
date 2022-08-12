package com.kiri.dto;

import java.util.Date;

public class Login_TypeDTO {
	private int seq_type;
	private String user_email;
	private String type;
	private String unique_id;
	private Date signup_date;

	public Login_TypeDTO() {
	}

	public Login_TypeDTO(int seq_type, String user_email, String type, String unique_id, Date signup_date) {
		super();
		this.seq_type = seq_type;
		this.user_email = user_email;
		this.type = type;
		this.signup_date = signup_date;
	}

	public int getSeq_type() {
		return seq_type;
	}

	public void setSeq_type(int seq_type) {
		this.seq_type = seq_type;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getType() {
		return type;
	}

	public String getUnique_id() {
		return unique_id;
	}

	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getSignup_date() {
		return signup_date;
	}

	public void setSignup_date(Date signup_date) {
		this.signup_date = signup_date;
	}

	@Override
	public String toString() {
		return seq_type + " : " + user_email + " : " + type + " : " + " : " + unique_id + signup_date;
	}

}
