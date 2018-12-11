package rong.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import rong.db.DbClose;
import rong.db.DbConn;
import rong.entity.Goods;
import rong.tools.inputContent;

/**
 * ���ݿ�goods�����
 * 
 * @author lyons(zhanglei)
 */
public final class GoodsDao {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	/**
	 * 1.�����Ʒ�����ݿ�goods��
	 * 
	 * @param goods ��Ʒ����
	 * @return boolean
	 */
	public boolean addGoods(Goods goods) {
		boolean bool = false;
		conn = DbConn.getConn();
		String sql = "insert into goods(gname, gprice, gnum) values (?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getGname());
			pstmt.setDouble(2, goods.getGprice());
			pstmt.setInt(3, goods.getGnum());
			
			int rs = pstmt.executeUpdate();
			if (rs > 0) {
				bool = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbClose.addClose(pstmt, conn);
		}
		return bool;
	}
	
}
