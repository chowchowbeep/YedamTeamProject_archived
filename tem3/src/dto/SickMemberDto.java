package dto;

public class SickMemberDto { //일반회원정보
	private String sicId;		//회원id
	private String sicPw;		//회원pw
	private String sicName;		//이름
	private String sicPhone;	//전화번호
	private String sicStt;		//회원상태
	private String sicLogin;	//로그인방법
	
	//생성자
	public SickMemberDto() {
		super();
	}
	public SickMemberDto(String sicId, String sicPw, String sicName, String sicPhone,String sicStt,	String sicLogin) {
		super();
		this.sicId = sicId;
		this.sicPw = sicPw;
		this.sicName = sicName;
		this.sicPhone = sicPhone;
		this.sicStt = sicStt;
		this.sicLogin = sicLogin;
	}
	
	//get set
	public String getSicId() {
		return sicId;
	}
	public void setSicId(String sicId) {
		this.sicId = sicId;
	}
	public String getSicPw() {
		return sicPw;
	}
	public void setSicPw(String sicPw) {
		this.sicPw = sicPw;
	}
	public String getSicName() {
		return sicName;
	}
	public void setSicName(String sicName) {
		this.sicName = sicName;
	}
	public String getSicPhone() {
		return sicPhone;
	}
	public void setSicPhone(String sicPhone) {
		this.sicPhone = sicPhone;
	}
	public String getSicStt() {
		return sicStt;
	}
	public void setSicStt(String sicStt) {
		this.sicStt = sicStt;
	}
	public String getSicLogin() {
		return sicLogin;
	}
	public void setSicLogin(String sicLogin) {
		this.sicLogin = sicLogin;
	}
	
	
	
}
