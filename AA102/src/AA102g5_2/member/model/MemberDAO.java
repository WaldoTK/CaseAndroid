package AA102g5_2.member.model;

import java.util.*;
import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import idv.ron.server.main.Common;


public class MemberDAO implements MemberDAO_interface {

	@Override
	public int insert(MemberVO memberVO) {
		int count = 0;
		String sql = "INSERT INTO Member"
				+ "(id, account, password, nickname, name, phone) "
				+ "VALUES(Member_sq.nextval,?, ?, ?, ?, ? )";
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = DriverManager.getConnection(Common.URL, Common.USER,
					Common.PASSWORD);
			ps = connection.prepareStatement(sql);
			ps.setString(1, memberVO.getAccount());
			ps.setString(2, memberVO.getPassword());
			ps.setString(3, memberVO.getNickname());
			ps.setString(4, memberVO.getName());
			ps.setString(5, memberVO.getPhone());
			
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					// When a Statement object is closed,
					// its current ResultSet object is also closed
					ps.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
		
	}

	@Override
	public int update(MemberVO memberVO, byte[] image) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public MemberVO findByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getImage(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
		

}
