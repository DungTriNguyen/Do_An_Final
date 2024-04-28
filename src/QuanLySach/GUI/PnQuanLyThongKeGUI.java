package QuanLySach.GUI;

import QuanLySach.BUS.ThongKeBUS;
import QuanLySach.DTO.ThongKe;
import MyCustom.TransparentPanel;
import javax.swing.*;

import java.awt.*;

import static Main.Main.changLNF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;

public class PnQuanLyThongKeGUI extends JPanel {

    public PnQuanLyThongKeGUI() {
        changLNF("Windows");
        addControls();
        addEvents();
    }

    ThongKeBUS thongKeBUS = new ThongKeBUS();
//    final Color colorPanel = new Color(56, 56, 56);
    final Color colorPanel = new Color(92, 92, 92);

    JLabel lblThongKeSach, lblThongKeKhachHang, lblThongKeNhanVien, lblThongKeDoanhThu;
    JLabel lblDoanhThuQuy1, lblDoanhThuQuy2, lblDoanhThuQuy3, lblDoanhThuQuy4, lblTongDoanhThu;
    JComboBox<Integer> cmbNam;
    JPanel pnMain;

    private void addControls() {
        this.setLayout(new BorderLayout());
        this.setBackground(colorPanel);
        int w = 1600;
        int h = 100;

        //========================================
        pnMain = new TransparentPanel();
        pnMain.setFont(new Font("Tahoma", Font.PLAIN, 18));
        pnMain.setLayout(new BorderLayout());

        JPanel pnThongKeTong = new JPanel(null);
        pnThongKeTong.setBackground(colorPanel);
        JLabel lblTileThongKeTong, lblBackgroundSach, lblBackgroundKhachHang, lblBackgroundNhanVien, lblBackgroundDoanhThu;

        lblTileThongKeTong = new JLabel("THỐNG KÊ TỔNG QUÁT", JLabel.CENTER);
        lblTileThongKeTong.setFont(new Font("Tahoma", Font.BOLD, 28));

        // SET KHUNG CHO CÁC LABEL BACKGROUND
        lblBackgroundSach = new JLabel(new ImageIcon("image/ManagerUI/thongKeMon.png"));
        lblBackgroundKhachHang = new JLabel(new ImageIcon("image/ManagerUI/thongKeKhachHang.png"));
        lblBackgroundNhanVien = new JLabel(new ImageIcon("image/ManagerUI/thongKeNhanVien.png"));
        lblBackgroundDoanhThu = new JLabel(new ImageIcon("image/ManagerUI/thongKeDoanhThu.png"));

        //SET VỊ TRÍ CHO CÁC LBL VÀ BACKGROUND
        lblTileThongKeTong.setBounds(0, 15, w, 50);

        lblBackgroundSach.setBounds(98, 85, 369, 201);
        lblBackgroundKhachHang.setBounds(563, 85, 369, 201);
        lblBackgroundNhanVien.setBounds(98, 340, 369, 201);
        lblBackgroundDoanhThu.setBounds(563, 340, 369, 201);

        //SET TEXT MAC DINH CHO CÁC LBL
        lblThongKeSach = new JLabel("55", JLabel.CENTER);
        lblThongKeKhachHang = new JLabel("46", JLabel.CENTER);
        lblThongKeNhanVien = new JLabel("23", JLabel.CENTER);
        lblThongKeDoanhThu = new JLabel("1.286.379.000", JLabel.CENTER);

        // SET FONT
        Font font = new Font("Tahoma", Font.BOLD, 48);
        lblThongKeSach.setFont(font);
        lblThongKeKhachHang.setFont(font);
        lblThongKeNhanVien.setFont(font);
        lblThongKeDoanhThu.setFont(font);

        // THAY ĐỔI MÀU CHỮ THÀNH TRẮNG
        lblTileThongKeTong.setForeground(Color.white);
        lblThongKeSach.setForeground(Color.white);
        lblThongKeKhachHang.setForeground(Color.white);
        lblThongKeNhanVien.setForeground(Color.white);
        lblThongKeDoanhThu.setForeground(Color.white);

        // SET VỊ TRÍ LBL
        lblThongKeSach.setBounds(98, 100, 232, 87);
        lblThongKeKhachHang.setBounds(563, 100, 232, 87);
        lblThongKeNhanVien.setBounds(98, 350, 232, 87);
        lblThongKeDoanhThu.setBounds(563, 350, 369, 87);

        // ADD VÀO PNTHONGKETONG
        pnThongKeTong.add(lblTileThongKeTong);
        pnThongKeTong.add(lblThongKeSach);
        pnThongKeTong.add(lblThongKeKhachHang);
        pnThongKeTong.add(lblThongKeNhanVien);
        pnThongKeTong.add(lblThongKeDoanhThu);
        pnThongKeTong.add(lblBackgroundSach);
        pnThongKeTong.add(lblBackgroundKhachHang);
        pnThongKeTong.add(lblBackgroundNhanVien);
        pnThongKeTong.add(lblBackgroundDoanhThu);

        // SET TEXT MẶC ĐỊNH CHO DOANH THU TỪNG QUÝ
        lblDoanhThuQuy1 = new JLabel("2.000.000", JLabel.CENTER);
        lblDoanhThuQuy2 = new JLabel("3.000.000", JLabel.CENTER);
        lblDoanhThuQuy3 = new JLabel("9.000.000", JLabel.CENTER);
        lblDoanhThuQuy4 = new JLabel("12.000.000", JLabel.CENTER);
        lblTongDoanhThu = new JLabel("26.000.000", JLabel.CENTER);

        //SET FONT
        Font font1 = new Font("Tahoma", Font.BOLD, 22);
        lblDoanhThuQuy1.setFont(font1);
        lblDoanhThuQuy2.setFont(font1);
        lblDoanhThuQuy3.setFont(font1);
        lblDoanhThuQuy4.setFont(font1);
        font1 = new Font("Tahoma", Font.BOLD, 28);
        lblTongDoanhThu.setFont(font1);

        // SET MÀU CHỮ CHO LBL
        lblDoanhThuQuy1.setForeground(Color.WHITE);
        lblDoanhThuQuy2.setForeground(Color.WHITE);
        lblDoanhThuQuy3.setForeground(Color.WHITE);
        lblDoanhThuQuy4.setForeground(Color.WHITE);
        lblTongDoanhThu.setForeground(Color.WHITE);

        // SET VỊ TRÍ CHO CÁC LBL DOANHTHU
        int x = 265;
        int y = 673;
        lblDoanhThuQuy1.setBounds(x, y, 167, 63);
        lblDoanhThuQuy2.setBounds(x += 167, y, 167, 63);
        lblDoanhThuQuy3.setBounds(x += 167, y, 167, 63);
        lblDoanhThuQuy4.setBounds(x += 167, y, 167, 63);
        lblTongDoanhThu.setBounds(265, 735, 667, 63);

        //ADD CÁC LBLDOANHTHU VAO TRONG PNTHONGKETONG
        pnThongKeTong.add(lblTongDoanhThu);
        pnThongKeTong.add(lblDoanhThuQuy1);
        pnThongKeTong.add(lblDoanhThuQuy2);
        pnThongKeTong.add(lblDoanhThuQuy3);
        pnThongKeTong.add(lblDoanhThuQuy4);

        // COMBOBOX
        cmbNam = new JComboBox<>();
        int year = Calendar.getInstance().get(Calendar.YEAR);         // lấy năm hiện tại gán vào biến year
        for (int i = year; i >= year - 10; i--)
            cmbNam.addItem(i);                                          // thêm các năm trong khoảng 10 năm trước
        cmbNam.setFont(new Font("Tahoma", Font.PLAIN, 18));
        cmbNam.setBounds(w / 2 - 100 / 2, 560, 120, 35);

        pnThongKeTong.add(cmbNam);
        

        // KHUNG VIEN CHO TABLE DOANH THU
        JLabel lblBackgroundBang = new JLabel(new ImageIcon("image/ManagerUI/bangThongKe.png"));
        lblBackgroundBang.setBounds(98, 610, 834, 189);
        pnThongKeTong.add(lblBackgroundBang);

        // ADD PNTHOGNKETONG VAO PNMAIN
        pnMain.add(pnThongKeTong);

        //ADD PNMAIN VAO FRAME
        this.add(pnMain, BorderLayout.CENTER);
        hienThiThongKe();
    }

    private void addEvents() {

        cmbNam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hienThiThongKe();
            }
        });
    }




    private DecimalFormat dcf = new DecimalFormat("###,###");

    private void hienThiThongKe() {
        ThongKe thongKe = thongKeBUS.thongKe(Integer.parseInt(cmbNam.getSelectedItem() + ""));
        lblThongKeSach.setText(dcf.format(thongKe.getSoLuongSP()));
        lblThongKeKhachHang.setText(dcf.format(thongKe.getSoLuongKH()));
        lblThongKeNhanVien.setText(dcf.format(thongKe.getSoLuongNV()));
        lblThongKeDoanhThu.setText(dcf.format(thongKe.getTongDoanhThu()));
        lblDoanhThuQuy1.setText(dcf.format(thongKe.getTongThuQuy(1)));
        lblDoanhThuQuy2.setText(dcf.format(thongKe.getTongThuQuy(2)));
        lblDoanhThuQuy3.setText(dcf.format(thongKe.getTongThuQuy(3)));
        lblDoanhThuQuy4.setText(dcf.format(thongKe.getTongThuQuy(4)));
        lblTongDoanhThu.setText(dcf.format(thongKe.getTongDoanhThu()));
    }

}
