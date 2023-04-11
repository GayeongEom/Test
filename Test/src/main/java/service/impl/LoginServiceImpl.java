package service.impl;

import java.sql.Connection;

import common.JDBCTemplate;
import dao.face.LoginDao;
import dao.impl.LoginDaoImpl;
import dto.Member;
import service.face.LoginService;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao loginDao = new LoginDaoImpl();
	private Connection conn = JDBCTemplate.getConnection();

	
	@Override
	public Member login(Member member) {

		//DB에서 조회하기
		Member result = loginDao.select(conn, member);
		
		System.out.println("로그인 서비스쪽 result : " + result);
		
		return result;
	}
	
	
	

}
