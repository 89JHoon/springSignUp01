package kh.com.test1121.member.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import kh.com.test1121.member.service.MemberService;
import kh.com.test1121.member.service.MemberServiceImpl;
import kh.com.test1121.member.vo.MemberVo;

@Controller
@SessionAttributes("msg")
public class MemberController {
	
	@RequestMapping
	public String signUp() {
		//todo:
		//해야할 일
		//회원가입 요청 URL을 매핑하여 서비스 호출 및 뷰 연결처리를 하는 메소드
		return "redirect:/"; //  /는 wellcome에서 선택한 애가 열림
	}
	
	
	
	
	
//	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
//	
//	@Inject 
//	private MemberServiceImpl memberService;
//	
//	@Autowired
//	
//	
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//			public String signUp() {
//		return "redirect:/";
//	}
//	
//	// 회원가입 post
//		@RequestMapping(value = "/index", method = RequestMethod.POST)
//		public String postRegister(MemberVo vo) throws Exception {
//			logger.info("post register");
//			
//			memberService.reg(vo);
//			
//			return "redirect:/";
//		}
//	
	
}
