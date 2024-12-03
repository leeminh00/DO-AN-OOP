package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

public class NhaCungCapNgoaiNuoc extends NhaCungCap implements INhap, IXuat {

    private String quocGia;
    private long maSoThue;
    private long taiKhoanNganHang;
    private String maSwift;
    private double tyGiaHoiDoai;
    private String loaiTienTe;

    private int maNhaCungCapNgoaiNuoc ;
    private String tenNhaCungCapNgoaiNuoc ;
    private String diaChiNCCNgoaiNuoc ;
    private long soDienThoaiNCCNgoaiNuoc ;



    public NhaCungCapNgoaiNuoc() {
        super();
    }

//    public NhaCungCapNgoaiNuoc(int maNhaCungCap, long soDienThoai, String tenNhaCungCap, String diaChi,
//                               long maSoThue, long taiKhoanNganHang, double tyGiaHoiDoai, String quocGia,
//                               String maSwift, String loaiTienTe, int maNhaCungCapNgoaiNuoc, String tenNhaCungCapNgoaiNuoc,
//                               String diaChiNCCNgoaiNuoc, long soDienThoaiNCCNgoaiNuoc) {
//        super(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai);
//        this.quocGia = quocGia;
//        this.maSoThue = maSoThue;
//        this.taiKhoanNganHang = taiKhoanNganHang;
//        this.maSwift = maSwift;
//        this.tyGiaHoiDoai = tyGiaHoiDoai;
//        this.loaiTienTe = loaiTienTe;
//
//        this.maNhaCungCapNgoaiNuoc = maNhaCungCapNgoaiNuoc;
//        this.tenNhaCungCapNgoaiNuoc = tenNhaCungCapNgoaiNuoc;
//        this.diaChiNCCNgoaiNuoc  = diaChiNCCNgoaiNuoc ;
//        this.soDienThoaiNCCNgoaiNuoc  = soDienThoaiNCCNgoaiNuoc ;
//    }

    public NhaCungCapNgoaiNuoc(int maNhaCungCap, long soDienThoai, String tenNhaCungCap, String diaChi,
                               long maSoThue, long taiKhoanNganHang, double tyGiaHoiDoai, String quocGia,
                               String maSwift, String loaiTienTe, int maNhaCungCapNgoaiNuoc,
                               long soDienThoaiNCCNgoaiNuoc, String tenNhaCungCapNgoaiNuoc, String diaChiNCCNgoaiNuoc) {
        super(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai);
        this.quocGia = quocGia;
        this.maSoThue = maSoThue;
        this.taiKhoanNganHang = taiKhoanNganHang;
        this.maSwift = maSwift;
        this.tyGiaHoiDoai = tyGiaHoiDoai;
        this.loaiTienTe = loaiTienTe;

        this.maNhaCungCapNgoaiNuoc = maNhaCungCapNgoaiNuoc;
        this.tenNhaCungCapNgoaiNuoc = tenNhaCungCapNgoaiNuoc;
        this.diaChiNCCNgoaiNuoc  = diaChiNCCNgoaiNuoc ;
        this.soDienThoaiNCCNgoaiNuoc  = soDienThoaiNCCNgoaiNuoc ;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public long getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(long maSoThue) {
        this.maSoThue = maSoThue;
    }

    public long getTaiKhoanNganHang() {
        return taiKhoanNganHang;
    }

    public void setTaiKhoanNganHang(long taiKhoanNganHang) {
        this.taiKhoanNganHang = taiKhoanNganHang;
    }

    public String getMaSwift() {
        return maSwift;
    }

    public void setMaSwift(String maSwift) {
        this.maSwift = maSwift;
    }

    public double getTyGiaHoiDoai() {
        return tyGiaHoiDoai;
    }

    public void setTyGiaHoiDoai(double tyGiaHoiDoai) {
        this.tyGiaHoiDoai = tyGiaHoiDoai;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    public int getMaNhaCungCapNgoaiNuoc() {
        return maNhaCungCapNgoaiNuoc;
    }

    public void setMaNhaCungCapNgoaiNuoc(int maNhaCungCapNgoaiNuoc) {
        this.maNhaCungCapNgoaiNuoc = maNhaCungCapNgoaiNuoc;
    }

    public String getTenNhaCungCapNgoaiNuoc() {
        return tenNhaCungCapNgoaiNuoc;
    }

    public void setTenNhaCungCapNgoaiNuoc(String tenNhaCungCapNgoaiNuoc) {
        this.tenNhaCungCapNgoaiNuoc = tenNhaCungCapNgoaiNuoc;
    }

    public String getDiaChiNCCNgoaiNuoc() {
        return diaChiNCCNgoaiNuoc;
    }

    public void setDiaChiNCCNgoaiNuoc(String diaChiNCCNgoaiNuoc) {
        this.diaChiNCCNgoaiNuoc = diaChiNCCNgoaiNuoc;
    }

    public long getSoDienThoaiNCCNgoaiNuoc() {
        return soDienThoaiNCCNgoaiNuoc;
    }

    public void setSoDienThoaiNCCNgoaiNuoc(long soDienThoaiNCCNgoaiNuoc) {
        this.soDienThoaiNCCNgoaiNuoc = soDienThoaiNCCNgoaiNuoc;
    }

    // Phương thức chuyển đổi tiền tệ
    public double chuyenDoiTienTe() {
        Double giaoDich = 0.0;
        return giaoDich * tyGiaHoiDoai;
    }

    @Override
    public void nhapThongTin() {
        Scanner nhacungcap = new Scanner(System.in);
        super.nhapThongTin();

        System.out.println("Nhà cung cấp ở quốc gia: ");
        quocGia = nhacungcap.nextLine();
        System.out.println("Mã số thuế của nhà cung cấp: ");
        maSoThue = nhacungcap.nextLong();
        System.out.println("Tài khoản ngân hàng của nhà cung cấp: ");
        taiKhoanNganHang = nhacungcap.nextLong();
        nhacungcap.nextLine();
        System.out.println("Mã Swift của nhà cung cấp: ");
        maSwift = nhacungcap.nextLine();
        System.out.println("Loại tiền tệ của nhà cung cấp dùng: ");
        loaiTienTe = nhacungcap.nextLine();
        System.out.println("Tỷ giá hối đoái: ");
        tyGiaHoiDoai = nhacungcap.nextDouble();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();

        System.out.println("Thông Tin Nhà Cung Cấp Ngoài Nước:");
        System.out.println("Mã Nhà Cung Cấp: " + getMaNhaCungCap());
        System.out.println("Tên Nhà Cung Cấp: " + getTenNhaCungCap());
        System.out.println("Quốc Gia: " + quocGia);
        System.out.println("Mã Số Thuế: " + maSoThue);
        System.out.println("Tài Khoản Ngân Hàng: " + taiKhoanNganHang);
        System.out.println("Mã Swift: " + maSwift);
        System.out.println("Loại Tiền Tệ: " + loaiTienTe);
        System.out.println("Tỷ Giá Hối Đoái: " + tyGiaHoiDoai);
        System.out.println("Chuyển Đổi Tiền Tệ: " + chuyenDoiTienTe());
    }

}


