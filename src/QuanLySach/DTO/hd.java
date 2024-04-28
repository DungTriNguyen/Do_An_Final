package QuanLySach.DTO;

import java.sql.Date;

public class hd {
	private int maHD;
	private int maKH;
	private int maNV;
	private Date ngayLap;
	private int tongTien;
	private String ghiChu;
	public hd(int maHD, int maKH, int maNV, Date ngayLap, int tongTien, String ghiChu) {
		this.maHD = maHD;
		this.maKH = maKH;
		this.maNV = maNV;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
		this.ghiChu = ghiChu;
	}
	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}
	public int getMaHD() {
		return maHD;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
		
	}
	public int getMaNV() {
		return maNV;
	}

}
