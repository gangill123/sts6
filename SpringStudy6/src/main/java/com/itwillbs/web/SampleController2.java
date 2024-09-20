package com.itwillbs.web;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberVO;

// @COntroller 해당객체를 컨트롤러 객체(빈)으로 인식하도록 설정 (Servlet- context- controller)
@Controller
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	// * 메서드의 리턴타입이 String 일때, 문자열.jsp 뷰페이지를 연결
	
	//http://localhost:8088/web/doB
	// return : /WEB-INF/views/itwill.jsp 로 찾아가게 됨 
	@RequestMapping(value = "/doB",method = RequestMethod.GET)
	public String doB() {
		logger.debug("/doB -> doB()호출 ");
		
		return "itwill";
		// return "itwill"; : 만약 null 일때는 void 리턴과 동일함
	}
	
	@RequestMapping(value = "/doB1",method = RequestMethod.GET)
	public String doB1() {
		logger.debug("/doB1 -> doB1()호출 ");
		
		return "itwill";
		// return "itwill"; : 만약 null 일때는 void 리턴과 동일함
	}
	
	// http://localhost:8088/web/doB2
	// http://localhost:8088/web/doB2?msg=itwill
	
	@RequestMapping(value = "/doB2",method = RequestMethod.GET)
	public String doB2(@ModelAttribute("msg") String msg) {
		logger.debug("/doB2 -> doB2()호출 ");
		// reqeust.getParamater('msg');(x)
		
		logger.debug("msg : "+msg);
		
		return "itwill";
		// return "itwill"; : 만약 null 일때는 void 리턴과 동일함
	}
	
	// http://localhost:8088/web/doB3?msg=itwill&id=admin
		
	@RequestMapping(value = "/doB3", method = RequestMethod.GET)
	public String doB3(@ModelAttribute("msg")String msg,
						@ModelAttribute("id")int id)
		{	
		logger.debug("/doB3 -> doB3()호출 ");
			
			logger.debug("msg : "+msg);
			logger.debug("id : "+id);
			return "itwill";
	}
	
	// http://localhost:8088/web/doB4

	
	// * 컨트롤러는 파라메터 자동수집을 제공
	@RequestMapping(value = "/doB4")
	public String doB4(MemberVO vo)
	/*					ㄴ@ModelAttribute 생략
	 * public String doB4(@ModelAttribute("userid")String userid,
	 * @ModelAttribute("userpw")int userpw)
	 */	
	{	
		logger.debug("doB4()호출 ");
		
//		logger.debug("id : "+userid);
//		logger.debug("pw : "+userpw);
		logger.debug("vo : "+vo);
		return "itwill";
	}
	
	
	// http://localhost:8088/web/doB5
	@RequestMapping(value = "/doB5")
	public String doB5(Model model/* MemberVO vo1 */) 
	{	
		// MemberVO 객체 생성 = > DAO 메서드 리턴
		logger.debug("doB5()호출 ");
		MemberVO vo = new MemberVO(); 
		vo.setUserid("ADMIN");
		vo.setUserpw("1234");
		
// 		model.addAttribute(attributeName, attributeValue);
		model.addAttribute("vo1", vo);
		
		logger.debug("vo : "+vo);
		return "itwill";
	}
	//139 ~ 142 쪽 읽기
	
	
	
}
