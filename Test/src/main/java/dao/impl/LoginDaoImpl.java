package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JDBCTemplate;
import dao.face.LoginDao;
import dto.Member;

public class LoginDaoImpl implements LoginDao {
	
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	
	@Override
	public Member select(Connection conn, Member member) {

		String sql = "";
		sql += "SELECT * FROM member";
		sql += " WHERE userid = ? and userpw = ?";
		
		Member result = null;
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, member.getUserid());
			ps.setString(2, member.getUserpw());
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				result = new Member();
				
				result.setUserno(rs.getInt("userno"));
				result.setUsername(rs.getString("username"));
				result.setUserid(rs.getString("userid"));
				result.setUserpw(rs.getString("userpw"));
				result.setUseremail(rs.getString("useremail"));
				result.setUserphone(rs.getString("userphone"));
				result.setUsergrade(rs.getString("usergrade"));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(ps);
			JDBCTemplate.close(rs);
		}
		
		System.out.println("로그인 Dao result : " + result);
		
		return result;
		
	}

}
