package dao.face;

import java.sql.Connection;

import dto.Member;

public interface JoinDao {

	/**
	 * 입력된 회원 정보를 DB에 삽입한다
	 * 
	 * @param conn - DB 연결 객체
	 * @param member - 입력된 회원 정보
	 * @return 삽입 성공 여부(성공 - 1, 실패 - 0)
	 */
	public int insert(Connection conn, Member member);

}
