package service.face;

import dto.Member;

public interface JoinService {

	/**
	 * 입력된 정보로 새로운 회원 정보를 삽입한다
	 * 
	 * @param member - 입력된 회원 정보
	 * @return DB 삽입 결과 (성공 - 1, 실패 - 0)
	 */
	public int joinNew(Member member);

}
