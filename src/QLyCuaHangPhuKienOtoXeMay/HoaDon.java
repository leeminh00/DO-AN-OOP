package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

public abstract class HoaDon implements INhap,IXuat{
    private int maHoaDon;
    private String ngayLapHoaDon;
    private KhachHang khachHang;
    private SanPham sanPham;
    private NhanVien nhanVien;
    private double tongTien;
    private hoaDonChiTiet HoaDonChiTiet;
    
    // Thêm các thuộc tính từ KhachHang
    private int maKhachHang;
    private String hoTenKhachHang;
    private String phaikh;
    private long sdtKhachHang;
    private String email;
    
    // Thêm các thuộc tính từ SanPham
    private int maSanPham;
    private String tenSanPham;
    private double giaBan;
    private double giaNhap;
    private String loaiXe; // Ô tô hoặc xe máy
    private int soLuongTon;
    private int soLuongNhap;
    private static int soLuongSanPham = 0;

    // Thêm các thuộc tính từ NhanVien
    private int maNhanVien;
    private String hoTen;
    private String phai;
    private long sdt;
    private String chucVu;
    private double luong;


    // Thêm các thuộc tính từ HoaDonChiTiet
    private int soluongmua;

    public HoaDon() {
        this.khachHang = new KhachHangBinhThuong();
        this.khachHang = new KhachHangVipPro();
        this.sanPham = new Phukienoto();
        this.sanPham = new Phukienxemay();
        this.nhanVien = new NhanVienBanHang();
        this.nhanVien = new NhanVienQLy();
        this.HoaDonChiTiet = new hoaDonChiTiet();
    }

    public HoaDon(int maHoaDon, String ngayLapHoaDon, KhachHang khachHang,
                  SanPham sanPham, NhanVien nhanVien, double tongTien
                  , hoaDonChiTiet hoaDonChiTiet) {
        this.maHoaDon = maHoaDon;
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.khachHang = khachHang;
        this.sanPham = sanPham;
        this.nhanVien = nhanVien;
        this.tongTien = tongTien;
        this.HoaDonChiTiet = hoaDonChiTiet;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(String ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public hoaDonChiTiet getHoaDonChiTiet() {
        return HoaDonChiTiet;
    }

    public void setHoaDonChiTiet(hoaDonChiTiet hoaDonChiTiet) {
        HoaDonChiTiet = hoaDonChiTiet;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTenKhachHang() {
        return hoTenKhachHang;
    }

    public void setHoTenKhachHang(String hoTenKhachHang) {
        this.hoTenKhachHang = hoTenKhachHang;
    }

    public String getPhaikh() {
        return phaikh;
    }

    public void setPhaikh(String phaikh) {
        this.phaikh = phaikh;
    }

    public long getSdtKhachHang() {
        return sdtKhachHang;
    }

    public void setSdtKhachHang(long sdtKhachHang) {
        this.sdtKhachHang = sdtKhachHang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public static int getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public static void setSoLuongSanPham(int soLuongSanPham) {
        HoaDon.soLuongSanPham = soLuongSanPham;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }

    @Override
    public void nhapThongTin() {
        Scanner hoadon = new Scanner(System.in);
        System.out.println("Nhập mã hóa đơn: ");
        maHoaDon = hoadon.nextInt();
        hoadon.nextLine();
        System.out.println("Nhập ngày lập hóa đơn: ");
        ngayLapHoaDon = hoadon.nextLine();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("Mã hóa đơn: " + maHoaDon);
        System.out.println("Ngày lập hóa đơn: " + ngayLapHoaDon);
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon=" + maHoaDon +
                ", ngayLapHoaDon='" + ngayLapHoaDon + '\'' +
                '}';
    }

    public void suaThongTin() {
        // Sửa thông tin mã hóa đơn, ngày thanh toán và thông tin khách hàng
        Scanner hoadon = new Scanner(System.in);
        System.out.println("Nhập mã số hóa đơn mới: ");
        this.setMaHoaDon(hoadon.nextInt());
        hoadon.nextLine();
        System.out.println("Nhập ngày lập hóa đơn mới: ");
        this.setNgayLapHoaDon(hoadon.nextLine());

        // Sửa thông tin khách hàng
        khachHang.suaThongTin();
    }

//    public void nhapKhachHang() {
//        // Tạo đối tượng KhachHang và gọi phương thức nhap() của nó
//        KhachHang nhapkh1 = new KhachHangBinhThuong();
//        KhachHang nhapkh2 = new KhachHangVipPro();
//        nhapkh1.nhapThongTin();
//        nhapkh2.nhapThongTin();
//
//        // Gán thông tin nhà cung cấp cho sản phẩm
//        setKhachHang(nhapkh1);
//        setKhachHang(nhapkh2);
//    }


}
