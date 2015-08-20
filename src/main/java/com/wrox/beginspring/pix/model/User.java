/**
 * 
 */
package com.wrox.beginspring.pix.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;


/**
 * @author ami
 *
 */

public class User {

	@Id
	private int id;
	private  String userName;
	private  String firstName;
	private  String lastName;
	private  String email;
	private  String password;
	private  Integer phone;
	private int userRating;
	private int userType; // type can be just viewer or valid user
	private List<UserFeedback> userFeedbackList = new ArrayList<UserFeedback>();

	/**
	 * 
	 */
	public User() {
		super();
	}

	public User(int userId, String userName, String firstName, String lastName,
			String email, String password, int userRating) {
		super();
		this.id = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userRating = userRating;
	}

	public User(int id, String userName, String firstName, String lastName,
			String email, String password, Integer phone) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public User(int userId, String userName, String firstName, String lastName,
			String email, String password, int userRating, int userType) {
		super();
		this.id = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userRating = userRating;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int userId) {
		this.id = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserRating() {
		return userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public List<UserFeedback> getUserFeedBackList() {
		return userFeedbackList;
	}

	public void setUserFeedBackList(List<UserFeedback> userFeedBackList) {
		this.userFeedbackList = userFeedBackList;
	}
	/**
	 *  Add user feed back to the user object
	 */
	public void addUserFeedBack(UserFeedback usrFB){
		//usrFB.setUser(this);
		userFeedbackList.add(usrFB);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime
				* result
				+ ((userFeedbackList == null) ? 0 : userFeedbackList.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + userRating;
		result = prime * result + userType;
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (userFeedbackList == null) {
			if (other.userFeedbackList != null)
				return false;
		} else if (!userFeedbackList.equals(other.userFeedbackList))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userRating != other.userRating)
			return false;
		if (userType != other.userType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + id + ", userName=" + userName
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password
				+ ", userRating=" + userRating + ", userType=" + userType + "]";
	}

}
