package kh.com.test1121.member.dao;

import org.springframework.stereotype.Repository;

import kh.com.test1121.member.vo.MemberVo;

@Repository
public interface MemberDAO {

	public void reg(MemberVo vo) throws Exception;

}
