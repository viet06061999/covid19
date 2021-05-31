package main1;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main1.dao.user.UserDAO;
import main1.entity.db.User;

public class InputController {

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

    @FXML
    TextField namSinh;
    @FXML
    TextField gioiTinh;
    @FXML
    TextField sdt;
    @FXML
    TextField huyenNoiOHienTai;

    public void luuAction(ActionEvent event) {
        try {
            User user = new User();
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
            UserDAO.getInstance().saveUser(user);
            final Node source = (Node) event.getSource();
            final Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
