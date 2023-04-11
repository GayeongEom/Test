package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.JDBCTemplate;
import dao.face.JoinDao;
import dto.Member;

public class JoinDaoImpl implements JoinDao {
	
	private PreparedStatement ps = null;
	
	
	@Override
	public int insert(Connection conn, Member member) {

		String sql = "";
		sql += "INSERT INTO member";
		sql += " VALUES (member_seq.nextval, ?, ?, ?, ?, ?, ?)";
		
		int result = 0;
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, member.getUsername());
			ps.setString(2, member.getUserid());
			ps.setString(3, member.getUserpw());
			ps.setString(4, member.getUseremail());
			ps.setString(5, member.getUserphone());
			ps.setString(6, member.getUsergrade());
			
			result = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(ps);
		}
		
		
		System.out.println("Dao쪽 result : " + result);
		
		
		return result;
	}

}
