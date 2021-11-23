package kh.com.test1121.member.vo;

import javax.xml.crypto.Data;

//MEMBER_ID        NOT NULL VARCHAR2(30)  
//MEMBER_PWD       NOT NULL VARCHAR2(100) 
//MEMBER_NM        NOT NULL VARCHAR2(15)  
//MEMBER_ENROLL_DT          DATE          

public class MemberVo {
	private String memberID;
	private String memberPWD;
	private String memberNM;
	private Data member_ENROLL_DT;
	@Override
	public String toString() {
		return "MemberVo [memberID=" + memberID + ", memberPWD=" + memberPWD + ", memberNM=" + memberNM
				+ ", member_ENROLL_DT=" + member_ENROLL_DT + "]";
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getMemberPWD() {
		return memberPWD;
	}
	public void setMemberPWD(String memberPWD) {
		this.memberPWD = memberPWD;
	}
	public String getMemberNM() {
		return memberNM;
	}
	public void setMemberNM(String memberNM) {
		this.memberNM = memberNM;
	}
	public Data getMember_ENROLL_DT() {
		return member_ENROLL_DT;
	}
	public void setMember_ENROLL_DT(Data member_ENROLL_DT) {
		this.member_ENROLL_DT = member_ENROLL_DT;
	}
	public MemberVo(String memberID, String memberPWD, String memberNM, Data member_ENROLL_DT) {
		super();
		this.memberID = memberID;
		this.memberPWD = memberPWD;
		this.memberNM = memberNM;
		this.member_ENROLL_DT = member_ENROLL_DT;
	}
	
	
	
	

}
