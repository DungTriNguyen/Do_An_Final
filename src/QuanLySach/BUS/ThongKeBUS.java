/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLySach.BUS;

import QuanLySach.DAO.ThongKeDAO;
import QuanLySach.DTO.ThongKe;


/**
 * @author User
 */
public class ThongKeBUS {

    public ThongKeDAO thongKeDAO = new ThongKeDAO();

    public ThongKe thongKe(int nam) {
        return thongKeDAO.getThongKe(nam);
    }

}
