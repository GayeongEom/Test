package service.face;

import dto.Member;

public interface LoginService {

	/**
	 * 입력받은 로그인 정보가 DB에 존재하는지 조회
	 * 
	 * @param member - 입력받은 로그인 정보
	 * @return DB에 일치하는 정보(존재한다면 member, 존재하지 않는다면 - null)
	 */
	public Member login(Member member);



}
