package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.MemberVO;

/*
 * tbl_member 테이블에 데이터를 활용하는 동작
 */
public interface MemberDAO {
	
	// 디비 서버 시간 조회
	public String getTime();
	
	// 회원 가입
	public void insertMember(MemberVO vo);
	
	// 로그인
	public MemberVO loginMember(MemberVO vo);
	public MemberVO loginMember(String userid,String userpw);
	
	// 사용자 정보 조회
	public MemberVO getMember(String userid);
	
	// 사용자 정보 수정
	public int updateMember(MemberVO uvo);
	
	// 사용자 정보 삭제
	public Integer deleteMember(MemberVO dvo);
	
	// 사용자 정보 목록 조회
	public List<MemberVO> getMemberList();
	
}
