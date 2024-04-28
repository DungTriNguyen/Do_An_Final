package QuanLySach.BUS;

import QuanLySach.BUS.HoaDonBUS;
import QuanLySach.DAO.CTHoaDonDAO;
import QuanLySach.DTO.CTHoaDon;
import QuanLySach.DTO.HoaDon;

import java.util.ArrayList;

public class CTHoaDonBUS {

    private ArrayList<CTHoaDon> listCTHoaDon;
    private CTHoaDonDAO ctHDDAO = new CTHoaDonDAO();
    private HoaDonBUS hdBUS = new HoaDonBUS();

    public CTHoaDonBUS() {
        docListCTHoaDon();
    }

    public void docListCTHoaDon() {
        this.listCTHoaDon = ctHDDAO.getListCTHoaDon();
    }

    public ArrayList<CTHoaDon> getListCTHoaDon() {
        return listCTHoaDon;
    }

    public ArrayList<CTHoaDon> getListCTHoaDonTheoMaHD(String maHD) {
    	//chuyển về kiểu int
        int ma = Integer.parseInt(maHD);
        ArrayList<CTHoaDon> dsct = new ArrayList<>();

        for (CTHoaDon cthd : listCTHoaDon) {
            if (cthd.getMaHD() == ma)
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
        cthd.setDonGia(Double.parseDouble(donGia));
        cthd.setSoLuong(Integer.parseInt(soLuong));
        cthd.setThanhTien(Double.parseDouble(thanhTien));

        ctHDDAO.addCTHoaDon(cthd);
    }
}
