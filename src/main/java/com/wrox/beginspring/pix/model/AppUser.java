/**
 * 
 */
package com.wrox.beginspring.pix.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author ami
 *
 */
@Entity
@Table(name="app_user", schema="irent")
public class AppUser {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name="user_name")
	private  String userName;
	@Column(name="first_name")
	private  String firstName;
	@Column(name="last_name")
	private  String lastName;
	@Column(name="email")
	private  String email;
	@Column(name="password")
	private  String password;
	//private  Integer phone;
	//private int userRating;
	//private int userType; // type can be just viewer or valid user
	//private List<UserFeedback> userFeedbackList = new ArrayList<UserFeedback>();

	/**
	 * 
	 */
	protected AppUser() {}
	

	public AppUser (String userName, String firstName, String lastName,
			String email, String password) {
		//super();
	
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	/*public int getUserRating() {
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
	}*/
	/**
	 *  Add user feed back to the user object
	 */
	/*public void addUserFeedBack(UserFeedback usrFB){
		//usrFB.setUser(this);
		userFeedbackList.add(usrFB);
	}*/
	

	@Override
	public String toString() {
		return "User [userId=" + id + ", userName=" + userName
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password
				//+ ", userRating=" + userRating + ", userType=" + userType +
				+ "]";
	}

}
