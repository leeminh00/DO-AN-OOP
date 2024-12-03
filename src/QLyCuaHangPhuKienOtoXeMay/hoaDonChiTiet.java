package QLyCuaHangPhuKienOtoXeMay;

public class hoaDonChiTiet {

    private SanPham sanPham;
    private Phukienoto phukienoto;
    private Phukienxemay phukienxemay;
    private int soluongmua;

    // Thêm các thuộc tính từ SanPham
    private int maSanPham;
    private String tenSanPham;
    private double giaBan;
    private double giaNhap;
    private String loaiXe; // Ô tô hoặc xe máy
    private int soLuongTon;
    private int soLuongNhap;
    private NhaCungCap nhaCungCap;

    public hoaDonChiTiet() {
        this.phukienoto = new Phukienoto();
        this.phukienxemay = new Phukienxemay();


    }

    public hoaDonChiTiet(SanPham sanPham, int soluongmua, int maSanPham, String tenSanPham,
                         double giaBan, double giaNhap, String loaiXe, int soLuongTon,
                         int soLuongNhap ) {
        super();
        this.sanPham = sanPham;
        this.soluongmua = soluongmua;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.loaiXe = loaiXe;
        this.soLuongTon = soLuongTon;
        this.soLuongNhap = soLuongNhap;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    @Override
    public String toString() {
        return sanPham.getMaSanPham() + sanPham.getTenSanPham() +
                "\n Số lượng mua: " + soluongmua ;
    }

    public double tinhTongTien() {
        if (this.sanPham != null) {
            return this.sanPham.getGiaBan() * this.soluongmua;
        } else {

            return 1.1;
        }
    }

}