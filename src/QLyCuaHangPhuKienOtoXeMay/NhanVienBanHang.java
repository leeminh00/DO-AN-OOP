package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

public class NhanVienBanHang extends NhanVien implements INhap, IXuat {
    private double luongCung;
    private double hoaHong;
    private double doanhSoBanHang;


    public NhanVienBanHang() {
        super();
    }

//    public NhanVienBanHang(int maNhanVien, String hoTen, String phai,
//                           long sdt, String chucVu, double luong, double luongCung,
//                           double hoaHong, double doanhSoBanHang) {
//        super( maNhanVien, hoTen, phai, sdt, chucVu, luong);
//        this.luongCung = luongCung;
//        this.hoaHong = hoaHong;
//        this.doanhSoBanHang = doanhSoBanHang;
//
//    }

    public NhanVienBanHang(int maNhanVien, long sdt, double luong, double luongCung,
                           double hoaHong, double doanhSoBanHang, String hoTen,
                           String phai, String chucVu) {
        super( maNhanVien, hoTen, phai, sdt, chucVu, luong);
        this.luongCung = luongCung;
        this.hoaHong = hoaHong;
        this.doanhSoBanHang = doanhSoBanHang;
    }


    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public double getDoanhSoBanHang() {
        return doanhSoBanHang;
    }

    public void setDoanhSoBanHang(double doanhSoBanHang) {
        this.doanhSoBanHang = doanhSoBanHang;
    }

    // Phương thức tính lương
    public double tinhLuongNV() {
        return luongCung + (doanhSoBanHang * hoaHong);
    }

    @Override
    public void nhapThongTin() {
        Scanner nhanvien = new Scanner(System.in);
        super.nhapThongTin();

        System.out.println("Lương cứng của nhân viên: ");
        luongCung = nhanvien.nextDouble();
        System.out.println("Hoa hồng của nhân viên: ");
        hoaHong = nhanvien.nextDouble();
        System.out.println("Doanh số bán hàng nhân viên đạt được: ");
        doanhSoBanHang = nhanvien.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();

        System.out.println("Lương cứng: " + luongCung);
        System.out.println("Hoa hồng: " + hoaHong);
        System.out.println("Doanh số bán hàng: " + doanhSoBanHang);
        System.out.println("Tính lương nhân viên: " + tinhLuongNV());
    }

}

