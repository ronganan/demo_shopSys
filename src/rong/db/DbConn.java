package rong.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public final class DbConn {
	
	public static Connection getConn() {
		
		Connection conn = null;		
		String user = "root";
		String passwd = "123456";
		String url = "jdbc:mysql://127.0.0.1:3306/demo?serverTimezone=GMT";//demo为mysql数据库实例名字
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}