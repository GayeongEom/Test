package service.impl;

import java.sql.Connection;

import common.JDBCTemplate;
import dao.face.EditDao;
import dao.impl.EditDaoImpl;
import dto.Member;
import service.face.EditService;

public class EditServiceImpl implements EditService {
	
	private Connection conn = JDBCTemplate.getConnection();
	private EditDao editDao = new EditDaoImpl();
	
	@Override
	public Member getInfo(int userno) {

		Member member = editDao.getSelect(conn, userno);
		
		System.out.println("Edit Service userno : " + userno);
		
		System.out.println("Edit Service member : " + member);
		
		return member;
	}
	
	
	@Override
	public void editInfo(Member member) {

		int res = editDao.updateInfo(conn, member);
		
		if(res>0) {
			JDBCTemplate.commit(conn);
			System.out.println("업데이트 완료");
			
		} else {
			JDBCTemplate.rollback(conn);
			System.out.println("업데이트 실패");
		}
		
		
	}
	
	

}
