package main1;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Screen;
import javafx.stage.Stage;
import main1.dao.user.UserDAO;
import main1.entity.db.User;
import main1.utils.ExelUtil;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button themDuLieu;

    @FXML
    TableView<User> myTableView;

    @FXML
    TableColumn<User, String> maDonVi;
    @FXML
    TableColumn<User, String> maNgay;
    @FXML
    TableColumn<User, String> maBan;
    @FXML
    TableColumn<User, String> maMauBenhPham;
    @FXML
    TableColumn<User, String> hinhThucLayMau;
    @FXML
    TableColumn<User, Integer> maThuTu;
    @FXML
    TableColumn<User, String> hoVaTen;
    @FXML
    TableColumn<User, String> xaNoiOHienTai;
    @FXML
    TableColumn<User, String> thonNoiOHienTai;
    @FXML
    TableColumn<User, String> ngheNghiep;
    @FXML
    TableColumn<User, String> noiLamViecHocTap;
    @FXML
    TableColumn<User, String> doiTuongLayMau;
    @FXML
    TableColumn<User, String> lanLayMau;
    @FXML
    TableColumn<User, String> ghiChuNeuCoTruongHopDacBiet;
    @FXML
    TableColumn<User, String> phanLoaiNoiLayMau;
    @FXML
    TableColumn<User, String> diaDiemNoiLayMau;
    @FXML
    TableColumn<User, String> huyenNoiLayMau;
    @FXML
    TableColumn<User, String> xaNoiLayMau;
    @FXML
    TableColumn<User, String> thonNoiLayMau;
    @FXML
    TableColumn<User, String> loaiMau;
    @FXML
    TableColumn<User, String> donViLayMau;
    @FXML
    TableColumn<User, String> maNguoiDuocLayMau;
    @FXML
    TableColumn<User, String> ngayLayMau;
    @FXML
    TableColumn<User, String> loaiGop;
    @FXML
    TableColumn<User, String> ngayXetNghiem;
    @FXML
    TableColumn<User, String> phuongPhapXetNghiem;
    @FXML
    TableColumn<User, String> ngayTraKetQuaXetNghiem;
    @FXML
    TableColumn<User, String> donViGuiMau;
    @FXML
    TableColumn<User, String> tinhTrangMau;
    @FXML
    TableColumn<User, String> ketQuaXetNghiem;
    @FXML
    TableColumn<User, String> ctValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maDonVi.setCellValueFactory(new PropertyValueFactory<User, String>("maDonVi"));
        maNgay.setCellValueFactory(new PropertyValueFactory<User, String>("maNgay"));
        maBan.setCellValueFactory(new PropertyValueFactory<User, String>("maBan"));
        maMauBenhPham.setCellValueFactory(new PropertyValueFactory<User, String>("maMauBenhPham"));
        hinhThucLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("hinhThucLayMau"));
        maThuTu.setCellValueFactory(new PropertyValueFactory<User, Integer>("maThuTu"));
        hoVaTen.setCellValueFactory(new PropertyValueFactory<User, String>("hoTen"));
        xaNoiOHienTai.setCellValueFactory(new PropertyValueFactory<User, String>("xa"));
        thonNoiOHienTai.setCellValueFactory(new PropertyValueFactory<User, String>("thon"));
        ngheNghiep.setCellValueFactory(new PropertyValueFactory<User, String>("noiLamViec"));
        noiLamViecHocTap.setCellValueFactory(new PropertyValueFactory<User, String>("noiLamViec"));
        doiTuongLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("doiTuongLayMau"));
        lanLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("lanLayMau"));
        ghiChuNeuCoTruongHopDacBiet.setCellValueFactory(new PropertyValueFactory<User, String>("ghiChu"));
        phanLoaiNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("phanLoaiNoiLayMau"));
        diaDiemNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("diaDiemNoiLayMau"));
        huyenNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("huyenLayMau"));
        xaNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("xaLayMau"));
        thonNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("thonLayMau"));
        loaiMau.setCellValueFactory(new PropertyValueFactory<User, String>("loaiMau"));
        donViLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("donViLayMau"));
        maNguoiDuocLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("maNguoiDuocLayMau"));
        ngayLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("ngayLayMau"));
        ngayXetNghiem.setCellValueFactory(new PropertyValueFactory<User, String>("ngayXetNghiem"));
        phuongPhapXetNghiem.setCellValueFactory(new PropertyValueFactory<User, String>("phuongPhapXetNghiem"));
        ngayTraKetQuaXetNghiem.setCellValueFactory(new PropertyValueFactory<User, String>("ngayTraKetQua"));
        donViGuiMau.setCellValueFactory(new PropertyValueFactory<User, String>("donViGuiMau"));
        tinhTrangMau.setCellValueFactory(new PropertyValueFactory<User, String>("tinhTrangMau"));
        ketQuaXetNghiem.setCellValueFactory(new PropertyValueFactory<User, String>("ketQuaXetNghiem"));
        ctValue.setCellValueFactory(new PropertyValueFactory<User, String>("ctValue"));
        bindTableView(UserDAO.getInstance().getUsers());
    }

    void bindTableView(List<User> users) {
        ObservableList list = FXCollections.observableArrayList(users);
        myTableView.setItems(list);
    }

    public void timKiemAction(ActionEvent event) {
        System.out.println("Button Clicked!");

        Date now = new Date();

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");

        // Dữ liệu Model
        String dateTimeString = df.format(now);

        // Hiển thị lên VIEW.
        //myTextField.setText(dateTimeString);

    }

    public void xuatExcelAction(ActionEvent event) {
        try {
            ExelUtil.export(UserDAO.getInstance().getUsers(), myTableView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void themDuLieuAction(ActionEvent event) {
        Stage stage = new Stage();
        Parent myNewScene = null;
        if (event.getSource() == themDuLieu) {
            //stage = (Stage) themDuLieu.getScene().getWindow();
            try {
                myNewScene = FXMLLoader.load(getClass().getResource("insert.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Scene scene = new Scene(myNewScene);
        stage.setScene(scene);
        stage.setTitle("Nhập dữ liệu");
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        //stage.setX(bounds.getMinX());
        //stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth() / 1.2);
        stage.setHeight(bounds.getHeight() / 1.2);
        stage.show();

    }

}
