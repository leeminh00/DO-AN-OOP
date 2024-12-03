package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

public class Phukienoto extends SanPham implements INhap, IXuat {
    private String mauSac;
    private String chatLieu;
    private String hangSanXuat;
    private String loaiPhuKien;
    private double khoiLuong;
    private int ngaysx;
    private int hanSuDung;
    private double tinhThueVAT;

    public Phukienoto() {
        super();
    }

//    public Phukienoto(int maSanPham, String tenSanPham, double giaBan, double giaNhap,
//                      String loaiXe, NhaCungCap nhaCungCap, int soLuongTon, int soLuongNhap,
//                      String mauSac, String chatLieu, String hangSanXuat, String loaiPhuKien,
//                      double khoiLuong, int ngaysx, int hanSuDung, double tinhThueVAT) {
//        super(maSanPham, tenSanPham, giaBan, giaNhap, loaiXe, nhaCungCap, soLuongTon, soLuongNhap);
//        this.mauSac = mauSac;
//        this.chatLieu = chatLieu;
//        this.hangSanXuat = hangSanXuat;
//        this.loaiPhuKien = loaiPhuKien;
//        this.khoiLuong = khoiLuong;
//        this.ngaysx = ngaysx;
//        this.hanSuDung = hanSuDung;
//        this.tinhThueVAT = tinhThueVAT;
//    }

//    public Phukienoto(int maSanPham, int soLuongTon, int soLuongNhap, double giaBan, double giaNhap,
//                      String tenSanPham, String loaiXe, NhaCungCap nhaCungCap, int ngaysx, int hanSuDung,
//                      Object o, double khoiLuong, double tinhThueVAT, String mauSac, String chatLieu,
//                      String hangSanXuat, String loaiPhuKien) {
//        super(maSanPham, tenSanPham, giaBan, giaNhap, loaiXe, nhaCungCap, soLuongTon, soLuongNhap);
//        this.mauSac = mauSac;
//        this.chatLieu = chatLieu;
//        this.hangSanXuat = hangSanXuat;
//        this.loaiPhuKien = loaiPhuKien;
//        this.khoiLuong = khoiLuong;
//        this.ngaysx = ngaysx;
//        this.hanSuDung = hanSuDung;
//        this.tinhThueVAT = tinhThueVAT;
//    }

    public Phukienoto(int maSanPham, int soLuongTon, int soLuongNhap, double giaBan, double giaNhap,
                      String tenSanPham, String loaiXe, NhaCungCap nhaCungCap, int ngaysx, int hanSuDung,
                      double khoiLuong, double tinhThueVAT, String mauSac, String chatLieu, String hangSanXuat,
                      String loaiPhuKien) {
        super(maSanPham, tenSanPham, giaBan, giaNhap, loaiXe, nhaCungCap, soLuongTon, soLuongNhap);
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.hangSanXuat = hangSanXuat;
        this.loaiPhuKien = loaiPhuKien;
        this.khoiLuong = khoiLuong;
        this.ngaysx = ngaysx;
        this.hanSuDung = hanSuDung;
        this.tinhThueVAT = tinhThueVAT;

    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuKien() {
        return loaiPhuKien;
    }

    public void setLoaiPhuKien(String loaiPhuKien) {
        this.loaiPhuKien = loaiPhuKien;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public int getNgaysx() {
        return ngaysx;
    }

    public void setNgaysx(int ngaysx) {
        this.ngaysx = ngaysx;
    }

    public int getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public double gettinhThueVAT() {
        return tinhThueVAT;
    }

    @Override
    public void nhapThongTin() {
        Scanner phukien = new Scanner(System.in);
        super.nhapThongTin();

        System.out.println("Nhập màu của phụ kiện: ");
        mauSac = phukien.nextLine();
        System.out.println("Nhập chất liệu của phụ kiện: ");
        chatLieu = phukien.nextLine();
        System.out.println("Nhập hãng sản xuất của phụ kiện: ");
        hangSanXuat = phukien.nextLine();
        System.out.println("Nhập loại phụ kiện: ");
        loaiPhuKien = phukien.nextLine();
        System.out.println("Nhập khối lượng của phụ kiện: ");
        khoiLuong = phukien.nextDouble();
        System.out.println("Nhập ngày sản xuất của phụ kiện: ");
        ngaysx = phukien.nextInt();
        System.out.println("Nhập hạn sử dụng của phụ kiện: ");
        hanSuDung = phukien.nextInt();
        System.out.println("Tính thêm thuế nhé kháchiu: ");
        tinhThueVAT = phukien.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();

        System.out.println("Màu phụ kiện: " + mauSac);
        System.out.println("Chất liệu phụ kiện: " + chatLieu);
        System.out.println("hãng sản xuất phụ kiện: " + hangSanXuat);
        System.out.println("loại phụ kiện: " + loaiPhuKien);
        System.out.println("khối lượng phụ kiện: " + khoiLuong);
        System.out.println("Ngày sản xuất: " + ngaysx);
        System.out.println("Hạn sử dụng: " + hanSuDung);
        System.out.println("Thuế: " + tinhThueVAT);

        double tongTien = getGiaBan() + tinhThueVAT();
        double Tra = tongTien + getGiaNhap();
        System.out.println("Tổng số tiền sau thuế: " + Tra);
    }

    public double tinhThueVAT() {
        return 0.1 * getGiaBan();
    }
}

