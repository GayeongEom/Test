package service.impl;

import java.sql.Connection;

import common.JDBCTemplate;
import dao.face.JoinDao;
import dao.impl.JoinDaoImpl;
import dto.Member;
import service.face.JoinService;

public class JoinServiceImpl implements JoinService {
	
	private JoinDao joinDao = new JoinDaoImpl();
	private Connection conn = JDBCTemplate.getConnection();
	
	
	@Override
	public int joinNew(Member member) {

		int result = joinDao.insert(conn, member);
		
		System.out.println("Service쪽 result : " + result);
		
		if(result>0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		
		return result;
	}

}
