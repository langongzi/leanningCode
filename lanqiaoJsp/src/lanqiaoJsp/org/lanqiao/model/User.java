package lanqiaoJsp.org.lanqiao.model;

public class User {
	private String userId;
	private String userUserName;
	private String userPassword;
	private String userTelphone;
	private String userAddress;
	private String userShopName;
	private String userComment;
	private Integer userStatus;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserUserName() {
		return userUserName;
	}
	public void setUserUserName(String userUserName) {
		this.userUserName = userUserName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserTelphone() {
		return userTelphone;
	}
	public void setUserTelphone(String userTelphone) {
		this.userTelphone = userTelphone;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserShopName() {
		return userShopName;
	}
	public void setUserShopName(String userShopName) {
		this.userShopName = userShopName;
	}
	public String getUserComment() {
		return userComment;
	}
	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userUserName=" + userUserName + ", userPassword=" + userPassword
				+ ", userTelphone=" + userTelphone + ", userAddress=" + userAddress + ", userShopName=" + userShopName
				+ ", userComment=" + userComment + ", userStatus=" + userStatus + "]";
	}
	
	
}
