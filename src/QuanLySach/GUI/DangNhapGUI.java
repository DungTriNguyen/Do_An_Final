package QuanLySach.GUI;

import Main.Main;
import MyCustom.ImagePanel;
import MyCustom.MyDialog;
import QuanLySach.GUI.MainQuanLyGUI;
import QuanLySach.BUS.DangNhapBUS;
import QuanLySach.DTO.TaiKhoan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DangNhapGUI extends JFrame {

    public DangNhapGUI() {
        this.setTitle("Đăng nhập");
        this.setSize(860, 430);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        addControls();
        xuLyTaiKhoanDaGhiNho();
        addEvents();
    }

    private void xuLyTaiKhoanDaGhiNho() {
        DangNhapBUS dangNhapBUS = new DangNhapBUS();
        String line = dangNhapBUS.getTaiKhoanGhiNho();
        try {
            String[] arr = line.split(" | ");
            ckbRemember.setSelected(true);
            txtUser.setText(arr[0]);
            txtPassword.setText(arr[2]);
            txtUser.requestFocus();
        } catch (Exception e) {
            txtUser.setText("");
            txtPassword.setText("");
            txtUser.requestFocus();
        }
    }

    private JLabel btnExit, btnLogin, btnForgot;
    private JLabel lblUser, lblPassword;
    private JTextField txtUser;
    private JPasswordField txtPassword;
    private JPanel pnMain;
    private JCheckBox ckbRemember;

    private void addControls() {
        Container con = getContentPane();

//        pnMain = new ImagePanel("image/LoginUI/background.png");
        pnMain = new ImagePanel("image/LoginUI/background_login.jpeg");

        pnMain.setForeground(new Color(0, 0, 0));
        pnMain.setLayout(null);

        btnExit = new JLabel(new ImageIcon("image/LoginUI/btn-close.png"));
        btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnExit.setBounds(820, 0, 40, 40);

        btnLogin = new JLabel(new ImageIcon("image/LoginUI/btn-login.png"));
        btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogin.setBounds(60, 285, 310, 60);

        btnForgot = new JLabel(new ImageIcon("image/LoginUI/btn-forgot.png"));
        btnForgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnForgot.setBounds(60, 345, 310, 25);

        Font fontTXT = new Font("", Font.BOLD, 18);
        Font fontLBL = new Font("", Font.BOLD, 18);
        lblUser = new JLabel("Mã nhân viên");
        lblUser.setBackground(new Color(0, 0, 0, 0f));
        lblUser.setForeground(Color.WHITE);
        lblUser.setFont(fontLBL);
        lblUser.setBounds(60, 60, 310, 25);
        
        txtUser = new JTextField();
        txtUser.setBackground(new Color(0, 0, 0, 0f));
        txtUser.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
        txtUser.setForeground(Color.WHITE);
        txtUser.setFont(fontTXT);
        txtUser.setHorizontalAlignment(JTextField.LEFT);
        txtUser.setBounds(60, 85, 310, 50);

        lblPassword = new JLabel("Mật khẩu");
        lblPassword.setBackground(new Color(0, 0, 0, 0));
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(fontLBL);
        lblPassword.setBounds(60, 160, 310, 25);
        
        txtPassword = new JPasswordField();
        txtPassword.setEchoChar('⚫');
        txtPassword.setBackground(new Color(0, 0, 0, 0));
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
        txtPassword.setForeground(Color.WHITE);
        txtPassword.setFont(fontTXT);
        txtPassword.setHorizontalAlignment(JTextField.LEFT);
        txtPassword.setBounds(60, 185, 310, 50);

        Main.changLNF("Windows");
        ckbRemember = new JCheckBox("Ghi nhớ đăng nhập");
        ckbRemember.setFont(fontTXT);
        ckbRemember.setOpaque(false);
        ckbRemember.setForeground(Color.white);
        ckbRemember.setBounds(56, 235, 310, 25);
        ckbRemember.setFocusPainted(false);
        Main.changLNF("Nimbus");

        pnMain.add(lblUser);
        pnMain.add(lblPassword);
        pnMain.add(btnExit);
        pnMain.add(txtUser);
        pnMain.add(txtPassword);
        pnMain.add(ckbRemember);
        pnMain.add(btnLogin);
        pnMain.add(btnForgot);

        con.add(pnMain);
    }

    private void addEvents() {
        moveFrame();
        btnExit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                xuLyThoat();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnExit.setIcon(new ImageIcon("image/LoginUI/btn-close--hover.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnExit.setIcon(new ImageIcon("image/LoginUI/btn-close.png"));
            }
        });
        txtUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPassword.requestFocus();
            }
        });
        txtPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyDangNhap();
            }
        });
        btnForgot.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                xuLyQuenMatKhau();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnForgot.setIcon(new ImageIcon("image/LoginUI/btn-forgot--hover.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnForgot.setIcon(new ImageIcon("image/LoginUI/btn-forgot.png"));
            }
        });
        btnLogin.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                xuLyDangNhap();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogin.setIcon(new ImageIcon("image/LoginUI/btn-login--hover.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLogin.setIcon(new ImageIcon("image/LoginUI/btn-login.png"));
            }
        });
    }

    int xMouse, yMouse;

    private void moveFrame() {
        pnMain.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                Move(x, y);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                xMouse = e.getX();
                yMouse = e.getY();
            }
        });
    }

    private void Move(int x, int y) {
        this.setLocation(x - xMouse, y - yMouse);
    }

    private void xuLyThoat() {
        System.exit(0);
    }

    private void xuLyQuenMatKhau() {
        new MyDialog("Xin liên hệ Admin để giải quyết!", MyDialog.INFO_DIALOG);
    }

    private void xuLyDangNhap() {
        DangNhapBUS dangNhapBUS = new DangNhapBUS();
        TaiKhoan tk = dangNhapBUS.getTaiKhoanDangNhap(txtUser.getText(),
                String.valueOf(txtPassword.getPassword()), ckbRemember.isSelected());
        if (tk != null) {
            this.dispose();
            MainQuanLyGUI gui = new MainQuanLyGUI();
            this.dispose();
            gui.showWindow();
        }
    }

    public void showWindow() {
        Image icon = Toolkit.getDefaultToolkit().getImage("image/ManagerUI/icon-app.png");
        this.setIconImage(icon);
        this.setVisible(true);
    }

}
