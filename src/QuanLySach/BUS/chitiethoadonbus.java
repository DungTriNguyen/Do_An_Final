package QuanLySach.BUS;

import java.util.ArrayList;

import QuanLySach.DAO.CTHoaDonDAO;
import QuanLySach.DTO.CTHoaDon;

public class chitiethoadonbus {
	private ArrayList<CTHoaDon> ListCTHoaDon;
	private CTHoaDonDAO ctHDDAO = new CTHoaDonDAO();
	private HoaDonBUS hdBUS = new HoaDonBUS();
	public chitiethoadonbus() {
		docListCTHoaDon();
		
	}
	public void docListCTHoaDon() {
		this.ListCTHoaDon = ctHDDAO.getListCTHoaDon();
	}
	public ArrayList<CTHoaDon> getListCTHoaDon(){
		return ListCTHoaDon;
	}
	public ArrayList<CTHoaDon> getListCTHoaDonTheoMaHD(String maHD){
		int ma = Integer.parseInt(maHD);
		ArrayList<CTHoaDon> dsct = new ArrayList<>();
		for(CTHoaDon cthd : ListCTHoaDon) {
			if(cthd.getMaHD() == ma)
				dsct.add(cthd);
		}
		return dsct;
	}
	public void addCTHoaDon(String maSP, String soLuong, String donGia, String thanhTien) {
		int ma = hdBUS.getMaHoaDonMoiNhat();
		donGia = donGia.replace(".","");
		thanhTien = thanhTien.replace(".", "");
		CTHoaDon cthd = new CTHoaDon();
		cthd.setMaHD(ma);
		cthd.setMaSP(Integer.parseInt(maSP));
		cthd.setSoLuong(Integer.parseInt(soLuong));
		cthd.setDonGia(Double.parseDouble(donGia));
		cthd.setThanhTien(Double.parseDouble(thanhTien));
		ctHDDAO.addCTHoaDon(cthd);
	}
}
