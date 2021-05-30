package main1.entity.db;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.List;

public class User {
    private Integer stt;
    private String maDonVi = "";
    private String maNgay = "";
    private String maBan = "";
    private String maMauBenhPham = "";
    private String hinhThucLayMau = "";
    private String hoTen = "";
    private String namSinh = "";
    private String gioiTinh = "";
    private String sdt = "";
    private String huyen = "";
    private String xa = "";
    private String thon = "";
    private String ngheNghiep = "";
    private String noiLamViec = "";
    private String doiTuongLayMau = "";
    private String lanLaymau;
    private String ghiChu = "";
    private String phanLoaiNoiLayMau = "";
    private String diaDiemNoiLaymau = "";
    private String huyenLayMau = "";
    private String xaLayMau = "";
    private String thonLayMau = "";
    private String loaiMau = "";
    private String donViLayMau = "";
    private String maNguoiDuocLayMau = "";
    private String ngayLayMau = "";
    private String loaiGop;
    private String ngayXetNghiem = "";
    private String phuongPhapXetNghiem = "";
    private String ngayTraKetQua = "";
    private String donViGuiMau = "";
    private String tinhTrangMau = "";
    private String ketQuaXetNghiem = "";
    private String ctValue = "";

    public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    public String getMaNgay() {
        return maNgay;
    }

    public void setMaNgay(String maNgay) {
        this.maNgay = maNgay;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getMaMauBenhPham() {
        return maMauBenhPham;
    }

    public void setMaMauBenhPham(String maMauBenhPham) {
        this.maMauBenhPham = maMauBenhPham;
    }

    public String getHinhThucLayMau() {
        return hinhThucLayMau;
    }

    public void setHinhThucLayMau(String hinhThucLayMau) {
        this.hinhThucLayMau = hinhThucLayMau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getThon() {
        return thon;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public void setNoiLamViec(String noiLamViec) {
        this.noiLamViec = noiLamViec;
    }

    public String getDoiTuongLayMau() {
        return doiTuongLayMau;
    }

    public void setDoiTuongLayMau(String doiTuongLayMau) {
        this.doiTuongLayMau = doiTuongLayMau;
    }

    public String getLanLaymau() {
        return lanLaymau;
    }

    public void setLanLaymau(String lanLaymau) {
        this.lanLaymau = lanLaymau;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getPhanLoaiNoiLayMau() {
        return phanLoaiNoiLayMau;
    }

    public void setPhanLoaiNoiLayMau(String phanLoaiNoiLayMau) {
        this.phanLoaiNoiLayMau = phanLoaiNoiLayMau;
    }

    public String getDiaDiemNoiLaymau() {
        return diaDiemNoiLaymau;
    }

    public void setDiaDiemNoiLaymau(String diaDiemNoiLaymau) {
        this.diaDiemNoiLaymau = diaDiemNoiLaymau;
    }

    public String getHuyenLayMau() {
        return huyenLayMau;
    }

    public void setHuyenLayMau(String huyenLayMau) {
        this.huyenLayMau = huyenLayMau;
    }

    public String getXaLayMau() {
        return xaLayMau;
    }

    public void setXaLayMau(String xaLayMau) {
        this.xaLayMau = xaLayMau;
    }

    public String getThonLayMau() {
        return thonLayMau;
    }

    public void setThonLayMau(String thonLayMau) {
        this.thonLayMau = thonLayMau;
    }

    public String getLoaiMau() {
        return loaiMau;
    }

    public void setLoaiMau(String loaiMau) {
        this.loaiMau = loaiMau;
    }

    public String getDonViLayMau() {
        return donViLayMau;
    }

    public void setDonViLayMau(String donViLayMau) {
        this.donViLayMau = donViLayMau;
    }

    public String getMaNguoiDuocLayMau() {
        return maNguoiDuocLayMau;
    }

    public void setMaNguoiDuocLayMau(String maNguoiDuocLayMau) {
        this.maNguoiDuocLayMau = maNguoiDuocLayMau;
    }

    public String getNgayLayMau() {
        return ngayLayMau;
    }

    public void setNgayLayMau(String ngayLayMau) {
        this.ngayLayMau = ngayLayMau;
    }

    public String getLoaiGop() {
        return loaiGop;
    }

    public void setLoaiGop(String loaiGop) {
        this.loaiGop = loaiGop;
    }

    public String getNgayXetNghiem() {
        return ngayXetNghiem;
    }

    public void setNgayXetNghiem(String ngayXetNghiem) {
        this.ngayXetNghiem = ngayXetNghiem;
    }

    public String getPhuongPhapXetNghiem() {
        return phuongPhapXetNghiem;
    }

    public void setPhuongPhapXetNghiem(String phuongPhapXetNghiem) {
        this.phuongPhapXetNghiem = phuongPhapXetNghiem;
    }

    public String getNgayTraKetQua() {
        return ngayTraKetQua;
    }

    public void setNgayTraKetQua(String ngayTraKetQua) {
        this.ngayTraKetQua = ngayTraKetQua;
    }

    public String getDonViGuiMau() {
        return donViGuiMau;
    }

    public void setDonViGuiMau(String donViGuiMau) {
        this.donViGuiMau = donViGuiMau;
    }

    public String getTinhTrangMau() {
        return tinhTrangMau;
    }

    public void setTinhTrangMau(String tinhTrangMau) {
        this.tinhTrangMau = tinhTrangMau;
    }

    public String getKetQuaXetNghiem() {
        return ketQuaXetNghiem;
    }

    public void setKetQuaXetNghiem(String ketQuaXetNghiem) {
        this.ketQuaXetNghiem = ketQuaXetNghiem;
    }

    public String getCtValue() {
        return ctValue;
    }

    public void setCtValue(String ctValue) {
        this.ctValue = ctValue;
    }

    public JSONObject toJson() throws ParseException {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        JSONParser parser = new JSONParser();
        return  (JSONObject) parser.parse(json);
    }

    public User jsonToObject(String json){
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        return  user;
    }

    public static List<User> toJsonArray(String json){
        Gson gson = new Gson();
        List<User> userList = gson.fromJson(json, new TypeToken<List<User>>(){}.getType());
        return userList;
    }

    @Override
    public String toString() {
        return stt +
                maDonVi +
                maNgay +
                maBan +
                maMauBenhPham +
                hinhThucLayMau +
                hoTen +
                namSinh +
                gioiTinh +
                sdt +
                huyen +
                xa +
                thon +
                ngheNghiep +
                noiLamViec +
                doiTuongLayMau +
                lanLaymau +
                ghiChu +
                phanLoaiNoiLayMau +
                diaDiemNoiLaymau +
                huyenLayMau +
                xaLayMau +
                thonLayMau +
                loaiMau +
                donViLayMau +
                maNguoiDuocLayMau +
                ngayLayMau +
                loaiGop +
                ngayXetNghiem +
                phuongPhapXetNghiem +
                ngayTraKetQua +
                donViGuiMau +
                tinhTrangMau +
                ketQuaXetNghiem +
                ctValue;
    }
}
