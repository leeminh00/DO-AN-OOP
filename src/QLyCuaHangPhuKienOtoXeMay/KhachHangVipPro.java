package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

public class KhachHangVipPro extends KhachHang implements INhap, IXuat {
    private double tongChiTieu;
    private int soLanMuaHang;
    private double mucUuDai;
    private String capDoUuDai;

    public KhachHangVipPro() {
        super();
    }

//    public KhachHangVipPro(int maKhachHang, String hoTenKhachHang,
//                           String phaikh, long sdtKhachHang, String email,
//                           double tongChiTieu, int soLanMuaHang, double mucUuDai,
//                           String capDoUuDai) {
//        super(maKhachHang, hoTenKhachHang, phaikh, sdtKhachHang, email);
//        this.tongChiTieu = tongChiTieu;
//        this.soLanMuaHang = soLanMuaHang;
//        this.mucUuDai = mucUuDai;
//        this.capDoUuDai = capDoUuDai;
//        xacDinhCapDoUuDai();
//    }

    public KhachHangVipPro(int maKhachHang, long sdtKhachHang, String hoTenKhachHang, String phaikh,
                           String email, int soLanMuaHang, double tongChiTieu, double mucUuDai,
                           String capDoUuDai) {
        super(maKhachHang, hoTenKhachHang, phaikh, sdtKhachHang, email);
        this.tongChiTieu = tongChiTieu;
        this.soLanMuaHang = soLanMuaHang;
        this.mucUuDai = mucUuDai;
        this.capDoUuDai = capDoUuDai;
        xacDinhCapDoUuDai();
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

    public double getMucUuDai() {
        return mucUuDai;
    }

    public void setMucUuDai(double mucUuDai) {
        this.mucUuDai = mucUuDai;
    }

    public String getCapDoUuDai() {
        return capDoUuDai;
    }

    public void setCapDoUuDai(String capDoUuDai) {
        this.capDoUuDai = capDoUuDai;
    }

    // Phương thức xác định cấp độ ưu đãi
    private void xacDinhCapDoUuDai() {
        if (tongChiTieu >= 200000000) {
            this.capDoUuDai = "Vàng";
            this.mucUuDai = 0.2; // 20% ưu đãi
        } else if (tongChiTieu >= 100000000) {
            this.capDoUuDai = "Bạc";
            this.mucUuDai = 0.15; // 15% ưu đãi
        } else {
            this.capDoUuDai = "Đồng";
            this.mucUuDai = 0.1; // 10% ưu đãi
        }
    }

    // Phương thức tính giá trị được giảm
    public double tinhGiaTriUuDai(double tongTien) {
        return tongTien * mucUuDai;
    }

    @Override
    public void nhapThongTin() {
        Scanner khachhang = new Scanner(System.in);
        super.nhapThongTin();

        System.out.println("Tổng chi tiêu từ khách hàng: ");
        tongChiTieu = khachhang.nextDouble();
        System.out.println("Số lần mua hàng của khách hàng: ");
        soLanMuaHang = khachhang.nextInt();
        System.out.println("Mức ưu đãi của khách VIP Pro: ");
        mucUuDai = khachhang.nextDouble();
        khachhang.nextLine();
        System.out.println("Cấp độ ưu tiên của khách hàng: ");
        capDoUuDai = khachhang.nextLine();
        

    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Thông Tin Khách Hàng VIP Pro:");
        System.out.println("Mã Khách Hàng: " + getMaKhachHang());
        System.out.println("Họ Tên: " + getHoTenKhachHang());
        System.out.println("Tổng Chi Tiêu: " + tongChiTieu);
        System.out.println("Số Lần Mua Hàng: " + soLanMuaHang);
        System.out.println("Cấp Độ Ưu Đãi: " + capDoUuDai);
        System.out.println("Mức ưu đãi của khách VIP Pro: " + (mucUuDai * 100) + "%");
    }

}







