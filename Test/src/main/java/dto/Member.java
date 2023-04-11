package dto;

public class Member {
	
	private int userno;
	private String username;
	private String userid;
	private String userpw;
	private String useremail;
	private String userphone;
	private String usergrade;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public int getUserno() {
		return userno;
	}

	public void setUserno(int userno) {
		this.userno = userno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUsergrade() {
		return usergrade;
	}

	public void setUsergrade(String usergrade) {
		this.usergrade = usergrade;
	}

	@Override
	public String toString() {
		return "Member [userno=" + userno + ", username=" + username + ", userid=" + userid + ", userpw=" + userpw
				+ ", useremail=" + useremail + ", userphone=" + userphone + ", usergrade=" + usergrade + "]";
	}

	public Member(int userno, String username, String userid, String userpw, String useremail, String userphone,
			String usergrade) {
		super();
		this.userno = userno;
		this.username = username;
		this.userid = userid;
		this.userpw = userpw;
		this.useremail = useremail;
		this.userphone = userphone;
		this.usergrade = usergrade;
	}
	
	
	
	

}
