package com.kiri.dto;

public class Group_ChatDTO {
	private int seq_chat;
	private int seq_group;
	private String user_email;
	private String user_nickname;
	private String message;
	private String sendDate;

	public Group_ChatDTO() {
	}

	public Group_ChatDTO(int seq_chat, int seq_group, String user_email, String user_nickname, String message, String sendDate) {
		super();
		this.seq_chat = seq_chat;
		this.seq_group = seq_group;
		this.user_email = user_email;
		this.user_nickname = user_nickname;
		this.message = message;
		this.sendDate = sendDate;
	}

	public int getSeq_chat() {
		return seq_chat;
	}

	public void setSeq_chat(int seq_chat) {
		this.seq_chat = seq_chat;
	}

	public int getSeq_group() {
		return seq_group;
	}

	public void setSeq_group(int seq_group) {
		this.seq_group = seq_group;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	@Override
	public String toString() {
		return "Group_ChatDTO [seq_chat=" + seq_chat + ", seq_group=" + seq_group + ", user_email=" + user_email + ", user_nickname=" + user_nickname + ", message=" + message + ", sendDate=" + sendDate + "]";
	}

}
