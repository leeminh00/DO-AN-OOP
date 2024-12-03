package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

// Lớp đối tượng Khách Hàng
public abstract class KhachHang implements INhap, IXuat {
    private int maKhachHang;
    private String hoTenKhachHang;
    private String phaikh;
    private long sdtKhachHang;
    private String email;

    // Hàm thiết lập
    //không tham số
    public KhachHang() {

    }
    //có tham số
    public KhachHang(int maKhachHang, String hoTenKhachHang,
                     String phaikh, long sdtKhachHang, String email) {
        this.maKhachHang = maKhachHang;
        this.hoTenKhachHang = hoTenKhachHang;
        this.phaikh = phaikh;
        this.sdtKhachHang = sdtKhachHang;
        this.email = email;
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

    @Override
    public void nhapThongTin() {
        Scanner khachhang = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng: ");
        maKhachHang = khachhang.nextInt();
        khachhang.nextLine();
        System.out.println("Nhập Họ tên khách hàng: ");
        hoTenKhachHang = khachhang.nextLine();
        System.out.println("Nhập giới tính khách hàng: ");
        phaikh = khachhang.nextLine();
        System.out.println("Nhập số điện thoại khách hàng: ");
        sdtKhachHang = khachhang.nextLong();
        khachhang.nextLine();
        System.out.println("Nhập email khách hàng: ");
        email = khachhang.nextLine();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("Mã số khách hàng: " + maKhachHang);
        System.out.println("Họ và tên khách hàng: " + hoTenKhachHang);
        System.out.println("Giới tính khách hàng: " + phaikh);
        System.out.println("Số điện thoại khách hàng: " +sdtKhachHang);
        System.out.println("Email của khách hàng: " + email);
    }

    public void suaThongTin() {
        Scanner khachhang = new Scanner(System.in);
        System.out.println("Nhập mã số khách hàng mới: ");
        this.setMaKhachHang(khachhang.nextInt());
        khachhang.nextLine();
        System.out.println("Nhập tên khách hàng mới: ");
        this.setHoTenKhachHang(khachhang.nextLine());
        System.out.println("Nhập giới tính khách hàng mới: ");
        this.setPhaikh(khachhang.nextLine());
        System.out.println("Nhập số điện thoại khách hàng mới: ");
        this.setSdtKhachHang(khachhang.nextLong());
        khachhang.nextLine();
        System.out.println("Nhập email khách hàng mới: ");
        this.setEmail(khachhang.nextLine());
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang=" + maKhachHang +
                ", hoTenKhachHang='" + hoTenKhachHang + '\'' +
                ", phaikh='" + phaikh + '\'' +
                ", sdtKhachHang=" + sdtKhachHang +
                ", email='" + email + '\'' +
                '}';
    }


}

