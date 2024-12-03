package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

public class NhanVienQLy extends NhanVien implements INhap, IXuat {
        private double luongCung;
        private double hoaHong;
        private double soLuongHopDongDaKy;


        public NhanVienQLy() {
            super();
        }

//        public NhanVienQLy(int maNhanVien, String hoTen, String phai,
//                               long sdt, String chucVu, double luong, double luongCung,
//                               double hoaHong, double soLuongHopDongDaKy) {
//            super(maNhanVien, hoTen, phai, sdt, chucVu, luong);
//            this.luongCung = luongCung;
//            this.hoaHong = hoaHong;
//            this.soLuongHopDongDaKy = soLuongHopDongDaKy;
//
//        }

    public NhanVienQLy(int maNhanVien, long sdt, double luong, double luongCung,
                       double hoaHong, double soLuongHopDongDaKy, String hoTen,
                       String phai, String chucVu) {
        super(maNhanVien, hoTen, phai, sdt, chucVu, luong);
        this.luongCung = luongCung;
        this.hoaHong = hoaHong;
        this.soLuongHopDongDaKy = soLuongHopDongDaKy;
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

        public double getsoLuongHopDongDaKy() {
            return soLuongHopDongDaKy;
        }

        public void setDoanhSoBanHang(double soLuongHopDongDaKy) {
            this.soLuongHopDongDaKy = soLuongHopDongDaKy;
        }

        // Phương thức tính lương
        public double tinhLuongNVQL() {
            return luongCung + (soLuongHopDongDaKy * hoaHong);
        }

        @Override
        public void nhapThongTin() {
            Scanner nhanvienql = new Scanner(System.in);
            super.nhapThongTin();

            System.out.println("Lương cứng của nhân viên: ");
            luongCung = nhanvienql.nextDouble();
            System.out.println("Hoa hồng của nhân viên: ");
            hoaHong = nhanvienql.nextDouble();
            System.out.println("Doanh số bán hàng nhân viên đạt được: ");
            soLuongHopDongDaKy = nhanvienql.nextDouble();
        }

        @Override
        public void xuatThongTin() {
            super.xuatThongTin();

            System.out.println("Lương cứng: " + luongCung);
            System.out.println("Hoa hồng: " + hoaHong);
            System.out.println("Doanh số bán hàng: " + soLuongHopDongDaKy);
            System.out.println("Tính lương nhân viên: " + tinhLuongNVQL());
        }

}


