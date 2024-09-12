package com.itwillbs.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
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
	
	
	
	
}
