package com.itwillbs.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberDAOTest {
	
	// MemberDAO 객체의 메서드 호출
	@Inject
	private MemberDAO mdao;
	
	@Test
	public void getBean() {
		System.out.println("mdao : "+mdao);
	}
	
	@Test
	public void getTime() {
		mdao.getTime();
	}
	
	//@Test
	public void 회원가입테스트() {
	System.out.println("TEST : 회원가입테스트() 시작");
	
	//회원 가입 정보
	MemberVO vo = new MemberVO();
	vo.setUserid("itwill");
	vo.setUserpw("1234");
	vo.setUsername("아이티윌");
	vo.setUseremail("itwill@itwill.com");
	
	//mdao.insertMember(vo);
	
	System.out.println("TEST : 회원가입테스트() 끝");
	}
	@Test
	public void 로그인테스트() {
		System.out.println("TEST : 로그인테스트() 시작");
		
		MemberVO vo = new MemberVO();
		vo.setUserid("admin");
		vo.setUserpw("1234");
		
		MemberVO resultVO = mdao.loginMember(vo);
		
		System.out.println("resultVO" +resultVO);
		System.out.println("TEST : 로그인테스트() 끝");
		
		if(resultVO != null) {
			System.out.println("TEST : 로그인 성공!");
		}else {
			System.out.println("TEST : 로그인 실패 !");
		}
	}
	//회원 정보 조회
	@Test
	public void 회원정보조회() {
		System.out.println("TEST : 사용자정보조회() 시작");
	
		
		MemberVO resultVO = mdao.getMember("adimin");
		System.out.println("resultVO"+resultVO);
		
		
		System.out.println("TEST : 사용자정보조회() 끝");
	}
	// @Test
	public void 회원정보수정() {
		MemberVO uvo = new MemberVO();
		uvo.setUserid("admin");
		uvo.setUserpw("1234");
		uvo.setUseremail("updateAdmin@admin.com");
		uvo.setUsername("수정관리자");
		
		int result = mdao.updateMember(uvo);
		System.out.println("test : "+result);
	
		if(result > 0) {
			System.out.println("Test : 회원정보 수정완료!");
		}else {
			System.out.println("Test : 회원정보 수정실패!");			
		}
		
		
	}
	// @Test
	public void 회원정보삭제() {
		
		MemberVO dvo = new MemberVO();
		dvo.setUserid("admin");
		dvo.setUserpw("1234");
		
		int result = mdao.deleteMember(dvo);
		if(result > 0) {
			System.out.println("Test : 회원정보 삭제 성공");
		}else {
			System.out.println("Test : 회원정보삭제 실패");
		}
		
	}
	
	@Test
	public void 회원목록리스트() {
		System.out.println("회원 목록 리스트 조회 시작");
		List<MemberVO> memberList = mdao.getMemberList();
		
		for(MemberVO vo : memberList) {
			System.out.println("vo : "+vo);
		}
		System.out.println("회원 목록 리스트 조회 끝");
	}
	
	
	
	
	
}
