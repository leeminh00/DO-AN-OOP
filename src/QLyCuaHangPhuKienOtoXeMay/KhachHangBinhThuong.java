package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

public class KhachHangBinhThuong extends KhachHang implements INhap, IXuat {
    private double tongChiTieu;
    private int soLanMuaHang;

    public KhachHangBinhThuong() {
        super();
    }

//    public KhachHangBinhThuong(int maKhachHang, String hoTenKhachHang,
//                               String phaikh, long sdtKhachHang, String email,
//                               double tongChiTieu, int soLanMuaHang ) {
//        super(maKhachHang, hoTenKhachHang, phaikh, sdtKhachHang, email);
//        this.tongChiTieu = tongChiTieu;
//        this.soLanMuaHang = soLanMuaHang;
//    }

    public KhachHangBinhThuong(int maKhachHang, long sdtKhachHang, String hoTenKhachHang, String phaikh,
                               String email, int soLanMuaHang, double tongChiTieu) {
        super(maKhachHang, hoTenKhachHang, phaikh, sdtKhachHang, email);
        this.tongChiTieu = tongChiTieu;
        this.soLanMuaHang = soLanMuaHang;
    }

    public double getTongChiTieu() {
        return tongChiTieu;
    }

    public void setTongChiTieu(double tongChiTieu) {
        this.tongChiTieu = tongChiTieu;
    }

    public int getSoLanMuaHang() {
        return soLanMuaHang;
    }

    public void setSoLanMuaHang(int soLanMuaHang) {
        this.soLanMuaHang = soLanMuaHang;
    }

    // Phương thức kiểm tra điều kiện nâng cấp
    public boolean kiemTraDieuKien() {
        return tongChiTieu > 50000000 || soLanMuaHang >= 10;
    }

    @Override
    public void nhapThongTin() {
        Scanner khachhang = new Scanner(System.in);
        super.nhapThongTin();

        System.out.println("Tổng chi tiêu từ khách hàng: ");
        tongChiTieu = khachhang.nextDouble();
        System.out.println("Số lần mua hàng của khách hàng: ");
        soLanMuaHang = khachhang.nextInt();

    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Thông Tin Khách Hàng Bình Thường:");
        System.out.println("Mã Khách Hàng: " + getMaKhachHang());
        System.out.println("Họ Tên: " + getHoTenKhachHang());
        System.out.println("Tổng Chi Tiêu: " + tongChiTieu);
        System.out.println("Số Lần Mua Hàng: " + soLanMuaHang);
        System.out.println("Điều kiện để khách hàng nâng cấp lên VIP Pro: " + kiemTraDieuKien());
    }

}



