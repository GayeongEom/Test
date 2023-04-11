package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JDBCTemplate;
import dao.face.EditDao;
import dto.Member;

public class EditDaoImpl implements EditDao {
	
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	
	@Override
	public Member getSelect(Connection conn, int userno) {
		
		System.out.println("Edit Dao userno : " + userno);

		String sql = "";
		sql += "SELECT userno, username, userid, userpw, useremail, userphone, usergrade FROM member";
		sql += " WHERE userno = ?";
		
		Member member = null;
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, userno);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				member = new Member();
				
				member.setUserno(rs.getInt("userno"));
				member.setUsername(rs.getString("username"));
				member.setUserid(rs.getString("userid"));
				member.setUserpw(rs.getString("userpw"));
				member.setUseremail(rs.getString("useremail"));
				member.setUserphone(rs.getString("userphone"));
				member.setUsergrade(rs.getString("usergrade"));
				
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(ps);
			JDBCTemplate.close(rs);
		}
		
		System.out.println("Edit Dao member : " + member);
		
		return member;
	}
	
	
	@Override
	public int updateInfo(Connection conn, Member member) {

		String sql = "";
	      sql += "UPDATE member";
	      sql += " SET";
	      sql += " username = ?";
	      sql += " , userid = ?";
	      sql += " , userpw = ?";
	      sql += " , useremail = ?";
	      sql += " , userphone = ?";
	      sql += " , usergrade = ?";
	      sql += " WHERE userno = ?";
	      
		
		int result = 0;
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, member.getUsername());
			ps.setString(2, member.getUserid());
			ps.setString(3, member.getUserpw());
			ps.setString(4, member.getUseremail());
			ps.setString(5, member.getUserphone());
			ps.setString(6, member.getUsergrade());
			ps.setInt(7, member.getUserno());
			
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
