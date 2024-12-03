package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;


// Lớp đối tượng Nhà Cung Cấp
public abstract class NhaCungCap implements INhap, IXuat {
    private int maNhaCungCap;
    private String tenNhaCungCap;
    private String diaChi;
    private long soDienThoai;


    // Hàm thiết lập
    // kh tham số
    public NhaCungCap() {

    }

    // có tham số
    public NhaCungCap(int maNhaCungCap, String tenNhaCungCap, String diaChi, long soDienThoai) {
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public int getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(int maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public long getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(long soDienThoai) {
        this.soDienThoai = soDienThoai;
    }



    @Override
    public void nhapThongTin() {
        Scanner nhacungcap = new Scanner(System.in);
        System.out.println("Nhập mã nhà cung cấp: ");
        maNhaCungCap = nhacungcap.nextInt();
        nhacungcap.nextLine();
        System.out.println("Nhập tên nhà cung cấp: ");
        tenNhaCungCap= nhacungcap.nextLine();
        System.out.println("Nhập địa chỉ nhà cung cấp: ");
        diaChi = nhacungcap.nextLine();
        System.out.println("Nhập số điện thoại nhà cung cấp: ");
        soDienThoai = nhacungcap.nextLong();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("Mã số nhà cung cấp: " + maNhaCungCap);
        System.out.println("Tên nhà cung cấp: " + tenNhaCungCap);
        System.out.println("Địa chỉ nhà cung cấp: " +diaChi);
        System.out.println("Số điện thoại nhà cung cấp: " + soDienThoai);
    }

    public void suaThongTin() {
        Scanner nhacungcap = new Scanner(System.in);
        System.out.println("Nhập mã nhà cung cấp mới: ");
        this.setMaNhaCungCap(nhacungcap.nextInt());
        nhacungcap.nextLine();
        System.out.println("Nhập tên nhà cung cấp mới: ");
        this.setTenNhaCungCap(nhacungcap.nextLine());
        System.out.println("Nhập địa chỉ ncc mới: ");
        this.setDiaChi(nhacungcap.nextLine());
        System.out.println("Nhập số điện thoại ncc mới: ");
        this.setSoDienThoai(nhacungcap.nextLong());
    }
}
