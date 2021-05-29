package main1.utils;

import com.gembox.spreadsheet.ExcelFile;
import com.gembox.spreadsheet.ExcelWorksheet;
import com.gembox.spreadsheet.SpreadsheetInfo;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;
import main1.entity.db.User;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author nguyenlm Contains helper functions
 */
public class ExelUtil {

	public static void export(List<User> userList, TableView table) throws IOException {
		SpreadsheetInfo.setLicense("FREE-LIMITED-KEY");
		ExcelFile file = new ExcelFile();
		ExcelWorksheet worksheet = file.addWorksheet("sheet");
		worksheet.getCell(0, 0).setValue("Mã Đơn vị");
		worksheet.getCell(0, 1).setValue("Mã ngày");
		worksheet.getCell(0, 2).setValue("Mã bàn");
		worksheet.getCell(0, 3).setValue("Hình thức lấy mẫu*");
		worksheet.getCell(0, 4).setValue("Mã TT");
		worksheet.getCell(0, 5).setValue("     Họ và Tên   ");
		worksheet.getCell(0, 6).setValue("Năm sinh");
		worksheet.getCell(0, 7).setValue("Giới tính");
		worksheet.getCell(0, 8).setValue("Số điện thoại");
		worksheet.getCell(0, 9).setValue("Huyện (nơi ở hiện tại)");
		worksheet.getCell(0, 10).setValue("Xã (nơi ở hiện tại)");
		worksheet.getCell(0, 11).setValue("Thôn (nơi ở hiện tại)");
		worksheet.getCell(0, 12).setValue("Nghề nghiệp");
		worksheet.getCell(0, 13).setValue("Nơi làm việc, học tập");
		worksheet.getCell(0, 14).setValue("Đối tượng lấy mẫu");
		worksheet.getCell(0, 15).setValue("Lần lấy mẫu");
		worksheet.getCell(0, 16).setValue("Ghi chú (nếu có trường hợp đặc biệt)");
		worksheet.getCell(0, 17).setValue("Phân loại nơi lấy mẫu");
		worksheet.getCell(0, 18).setValue("Địa điểm nơi lấy mẫu");
		worksheet.getCell(0, 19).setValue("Huyện (nơi lấy mẫu)");
		worksheet.getCell(0, 20).setValue("Xã (nơi lấy mẫu)");
		worksheet.getCell(0, 21).setValue("Thôn (nơi lấy mẫu)");
		worksheet.getCell(0, 22).setValue("Loại mẫu");
		worksheet.getCell(0, 23).setValue("Đơn vị lấy mẫu");
		worksheet.getCell(0, 24).setValue("Mã mẫu bệnh phẩm*");
		worksheet.getCell(0, 25).setValue("Mã người được lấy mẫu*");
		worksheet.getCell(0, 26).setValue("Ngày lấu mẫu*");
		worksheet.getCell(0, 27).setValue("Loại gộp");
		worksheet.getCell(0, 28).setValue("Ngày xét nghiệm");
		worksheet.getCell(0, 29).setValue("Phương pháp xét nghiệm");
		worksheet.getCell(0, 30).setValue("Ngày trả KQXN");
		worksheet.getCell(0, 31).setValue("Đơn vị gửi mẫu");
		worksheet.getCell(0, 32).setValue("Tình trạng mẫu");
		worksheet.getCell(0, 33).setValue("Kết quả xét nghiệm");
		worksheet.getCell(0, 34).setValue("CT Value");
		for (int row = 0; row < userList.size(); row++) {
			User user = userList.get(row);
			worksheet.getCell(row+1, 0).setValue(user.getMaDonVi());
			worksheet.getCell(row+1, 1).setValue(user.getMaNgay());
			worksheet.getCell(row+1, 2).setValue(user.getMaBan());
			worksheet.getCell(row+1, 3).setValue(user.getMaMauBenhPham());
			worksheet.getCell(row+1, 4).setValue(user.getHinhThucLayMau());
			worksheet.getCell(row+1, 5).setValue(user.getStt());
			worksheet.getCell(row+1, 6).setValue(user.getHoTen());
			worksheet.getCell(row+1, 7).setValue(user.getNamSinh());
			worksheet.getCell(row+1, 8).setValue(user.getGioiTinh());
			worksheet.getCell(row+1, 9).setValue(user.getSdt());
			worksheet.getCell(row+1, 10).setValue(user.getHuyen());
			worksheet.getCell(row+1, 11).setValue(user.getXa());
			worksheet.getCell(row+1, 12).setValue(user.getThon());
			worksheet.getCell(row+1, 13).setValue(user.getNgheNghiep());
			worksheet.getCell(row+1, 14).setValue(user.getNoiLamViec());
			worksheet.getCell(row+1, 15).setValue(user.getDoiTuongLayMau());
			worksheet.getCell(row+1, 16).setValue(user.getLanLaymau());
			worksheet.getCell(row+1, 17).setValue(user.getGhiChu());
			worksheet.getCell(row+1, 18).setValue(user.getPhanLoaiNoiLayMau());
			worksheet.getCell(row+1, 19).setValue(user.getDiaDiemNoiLaymau());
			worksheet.getCell(row+1, 20).setValue(user.getHuyenLayMau());
			worksheet.getCell(row+1, 21).setValue(user.getXaLayMau());
			worksheet.getCell(row+1, 22).setValue(user.getThonLayMau());
			worksheet.getCell(row+1, 23).setValue(user.getLoaiMau());
			worksheet.getCell(row+1, 24).setValue(user.getDonViLayMau());
			worksheet.getCell(row+1, 25).setValue(user.getMaNguoiDuocLayMau());
			worksheet.getCell(row+1, 26).setValue(user.getNgayLayMau());
			worksheet.getCell(row+1, 27).setValue(user.getLoaiGop());
			worksheet.getCell(row+1, 28).setValue(user.getNgayXetNghiem());
			worksheet.getCell(row+1, 29).setValue(user.getPhuongPhapXetNghiem());
			worksheet.getCell(row+1, 30).setValue(user.getNgayTraKetQua());
			worksheet.getCell(row+1, 31).setValue(user.getDonViGuiMau());
			worksheet.getCell(row+1, 32).setValue(user.getTinhTrangMau());
			worksheet.getCell(row+1, 33).setValue(user.getKetQuaXetNghiem());
			worksheet.getCell(row+1, 34).setValue(user.getCtValue());
		}

		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("XLSX files (*.xlsx)", "*.xlsx"),
				new FileChooser.ExtensionFilter("XLS files (*.xls)", "*.xls"),
				new FileChooser.ExtensionFilter("ODS files (*.ods)", "*.ods"),
				new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv"),
				new FileChooser.ExtensionFilter("HTML files (*.html)", "*.html")
		);
		File saveFile = fileChooser.showSaveDialog(table.getScene().getWindow());

		file.save(saveFile.getAbsolutePath());
	}
}