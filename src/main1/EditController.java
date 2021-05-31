package main1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;
import main1.dao.user.UserDAO;
import main1.entity.db.User;

import java.io.IOException;

public class EditController {

    @FXML
    TextField maDonVi;
    @FXML
    TextField maNgay;
    @FXML
    TextField maBan;
    @FXML
    TextField maMauBenhPham;
    @FXML
    TextField hinhThucLayMau;
    @FXML
    TextField hoVaTen;
    @FXML
    TextField namSinh;
    @FXML
    TextField gioiTinh;
    @FXML
    TextField sdt;
    @FXML
    TextField huyenNoiOHienTai;
    @FXML
    TextField xaNoiOHienTai;
    @FXML
    TextField thonNoiOHienTai;
    @FXML
    TextField ngheNghiep;
    @FXML
    TextField noiLamViecHocTap;
    @FXML
    TextField doiTuongLayMau;
    @FXML
    TextField lanLayMau;
    @FXML
    TextField ghiChuNeuCoTruongHopDacBiet;
    @FXML
    TextField phanLoaiNoiLayMau;
    @FXML
    TextField diaDiemNoiLayMau;
    @FXML
    TextField huyenNoiLayMau;
    @FXML
    TextField xaNoiLayMau;
    @FXML
    TextField thonNoiLayMau;
    @FXML
    TextField loaiMau;
    @FXML
    TextField donViLayMau;
    @FXML
    TextField maNguoiDuocLayMau;
    @FXML
    TextField ngayLayMau;
    @FXML
    TextField loaiGop;
    @FXML
    TextField ngayXetNghiem;
    @FXML
    TextField phuongPhapXetNghiem;
    @FXML
    TextField ngayTraKetQuaXetNghiem;
    @FXML
    TextField donViGuiMau;
    @FXML
    TextField tinhTrangMau;
    @FXML
    TextField ketQuaXetNghiem;
    @FXML
    TextField ctValue;
    User user;
    private Stage thisStage;

    public EditController(User user) {
        // We received the first controller, now let's make it usable throughout this controller.
        this.user = user;
        // Create the new stage
        thisStage = new Stage();

        // Load the FXML file
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("edit.fxml"));
            // Set this class as the controller
            loader.setController(this);
            thisStage.setScene(new Scene(loader.load()));
            // Setup the window/stage
            Screen screen = Screen.getPrimary();
            Rectangle2D bounds = screen.getVisualBounds();
            thisStage.setTitle("Chỉnh sửa thông tin");
            thisStage.setWidth(bounds.getWidth() /1.3);
            thisStage.setHeight(bounds.getHeight());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void initialize() {
        maDonVi.setText(user.getMaDonVi());
        maNgay.setText(user.getMaNgay());
        maBan.setText(user.getMaBan());
        maMauBenhPham.setText(user.getMaMauBenhPham());
        hinhThucLayMau.setText(user.getHinhThucLayMau());
        hoVaTen.setText(user.getHoTen());
        namSinh.setText(user.getNamSinh());
        gioiTinh.setText(user.getGioiTinh());
        sdt.setText(user.getSdt());
        huyenNoiOHienTai.setText(user.getHuyen());

        xaNoiOHienTai.setText(user.getXa());
        thonNoiOHienTai.setText(user.getThon());
        ngheNghiep.setText(user.getNgheNghiep());
        noiLamViecHocTap.setText(user.getNoiLamViec());
        doiTuongLayMau.setText(user.getDoiTuongLayMau());
        lanLayMau.setText(user.getLanLaymau());
        ghiChuNeuCoTruongHopDacBiet.setText(user.getGhiChu());
        phanLoaiNoiLayMau.setText(user.getPhanLoaiNoiLayMau());

        diaDiemNoiLayMau.setText(user.getDiaDiemNoiLaymau());
        huyenNoiLayMau.setText(user.getHuyenLayMau());
        xaNoiLayMau.setText(user.getXaLayMau());
        thonNoiLayMau.setText(user.getThonLayMau());
        loaiMau.setText(user.getLoaiMau());
        donViLayMau.setText(user.getDonViLayMau());
        maNguoiDuocLayMau.setText(user.getMaNguoiDuocLayMau());
        ngayLayMau.setText(user.getNgayLayMau());
        loaiGop.setText(user.getLoaiGop());
        ngayXetNghiem.setText(user.getNgayXetNghiem());
        phuongPhapXetNghiem.setText(user.getPhuongPhapXetNghiem());
        ngayTraKetQuaXetNghiem.setText(user.getNgayTraKetQua());
        donViGuiMau.setText(user.getDonViGuiMau());
        tinhTrangMau.setText(user.getTinhTrangMau());
        ketQuaXetNghiem.setText(user.getKetQuaXetNghiem());
        ctValue.setText(user.getCtValue());
    }

    /**
     * Show the stage that was loaded in the constructor
     */
    public void showStage() {
        thisStage.showAndWait();
    }

    public void luuAction(ActionEvent event) {
        try {
            User user = new User();
            user.setStt(this.user.getStt());
            user.setMaDonVi(maDonVi.getText());
            user.setMaNgay(maNgay.getText());
            user.setMaBan(maBan.getText());
            user.setMaMauBenhPham(maMauBenhPham.getText());
            user.setHinhThucLayMau(hinhThucLayMau.getText());
            user.setHoTen(hoVaTen.getText());
            user.setNamSinh(namSinh.getText());
            user.setGioiTinh(gioiTinh.getText());
            user.setSdt(sdt.getText());
            user.setHuyen(huyenNoiOHienTai.getText());
            user.setXa(xaNoiOHienTai.getText());
            user.setThon(thonNoiOHienTai.getText());
            user.setNgheNghiep(ngheNghiep.getText());
            user.setNoiLamViec(noiLamViecHocTap.getText());
            user.setDoiTuongLayMau(doiTuongLayMau.getText());
            user.setLanLaymau(lanLayMau.getText());
            user.setGhiChu(ghiChuNeuCoTruongHopDacBiet.getText());
            user.setPhanLoaiNoiLayMau(phanLoaiNoiLayMau.getText());
            user.setDiaDiemNoiLaymau(diaDiemNoiLayMau.getText());
            user.setHuyenLayMau(huyenNoiLayMau.getText());
            user.setXaLayMau(xaNoiLayMau.getText());
            user.setThonLayMau(thonNoiLayMau.getText());
            user.setDonViLayMau(donViLayMau.getText());
            user.setLoaiMau(loaiMau.getText());
            user.setMaNguoiDuocLayMau(maNguoiDuocLayMau.getText());
            user.setNgayLayMau(ngayLayMau.getText());
            user.setLoaiGop(loaiGop.getText());
            user.setNgayXetNghiem(ngayXetNghiem.getText());
            user.setPhuongPhapXetNghiem(phuongPhapXetNghiem.getText());
            user.setNgayTraKetQua(ngayTraKetQuaXetNghiem.getText());
            user.setDonViGuiMau(donViGuiMau.getText());
            user.setTinhTrangMau(tinhTrangMau.getText());
            user.setKetQuaXetNghiem(ketQuaXetNghiem.getText());
            user.setCtValue(ctValue.getText());
            UserDAO.getInstance().editUser(user);
            final Node source = (Node) event.getSource();
            final Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
