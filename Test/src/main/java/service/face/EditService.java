package service.face;

import dto.Member;

public interface EditService {

	/**
	 * 세션에서 얻어온 userno으로 DB에서 회원정보 얻어오기
	 * 
	 * @param userno - 세션에서 얻어온 userno
	 * @return 회원정보
	 */
	public Member getInfo(int userno);

	public void editInfo(Member member);

}
