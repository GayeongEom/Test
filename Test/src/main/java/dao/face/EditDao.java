package dao.face;

import java.sql.Connection;

import dto.Member;

public interface EditDao {

	/**
	 * 세션에서 얻어온 userno으로 DB에서 회원정보 얻어오기
	 * 
	 * @param conn - DB 연결 객체
	 * @param userno - 세션에서 얻어온 userno
	 * @return 회원정보 객체
	 */
	public Member getSelect(Connection conn, int userno);

	
	public int updateInfo(Connection conn, Member member);

}
