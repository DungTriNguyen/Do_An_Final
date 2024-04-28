package QuanLySach.DTO;

public class SanPham {
    private int maSP;
    private String tenSP;
    private int maLoai;
    private int soLuong;
    private String donViTinh;
    private String hinhAnh;
    private int donGia;
    private String size;
    private String color;

    public SanPham() {

    }

    public SanPham(int maSP, String tenSP, int maLoai, int soLuong, String donViTinh, String hinhAnh, int donGia,String color,String size) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maLoai = maLoai;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.hinhAnh = hinhAnh;
        this.donGia = donGia;
        this.color = color;
        this.size = size;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }
    public String getsize() {
        return size;
    }

    public void setsize(String size) {
        this.size = size;
    }
}
