package main1.dao.user;

import main1.entity.db.AIMSDB;
import main1.entity.db.User;

import java.sql.*;

/**
 * @author
 */
public class UserDAO {

    private static UserDAO instance;

    private UserDAO() {
        super();
    }

    public static UserDAO getInstance() {
        if (instance == null) instance = new UserDAO();
        return instance;
    }


    public void saveUser(User user) throws SQLException {
        PreparedStatement ps =
                AIMSDB.getConnection().prepareStatement
                        ("INSERT INTO User (maDonVi,maNgay,maBan,maMauBenhPham,hinhThucLayMau,hoTen,namSinh,gioiTinh,sdt" +
                                ",huyen,xa,thon,ngheNghiep,noiLamViec,doiTuongLayMau,lanLaymau,ghiChu,phanLoaiNoiLayMau" +
                                ",diaDiemNoiLaymau,huyenLayMau,xaLayMau,thonLayMau,loaiMau,donViLayMau,maNguoiDuocLayMau," +
                                "ngayLayMau,loaiGop,ngayXetNghiem,phuongPhapXetNghiem,ngayTraKetQua,donViGuiMau, tinhTrangMau,ketQuaXetNghiem,ctValue) " +
                                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, user.getMaDonVi());
        ps.setString(2, user.getMaNgay());
        ps.setString(3, user.getMaBan());
        ps.setString(4, user.getMaMauBenhPham());
        ps.setString(5, user.getHinhThucLayMau());
        ps.setString(6, user.getHoTen());
        ps.setString(7, user.getNamSinh());
        ps.setString(8, user.getGioiTinh());
        ps.setString(9, user.getSdt());
        ps.setString(10, user.getHuyen());
        ps.setString(11, user.getXa());
        ps.setString(12, user.getThon());
        ps.setString(13, user.getNgheNghiep());
        ps.setString(14, user.getNoiLamViec());
        ps.setString(15, user.getDoiTuongLayMau());
        ps.setString(16, user.getLanLaymau());
        ps.setString(17, user.getGhiChu());
        ps.setString(18, user.getPhanLoaiNoiLayMau());
        ps.setString(19, user.getDiaDiemNoiLaymau());
        ps.setString(20, user.getHuyenLayMau());
        ps.setString(21, user.getXaLayMau());
        ps.setString(22, user.getThonLayMau());
        ps.setString(23, user.getLoaiMau());
        ps.setString(24, user.getDonViLayMau());
        ps.setString(25, user.getMaNguoiDuocLayMau());
        ps.setString(26, user.getNgayLayMau());
        ps.setString(27, user.getLoaiGop());
        ps.setString(28, user.getNgayXetNghiem());
        ps.setString(29, user.getPhuongPhapXetNghiem());
        ps.setString(30, user.getNgayTraKetQua());
        ps.setString(31, user.getDonViGuiMau());
        ps.setString(32, user.getTinhTrangMau());
        ps.setString(33, user.getKetQuaXetNghiem());
        ps.setString(34, user.getCtValue());
        ps.executeUpdate();
//        String sql = "INSERT INTO User VALUES(" +
//               user.getStt()+ "," + user.getMaDonVi()+ "," + user.getMaNgay()
//                + "," +  user.getMaBan() +  "," +  user.getMaMauBenhPham()
//                +  "," +  user.getHinhThucLayMau() +  "," +  user.getHoTen()
//                +  "," +  user.getNamSinh()+  "," +  user.getGioiTinh()
//                +  "," +  user.getSdt()+"," +   user.getHuyen()
//                +  "," +  user.getXa()+ "," +  user.getThon()
//                +  "," +  user.getNgheNghiep()+"," +   user.getNoiLamViec()
//                +  "," +  user.getDoiTuongLayMau()+"," +   user.getLanLaymau()
//                +  "," +  user.getGhiChu()+ "," +  user.getPhanLoaiNoiLayMau()
//                +  "," +  user.getDiaDiemNoiLaymau()+"," +   user.getHuyenLayMau()
//                +  "," +  user.getXaLayMau()+"," +   user.getThonLayMau()
//                +"," +   user.getLoaiMau() +  "," +  user.getDonViLayMau()
//                +"," +   user.getMaNguoiDuocLayMau() +  "," +  user.getNgayLayMau()
//                + "," +  user.getLoaiGop() +  "," +  user.getNgayXetNghiem()
//                +  "," +  user.getPhuongPhapXetNghiem() +"," +user.getNgayTraKetQua()
//                +  "," +  user.getDonViGuiMau() +"," +user.getTinhTrangMau()
//                +  "," +  user.getKetQuaXetNghiem() +"," +user.getCtValue()
//                +")";
//        try {
//            AIMSDB.getConnection().createStatement().execute(sql);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }

    public void authenticate() throws SQLException {
        String sql = "SELECT * FROM User ";
        ResultSet res = AIMSDB.getConnection().createStatement().executeQuery(sql);
        while (res.next()){
            System.out.println(res.getString("hoTen"));
        }
    }

    public void delete(String stt) throws SQLException {
        String sql = "DELETE FROM User WHERE 1";
        AIMSDB.getConnection().createStatement().executeUpdate(sql);
    }

    public static void main(String[] args) {
        User user = new User();
        user.setHoTen("Nguyen Bac Viet");
        user.setCtValue("ctvalue");
        UserDAO userDAO = UserDAO.getInstance();
        try {
            userDAO.saveUser(user);
            userDAO.authenticate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
