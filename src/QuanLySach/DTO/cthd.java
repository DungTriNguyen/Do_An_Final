package QuanLySach.DTO;

public class cthd {
	private int maHD;
	private int maSP;
	private int soLuong;
	private double donGia;
	private double thanhTien;
	public cthd(int maHD, int maSP, int soLuong, double donGia, double thanhTien) {
		this.maHD = maHD;
		this.maSP = maSP;
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;
		
	}
	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}
	public int getMaHD() {
		return maHD;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
		
	}
	public int getMaSP() {
		return maSP;
	}

}
