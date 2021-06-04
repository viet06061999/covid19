package main1;


import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Callback;
import main1.dao.user.UserDAO;
import main1.entity.db.User;
import main1.utils.ExelUtil;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML Button themDuLieu;
    @FXML TableView<User> myTableView;
    @FXML TableColumn<User, String> maDonVi;
    @FXML TableColumn<User, String> maNgay;
    @FXML TableColumn<User, String> maBan;
    @FXML TableColumn<User, String> maMauBenhPham;
    @FXML TableColumn<User, String> hinhThucLayMau;
    @FXML TableColumn<User, Integer> maThuTu;
    @FXML TableColumn<User, String> hoVaTen;
    @FXML TableColumn<User, String> xaNoiOHienTai;
    @FXML TableColumn<User, String> thonNoiOHienTai;
    @FXML TableColumn<User, String> ngheNghiep;
    @FXML TableColumn<User, String> noiLamViecHocTap;
    @FXML TableColumn<User, String> doiTuongLayMau;
    @FXML TableColumn<User, String> lanLayMau;
    @FXML TableColumn<User, String> ghiChuNeuCoTruongHopDacBiet;
    @FXML TableColumn<User, String> phanLoaiNoiLayMau;
    @FXML TableColumn<User, String> diaDiemNoiLayMau;
    @FXML TableColumn<User, String> huyenNoiLayMau;
    @FXML TableColumn<User, String> xaNoiLayMau;
    @FXML TableColumn<User, String> thonNoiLayMau;
    @FXML TableColumn<User, String> loaiMau;
    @FXML TableColumn<User, String> donViLayMau;
    @FXML TableColumn<User, String> maNguoiDuocLayMau;
    @FXML TableColumn<User, String> ngayLayMau;
    @FXML TableColumn<User, String> loaiGop;
    @FXML TableColumn<User, String> ngayXetNghiem;
    @FXML TableColumn<User, String> phuongPhapXetNghiem;
    @FXML TableColumn<User, String> ngayTraKetQuaXetNghiem;
    @FXML TableColumn<User, String> donViGuiMau;
    @FXML TableColumn<User, String> tinhTrangMau;
    @FXML TableColumn<User, String> ketQuaXetNghiem;
    @FXML TableColumn<User, String> ctValue;
    @FXML TextField timKiemTextField;
    @FXML Button timKiem;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maDonVi.setCellValueFactory(new PropertyValueFactory<User, String>("maDonVi"));
        maNgay.setCellValueFactory(new PropertyValueFactory<User, String>("maNgay"));
        maBan.setCellValueFactory(new PropertyValueFactory<User, String>("maBan"));
        maMauBenhPham.setCellValueFactory(new PropertyValueFactory<User, String>("maMauBenhPham"));
        hinhThucLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("hinhThucLayMau"));
        maThuTu.setCellValueFactory(new PropertyValueFactory<User, Integer>("stt"));
        hoVaTen.setCellValueFactory(new PropertyValueFactory<User, String>("hoTen"));
        xaNoiOHienTai.setCellValueFactory(new PropertyValueFactory<User, String>("xa"));
        thonNoiOHienTai.setCellValueFactory(new PropertyValueFactory<User, String>("thon"));
        ngheNghiep.setCellValueFactory(new PropertyValueFactory<User, String>("noiLamViec"));
        noiLamViecHocTap.setCellValueFactory(new PropertyValueFactory<User, String>("noiLamViec"));
        doiTuongLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("doiTuongLayMau"));
        lanLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("lanLaymau"));
        ghiChuNeuCoTruongHopDacBiet.setCellValueFactory(new PropertyValueFactory<User, String>("ghiChu"));
        phanLoaiNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("phanLoaiNoiLayMau"));
        diaDiemNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("diaDiemNoiLaymau"));
        huyenNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("huyenLayMau"));
        xaNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("xaLayMau"));
        thonNoiLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("thonLayMau"));
        loaiMau.setCellValueFactory(new PropertyValueFactory<User, String>("loaiMau"));
        donViLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("donViLayMau"));
        maNguoiDuocLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("maNguoiDuocLayMau"));
        loaiGop.setCellValueFactory(new PropertyValueFactory<User, String>("loaiGop"));
        ngayLayMau.setCellValueFactory(new PropertyValueFactory<User, String>("ngayLayMau"));
        ngayXetNghiem.setCellValueFactory(new PropertyValueFactory<User, String>("ngayXetNghiem"));
        phuongPhapXetNghiem.setCellValueFactory(new PropertyValueFactory<User, String>("phuongPhapXetNghiem"));
        ngayTraKetQuaXetNghiem.setCellValueFactory(new PropertyValueFactory<User, String>("ngayTraKetQua"));
        donViGuiMau.setCellValueFactory(new PropertyValueFactory<User, String>("donViGuiMau"));
        tinhTrangMau.setCellValueFactory(new PropertyValueFactory<User, String>("tinhTrangMau"));
        ketQuaXetNghiem.setCellValueFactory(new PropertyValueFactory<User, String>("ketQuaXetNghiem"));
        ctValue.setCellValueFactory(new PropertyValueFactory<User, String>("ctValue"));
        bindTableView(UserDAO.getInstance().getUsers());
        UserDAO.getInstance().isUpdate.addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                bindTableView(UserDAO.getInstance().getUsers());
            }
        });
        myTableView.setRowFactory(
                new Callback<TableView<User>, TableRow<User>>() {
                    @Override
                    public TableRow<User> call(TableView<User> tableView) {
                        final TableRow<User> row = new TableRow<>();
                        final ContextMenu rowMenu = new ContextMenu();
                        MenuItem editItem = new MenuItem("Sửa");
                        editItem.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                new EditController(row.getItem()).showStage();
                            }
                        });
                        MenuItem removeItem = new MenuItem("Xóa");
                        removeItem.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                UserDAO.getInstance().deleteUser(row.getItem().getStt());
                            }
                        });
                        rowMenu.getItems().addAll(editItem, removeItem);

                        // only display context menu for non-empty rows:
                        row.contextMenuProperty().bind(
                                Bindings.when(row.emptyProperty())
                                        .then((ContextMenu) null)
                                        .otherwise(rowMenu));
                        return row;
                    }
                });
    }

    void bindTableView(List<User> users) {
        ObservableList list = FXCollections.observableArrayList(users);
        myTableView.setItems(list);
    }

    public void timKiemAction(ActionEvent event) {
        String query = timKiemTextField.getText();
        if (query == null || query.isEmpty()) {
            bindTableView(UserDAO.getInstance().getUsers());
        } else {
            bindTableView(UserDAO.getInstance().searchUsers(query));
        }
    }

    public void xuatExcelAction(ActionEvent event) {
        try {
            ExelUtil.export(UserDAO.getInstance().getUsers(), myTableView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void nhapExcelAction(ActionEvent event) {
        try {
            ExelUtil.importExcel(myTableView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void themDuLieuAction(ActionEvent event) {
        Stage stage = new Stage();
        Parent myNewScene = null;
        try {
            myNewScene = FXMLLoader.load(getClass().getResource("insert.fxml"));
            Scene scene = new Scene(myNewScene);
            stage.setScene(scene);
            stage.setTitle("Nhập dữ liệu");
            Screen screen = Screen.getPrimary();
            Rectangle2D bounds = screen.getVisualBounds();
            stage.setWidth(bounds.getWidth() / 1.3);
            stage.setHeight(bounds.getHeight());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
