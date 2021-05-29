package main1.entity.db;

import main1.utils.Utils;

import java.sql.*;
import java.util.logging.Logger;

public class AIMSDB {

	private static Logger LOGGER = Utils.getLogger(Connection.class.getName());
	private static Connection connect;

    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:src/resources/assets/db/aims.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE User (\n" +
                "stt INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n"+
                "maDonVi VARCHAR(45) ,\n"+
                "maNgay VARCHAR(45) ,\n" +
                "maBan VARCHAR(45) ,\n" +
                "maMauBenhPham VARCHAR(45) ,\n" +
                "hinhThucLayMau VARCHAR(45) ,\n" +
                "hoTen VARCHAR(255) ,\n" +
                "namSinh VARCHAR(45) ,\n" +
                "gioiTinh VARCHAR(45) ,\n" +
                "sdt VARCHAR(45) ,\n" +
                "huyen VARCHAR(45) ,\n" +
                "xa VARCHAR(45) ,\n" +
                "thon VARCHAR(45) ,\n" +
                "ngheNghiep VARCHAR(255) ,\n" +
                "noiLamViec VARCHAR(255) ,\n" +
                "doiTuongLayMau VARCHAR(45) ,\n" +
                "lanLaymau VARCHAR(45),\n" +
                "ghiChu VARCHAR(45) ,\n" +
                "phanLoaiNoiLayMau VARCHAR(45) ,\n" +
                "diaDiemNoiLaymau VARCHAR(45) ,\n" +
                "huyenLayMau VARCHAR(45) ,\n" +
                "xaLayMau VARCHAR(45) ,\n" +
                "thonLayMau VARCHAR(45) ,\n" +
                "loaiMau VARCHAR(45) ,\n" +
                "donViLayMau VARCHAR(45) ,\n" +
                "maNguoiDuocLayMau VARCHAR(45) ,\n" +
                "ngayLayMau VARCHAR(45) ,\n" +
                "loaiGop  VARCHAR(45) ,\n" +
                "ngayXetNghiem VARCHAR(45) ,\n" +
                "phuongPhapXetNghiem VARCHAR(45) ,\n" +
                "ngayTraKetQua VARCHAR(45) ,\n" +
                "donViGuiMau VARCHAR(45) ,\n" +
                "tinhTrangMau VARCHAR(45),\n" +
                "ketQuaXetNghiem VARCHAR(45) ,\n" +
                "ctValue VARCHAR(45) \n" +
                ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

	// TODO: refactor Utils -> limit connections
    public static Connection getConnection() {
        if (connect != null) return connect;
        try {
			Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:src/resources/assets/db/aims.db";
            connect = DriverManager.getConnection(url);
            if (connect != null) {
                System.out.println("khong null");
              createNewTable();
            }
            LOGGER.info("Connect database successfully");
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        } 
        return connect;
    }

    public static void main(String[] args) {
        AIMSDB.getConnection();
    }
}
