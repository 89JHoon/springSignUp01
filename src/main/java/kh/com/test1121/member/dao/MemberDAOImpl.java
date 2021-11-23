package kh.com.test1121.member.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import kh.com.test1121.member.vo.MemberVo;

public class MemberDAOImpl  implements MemberDAO{

	@Inject SqlSession sql;
	
	@Override
	public void reg(MemberVo vo) throws Exception{
		sql.insert("memberMapper.reg", vo);
	}
}
