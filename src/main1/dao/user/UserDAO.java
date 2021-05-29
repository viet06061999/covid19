package main1.dao.user;

import main1.entity.db.AIMSDB;
import main1.entity.db.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public int saveUser(User user)  {

        PreparedStatement ps =
                null;
        try {
            ps = AIMSDB.getConnection().prepareStatement
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
          return  ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }

    public List<User> getUsers() {
        String sql = "SELECT * FROM User ";
        List<User> userList = new ArrayList<>();
        try {
            ResultSet res = AIMSDB.getConnection().createStatement().executeQuery(sql);
            while (res.next()) {
                User user = new User();
                user.setStt(res.getInt("stt"));
                user.setMaDonVi(res.getString("maDonVi"));
                user.setMaNgay(res.getString("maNgay"));
                user.setMaBan(res.getString("maBan"));
                user.setMaMauBenhPham(res.getString("maMauBenhPham"));
                user.setHinhThucLayMau(res.getString("hinhThucLayMau"));
                user.setHoTen(res.getString("hoTen"));
                user.setNamSinh(res.getString("namSinh"));
                user.setGioiTinh(res.getString("gioiTinh"));
                user.setSdt(res.getString("sdt"));
                user.setHuyen(res.getString("huyen"));
                user.setXa(res.getString("xa"));
                user.setThon(res.getString("thon"));
                user.setNgheNghiep(res.getString("ngheNghiep"));
                user.setNoiLamViec(res.getString("noiLamViec"));
                user.setDoiTuongLayMau(res.getString("doiTuongLayMau"));
                user.setLanLaymau(res.getString("lanLaymau"));
                user.setGhiChu(res.getString("ghiChu"));
                user.setPhanLoaiNoiLayMau(res.getString("phanLoaiNoiLayMau"));
                user.setDiaDiemNoiLaymau(res.getString("diaDiemNoiLaymau"));
                user.setHuyenLayMau(res.getString("huyenLayMau"));
                user.setXaLayMau(res.getString("xaLayMau"));
                user.setThonLayMau(res.getString("thonLayMau"));
                user.setLoaiMau(res.getString("loaiMau"));
                user.setDonViLayMau(res.getString("donViLayMau"));
                user.setMaNguoiDuocLayMau(res.getString("maNguoiDuocLayMau"));
                user.setNgayLayMau(res.getString("ngayLayMau"));
                user.setLoaiGop(res.getString("loaiGop"));
                user.setNgayXetNghiem(res.getString("ngayXetNghiem"));
                user.setPhuongPhapXetNghiem(res.getString("phuongPhapXetNghiem"));
                user.setNgayTraKetQua(res.getString("ngayTraKetQua"));
                user.setDonViGuiMau(res.getString("donViGuiMau"));
                user.setTinhTrangMau(res.getString("tinhTrangMau"));
                user.setKetQuaXetNghiem(res.getString("ketQuaXetNghiem"));
                user.setCtValue(res.getString("ctValue"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public List<User> searchUsers(String query) {
        List<User> userList = getUsers();
        userList = userList.stream().filter(element -> {
          return  element.toString().contains(query);
        }).collect(Collectors.toList());
        return userList;
    }

    public void delete(String stt) throws SQLException {
        String sql = "DELETE FROM User WHERE 1";
        AIMSDB.getConnection().createStatement().executeUpdate(sql);
    }

    public static void main(String[] args) {
        User user = new User();
        user.setHoTen("Nguyen Bac Nam");
        UserDAO userDAO = UserDAO.getInstance();
        List<User> userList = userDAO.getUsers();
        System.out.println(userList);
        List<User> userList1 = userDAO.searchUsers("Nguyen Bac Nam");
        System.out.println(userList1);
    }
}
