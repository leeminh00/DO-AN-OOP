package QLyCuaHangPhuKienOtoXeMay;



import java.util.Scanner;

public class HoaDonNhap extends HoaDon implements INhap, IXuat {
    private String hinhThucThanhToan;
    private double chietKhau;
    private double giamGia;
    private double thueGiaTri;

    public HoaDonNhap() {
        super();
    }

    public HoaDonNhap(int maHoaDon, String ngayLapHoaDon, KhachHang khachHang,
                     SanPham sanPham, NhanVien nhanVien, double tongTien
            , hoaDonChiTiet hoaDonChiTiet, String hinhThucThanhToan,
                     double giamGia,  double thueGiaTri, double chietKhau) {
        super( maHoaDon, ngayLapHoaDon, khachHang, sanPham, nhanVien, tongTien, hoaDonChiTiet);

        this.hinhThucThanhToan = hinhThucThanhToan;
        this.chietKhau = chietKhau;
        this.giamGia = giamGia;
        this.thueGiaTri = thueGiaTri;

    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public double getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(double chietKhau) {
        this.chietKhau = chietKhau;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getThueGiaTri() {
        return thueGiaTri;
    }

    public void setThueGiaTri(double thueGiaTri) {
        this.thueGiaTri = thueGiaTri;
    }

    @Override
    public void nhapThongTin() {
        Scanner hoadon = new Scanner(System.in);
        super.nhapThongTin();

        System.out.println("Hình thức thanh toán của khách hàng: ");
        hinhThucThanhToan = hoadon.nextLine();
        System.out.println("Mức giảm giá cho khách hàng: ");
        giamGia = hoadon.nextDouble();
        System.out.println("Thuế trên tổng hóa đơn: ");
        thueGiaTri = hoadon.nextDouble();

    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Thông Tin Hóa Đơn Bán:");
        System.out.println("Mã Hóa Đơn: " + getMaHoaDon());
        System.out.println("Ngày Lập: " + getNgayLapHoaDon());
        System.out.println("Khách Hàng: " + getHoTenKhachHang());
        System.out.println("Hình Thức Thanh Toán: " + hinhThucThanhToan);
        System.out.println("Mức giảm giá cho khách hàng: " + giamGia);
        System.out.println("Thuế trên tổng hóa đơn: " + thueGiaTri);

    }
}


