package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 *  스프링 mvc가 (처리)하는 기능
 *  - URI를 분석해서 적절한 컨트롤러 연결
 *  - 컨트롤러가 필요한 메서드를 자동으로 호출
 *  - 컨트롤러에서 생성된 결과(데이터)를 뷰페이지로 전달
 *  - 컨트롤러 결과에 따른 뷰페이지 전달
 *  
 *  개발자가 제공 (처리)하는 기능
 *	- 특정 주소 (URI)에 반응하는 컨트롤러 설계
 *  - 서비스 객체를 생성
 *  - DAO 객체를 생성
 *  - 컨트롤러의 동작을 메서드 형태로 설계
 *  - 전달된 데이터 뷰페이지에 출력 
 */

@Controller
public class SampleController1 {
	
	// 로거 객체 생성  => 출력 전용 객체
//	private static final Logger logger
//	   = LoggerFactory.getLogger(SampleController1.class);
//	private static final Logger logger 
//	= LoggerFactory.getLogger(해당클래스명. class);
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController1.class);
	
	

	// 기존MVC : 주소를 if 문으로 비교해서 동작을 처리
	// springMVC : 메서드로 동작을 처리
	//	@RequestMapping(value = "매핑하는 주소 ",method = 전달 방식 (get/post) )
	// http://localhost:8088/web/doA 주소 입력
	
	// * 메서드의 리턴 타입이 void 일때 자동으로 (주소이름과 같은)jsp 페이지를 연결
	@RequestMapping(value = "/doA",method = RequestMethod.GET)
	public void doA() {
		System.out.println("doA() 메서드 실행");
		logger.info("doA() 메서드 실행 !!!");	
		logger.debug("doA() 메서드 실행 !! ");
	}
	// http://localhost:8088/web/doA2
	// http://localhost:8088/web/doA2.do -> doa2.me 
	// doA 주소로  doA2 jsp 페이지를 연결
	@RequestMapping(value = "/doA2.do")
	public void doA2() {
		System.out.println("doA2() 메서드 실행");
		
	}
	
	//@RequestMapping(value = "/doA3")
	@GetMapping(value = "/doA3")
	public void doA3() {
		logger.debug("doA3() 메서드 실행");
		logger.debug("/views/doA3.jsp 페이지로 연결");
	}
	
	
	// *404페이지에 메세지가 없다 -> 컨트롤러에 매핑된 메세지 (주소)가 없음
	// *404페이지에 메세지가 있다 -> 컨트롤러에 매핑o ,연결될 뷰페이지(JSP)가 없음
	
	
	
}
