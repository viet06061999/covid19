package main1.utils;

import com.gembox.spreadsheet.ExcelFile;
import com.gembox.spreadsheet.ExcelWorksheet;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

/**
 * @author nguyenlm Contains helper functions
 */
public class ExelUtil {

	public void export(TableView table) throws IOException {
		ExcelFile file = new ExcelFile();
		ExcelWorksheet worksheet = file.addWorksheet("sheet");
		for (int row = 0; row < table.getItems().size(); row++) {
			ObservableList cells = (ObservableList) table.getItems().get(row);
			for (int column = 0; column < cells.size(); column++) {
				if (cells.get(column) != null)
					worksheet.getCell(row, column).setValue(cells.get(column).toString());
			}
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