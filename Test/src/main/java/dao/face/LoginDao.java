package dao.face;

import java.sql.Connection;

import dto.Member;

public interface LoginDao {

	/**
	 * 입력받은 로그인정보가 DB에 존재하는지 조회
	 * 
	 * 
	 * @param conn - DB 연결 객체
	 * @param member - 입력받은 로그인 정보
	 * @return DB에 일치하는 정보(존재한다면 member, 존재하지 않는다면 - null)
	 */
	public Member select(Connection conn, Member member);


}
