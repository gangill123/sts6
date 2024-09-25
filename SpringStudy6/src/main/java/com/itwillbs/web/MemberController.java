package com.itwillbs.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;
import com.itwillbs.service.MemberService;

@Controller
@RequestMapping(value = "/member/*")
// => 특정 동작의 형태를 구분 (-me,-bo)
public class MemberController {
	
	// 객체 주입 
	@Inject
	private MemberDAO mdao;
	
	@Inject
	private MemberService mService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
	// http://localhost:8088/web/member/test (x)
	// http://localhost:8088/web/test (x)
	// 서버 주소를 web 에서 / 로바꾼후 web제거 후 가능
	// http://localhost:8088/member/test

	//	@RequestMapping(value = "/test",method = RequestMethod.GET)
//	public void test() {
//		logger.debug("test() 실행");
//	}
	
	
	// 회원가입 - 정보 입력
	// http://localhost:8088/member/join
	@RequestMapping(value = "/join",method = RequestMethod.GET)
	public void joinMemberGet() {
		logger.debug("/joinMember -> join() 실행");
		logger.debug("연결된 뷰(JSP)를 보여주기");
		// 페이지 이동 X  -> 스프링이 자동으로 연결
		logger.debug("/views/member/join.jsp 뷰페이지 연결");
	}
	// 회원가입 - 정보 처리
	// http://localhost:8088/member/joinMemberAction
    //	@RequestMapping(value = "joinMemberAction",method = RequestMethod.POST)
	@RequestMapping(value = "/join",method = RequestMethod.POST)
	public String joinMemberPost(MemberVO vo) {
		logger.debug("/member/joinMemberAction - > joinMemberAction() 실행");
		// 한글 인코딩처리  => web.xml 필터로 처리
	
		
		
		// 전달정보 ( 파라메터  )저장
		logger.debug("vo : "+vo);
		
		// DB 객체 생성 - 회원가입 s
		// MemberDAO 객체 생성 => 객체 주입
		// mdao.insertMmember (vo) :x 
		
		//MemberService 객체를 주입 -> 해당 동작 수행 
		mService.memberJoin(vo);
		logger.debug("회원가입 성공!!");
		
		//
		
		return "";
	}
	
	
	
	
	
	
	

}
