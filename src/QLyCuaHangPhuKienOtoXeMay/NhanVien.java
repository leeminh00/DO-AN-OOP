package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

// Lớp đối tượng Nhân Viên
public abstract class NhanVien implements INhap, IXuat {
    private int maNhanVien;
    private String hoTen;
    private String phai;
    private long sdt;
    private String chucVu;
    private double luong;

    // Hàm thiết lập
    // khong tham số
    public NhanVien() {
    }
    // có tham số
    public NhanVien(int maNhanVien, String hoTen, String phai,
                    long sdt, String chucVu, double luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.phai = phai;
        this.sdt = sdt;
        this.chucVu = chucVu;
        this.luong = luong;

    }

    // phương thức get set
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

    @Override
    public void nhapThongTin() {
        Scanner nhanvien = new Scanner(System.in);
        System.out.println("Nhập mã số nhân viên: ");
        maNhanVien = nhanvien.nextInt();
        nhanvien.nextLine();
        System.out.println("Nhập họ tên nhân viên: ");
        hoTen = nhanvien.nextLine();
        System.out.println("Nhập giới tính nhân viên: ");
        phai = nhanvien.nextLine();
        System.out.println("Nhập số điện thoại nhân viên: ");
        sdt = nhanvien.nextLong();
        nhanvien.nextLine();
        System.out.println("Nhập chức vụ: ");
        chucVu = nhanvien.nextLine();
        System.out.println("Nhập lương của nhân viên: ");
        luong = nhanvien.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("Mã số nhân viên: " + maNhanVien);
        System.out.println("Họ và tên nhân viên: " + hoTen);
        System.out.println("Giới tính nhân viên: " + phai);
        System.out.println("Số điện thoại nhân viên: " + sdt);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Lương nhân viên: " + luong);
    }

    public void suaThongTin() {
        Scanner nhanvien = new Scanner(System.in);
        System.out.println("Nhập mã số nhân viên mới: ");
        this.setMaNhanVien(nhanvien.nextInt());
        nhanvien.nextLine();
        System.out.println("Nhập tên nhân viên mới: ");
        this.setHoTen(nhanvien.nextLine());
        System.out.println("Nhập giới tính nhân viên mới: ");
        this.setPhai(nhanvien.nextLine());
        System.out.println("Nhập số điện thoại mới cho nv: ");
        this.setSdt(nhanvien.nextLong());
        nhanvien.nextLine();
        System.out.println("Nhập chức vụ mới cho nv: ");
        this.setChucVu(nhanvien.nextLine());
        System.out.println("Nhập lương mới cho nv: ");
        this.setLuong(nhanvien.nextDouble());
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien=" + maNhanVien +
                ", hoTen='" + hoTen + '\'' +
                ", phai='" + phai + '\'' +
                ", sdt=" + sdt +
                ", chucVu='" + chucVu + '\'' +
                ", luong=" + luong +
                '}';
    }
}
