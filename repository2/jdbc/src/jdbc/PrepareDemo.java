package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareDemo {

	public static void main(String[] args) {
		String sql = "insert into product values (?,?,?)";
		Connection conn = null;

		try {
			
			conn = JdbcUtil.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setDouble(3, Double.parseDouble(args[2]));
			stmt.executeUpdate();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Record Inserted");
	}

}
