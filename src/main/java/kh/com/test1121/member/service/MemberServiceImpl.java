package kh.com.test1121.member.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import kh.com.test1121.member.dao.MemberDAO;
import kh.com.test1121.member.vo.MemberVo;

public class MemberServiceImpl implements MemberService {
	
	@Inject MemberDAO dao;
	
	@Autowired
	@Override
	public void reg(MemberVo vo) throws Exception{
		dao.reg(vo);
	}

}
