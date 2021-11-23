package kh.com.test1121.member.vo;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;

//MEMBER_ID        NOT NULL VARCHAR2(30)  
//MEMBER_PWD       NOT NULL VARCHAR2(100) 
//MEMBER_NM        NOT NULL VARCHAR2(15)  
//MEMBER_ENROLL_DT          DATE          

@Component
public class MemberVo {
	private String memberId;
	private String memberPwd;
	private String memberNm;
	private Data memberEnrollDt;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public Data getMemberEnrollDt() {
		return memberEnrollDt;
	}
	public void setMemberEnrollDt(Data memberEnrollDt) {
		this.memberEnrollDt = memberEnrollDt;
	}
	public MemberVo(String memberId, String memberPwd, String memberNm, Data memberEnrollDt) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberNm = memberNm;
		this.memberEnrollDt = memberEnrollDt;
	}
	@Override
	public String toString() {
		return "MemberVo [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberNm=" + memberNm
				+ ", memberEnrollDt=" + memberEnrollDt + "]";
	}
	
	

}
