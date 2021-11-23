package kh.com.test1121.member.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import kh.com.test1121.member.service.MemberService;
import kh.com.test1121.member.service.MemberServiceImpl;
import kh.com.test1121.member.vo.MemberVo;

@Controller("member")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject 
	private MemberServiceImpl memberService;
	
	@Autowired
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
			public String signUp() {
		return "redirect:/";
	}
	
	// 회원가입 post
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public String postRegister(MemberVo vo) throws Exception {
			logger.info("post register");
			
			memberService.reg(vo);
			
			return null;
		}
	
	
}
