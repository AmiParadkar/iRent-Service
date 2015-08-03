package com.wrox.beginspring.pix.model;

import org.springframework.data.annotation.Id;


public class UserFeedback {

	@Id
	
	private int userFeedbackId;
	private User user;
	private String feedback;
	private int feedbackBy;
	
	public UserFeedback() {
		// TODO Auto-generated constructor stub
	}

	public UserFeedback(int userFeedbackId, User user, String feedback,
			int feedbackBy) {
		super();
		this.userFeedbackId = userFeedbackId;
		this.user = user;
		this.feedback = feedback;
		this.feedbackBy = feedbackBy;
	}

	public int getUserFeedbackId() {
		return userFeedbackId;
	}

	public void setUserFeedbackId(int userFeedbackId) {
		this.userFeedbackId = userFeedbackId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public int getFeedbackBy() {
		return feedbackBy;
	}

	public void setFeedbackBy(int feedbackBy) {
		this.feedbackBy = feedbackBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + feedbackBy;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + userFeedbackId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserFeedback other = (UserFeedback) obj;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		if (feedbackBy != other.feedbackBy)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (userFeedbackId != other.userFeedbackId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserFeedBack [userFeedbackId=" + userFeedbackId + ", user ="
				+ user + ", feedback=" + feedback + ", feedbackBy="
				+ feedbackBy + "]";
	}

}
