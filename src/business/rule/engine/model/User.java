package business.rule.engine.model;


public class User {
	public String UserName;
    public String Email;
    public MembershipType MembershipType;
    public boolean IsActive;
    public int EmailsSent;
	public User(String email2, String userName2, MembershipType basic) {
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public MembershipType getMembershipType() {
		return MembershipType;
	}
	public void setMembershipType(MembershipType membershipType) {
		MembershipType = membershipType;
	}
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	public int getEmailsSent() {
		return EmailsSent;
	}
	public void setEmailsSent(int emailsSent) {
		EmailsSent = emailsSent;
	}
}
