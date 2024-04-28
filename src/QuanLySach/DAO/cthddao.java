package QuanLySach.DAO;

import QuanLySach.DAO.MyConnect;
import QuanLySach.DTO.CTHoaDon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class cthddao {
	public ArrayList<CTHoaDon> getListCTHoaDon(){
		ArrayList<CTHoaDon> dscthd = new ArrayList<>();
		try {
			String sql = "SELECT * FROM cthoadon";
			Statement stmt = MyConnect.conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				CTHoaDon cthd = new CTHoaDon();
				cthd.setMaHD(rs.getInt(1));
				cthd.setMaSP(rs.getInt(2));
				cthd.setSoLuong(rs.getInt(3));
				cthd.setDonGia(rs.getInt(4));
				cthd.setThanhTien(rs.getInt(5));
				dscthd.add(cthd);
			}
		}catch(SQLException ex) {
			
		}
		return dscthd;
	}

public boolean addCTHoaDon(CTHoaDon cthd) {
	boolean result = false;
	try {
		String sql = "INSERT INTO cthoadon VALUES(?,?,?,?,?)";
		PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
		prep.setInt(1, cthd.getMaHD());
		prep.setInt(2, cthd.getMaSP());
		prep.setInt(3, cthd.getSoLuong());
		prep.setDouble(4, cthd.getDonGia());
		prep.setDouble(5, cthd.getThanhTien());
		result = prep.executeUpdate() > 0;
	}catch (SQLException ex) {
		ex.printStackTrace();
		return false;
	}
	return result;
}
	
	

}
