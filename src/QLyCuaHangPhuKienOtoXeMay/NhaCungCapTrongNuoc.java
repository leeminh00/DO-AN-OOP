package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

public class NhaCungCapTrongNuoc extends NhaCungCap implements INhap, IXuat {

        private String vungMienDaiLy;
        private long maSoThue;
        private long taiKhoanNganHang;
        private String giayPhepKinhDoanh;
        private boolean daCungCapTruoc;
        private int soLanHopTac;

    private int maNhaCungCapTrongNuoc ;
    private String tenNhaCungCapTrongNuoc ;
    private String diaChiNCCTrongNuoc ;
    private long soDienThoaiNCCTrongNuoc ;


        public NhaCungCapTrongNuoc() {
            super();
        }

//        public NhaCungCapTrongNuoc(int maNhaCungCap, String tenNhaCungCap,
//                                   String diaChi, long soDienThoai, String vungMienDaiLy, long maSoThue,
//                                   long taiKhoanNganHang, String giayPhepKinhDoanh, boolean daCungCapTruoc,
//                                   int soLanHopTac) {
//            super(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai);
//            this.vungMienDaiLy = vungMienDaiLy;
//            this.maSoThue = maSoThue;
//            this.taiKhoanNganHang = taiKhoanNganHang;
//            this.giayPhepKinhDoanh = giayPhepKinhDoanh;
//            this.daCungCapTruoc = daCungCapTruoc;
//            this.soLanHopTac = soLanHopTac;
//        }

//    public NhaCungCapTrongNuoc(int maNhaCungCap, long soDienThoai, String tenNhaCungCap,
//                               String diaChi, int soLanHopTac, long maSoThue, long taiKhoanNganHang,
//                               boolean daCungCapTruoc, String vungMienDaiLy, String giayPhepKinhDoanh,
//                               int maNhaCungCapTrongNuoc,  String tenNhaCungCapTrongNuoc, String diaChiNCCTrongNuoc,
//                               long soDienThoaiNCCTrongNuoc) {
//        super(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai);
//        this.vungMienDaiLy = vungMienDaiLy;
//        this.maSoThue = maSoThue;
//        this.taiKhoanNganHang = taiKhoanNganHang;
//        this.giayPhepKinhDoanh = giayPhepKinhDoanh;
//        this.daCungCapTruoc = daCungCapTruoc;
//        this.soLanHopTac = soLanHopTac;
//
//        this.maNhaCungCapTrongNuoc = maNhaCungCapTrongNuoc;
//        this.tenNhaCungCapTrongNuoc = tenNhaCungCapTrongNuoc;
//        this.diaChiNCCTrongNuoc = diaChiNCCTrongNuoc;
//        this.soDienThoaiNCCTrongNuoc = soDienThoaiNCCTrongNuoc;
//    }

//    public NhaCungCapTrongNuoc(int maNhaCungCap, long soDienThoai, String tenNhaCungCap, String diaChi,
//                               int soLanHopTac, long maSoThue, long taiKhoanNganHang, boolean daCungCapTruoc,
//                               String vungMienDaiLy, String giayPhepKinhDoanh, int maNhaCungCapTrongNuoc,  String tenNhaCungCapTrongNuoc, String diaChiNCCTrongNuoc,
//                               long soDienThoaiNCCTrongNuoc) {
//        super(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai);
//        this.vungMienDaiLy = vungMienDaiLy;
//        this.maSoThue = maSoThue;
//        this.taiKhoanNganHang = taiKhoanNganHang;
//        this.giayPhepKinhDoanh = giayPhepKinhDoanh;
//        this.daCungCapTruoc = daCungCapTruoc;
//        this.soLanHopTac = soLanHopTac;
//
//        this.maNhaCungCapTrongNuoc = maNhaCungCapTrongNuoc;
//        this.tenNhaCungCapTrongNuoc = tenNhaCungCapTrongNuoc;
//        this.diaChiNCCTrongNuoc = diaChiNCCTrongNuoc;
//        this.soDienThoaiNCCTrongNuoc = soDienThoaiNCCTrongNuoc;
//    }

    public NhaCungCapTrongNuoc(int maNhaCungCap, long soDienThoai, String tenNhaCungCap, String diaChi,
                               int soLanHopTac, long maSoThue, long taiKhoanNganHang, boolean daCungCapTruoc,
                               String vungMienDaiLy, String giayPhepKinhDoanh, int maNhaCungCapTrongNuoc,
                               long soDienThoaiNCCTrongNuoc, String tenNhaCungCapTrongNuoc, String diaChiNCCTrongNuoc) {
        super(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai);
        this.vungMienDaiLy = vungMienDaiLy;
        this.maSoThue = maSoThue;
        this.taiKhoanNganHang = taiKhoanNganHang;
        this.giayPhepKinhDoanh = giayPhepKinhDoanh;
        this.daCungCapTruoc = daCungCapTruoc;
        this.soLanHopTac = soLanHopTac;

        this.maNhaCungCapTrongNuoc = maNhaCungCapTrongNuoc;
        this.tenNhaCungCapTrongNuoc = tenNhaCungCapTrongNuoc;
        this.diaChiNCCTrongNuoc = diaChiNCCTrongNuoc;
        this.soDienThoaiNCCTrongNuoc = soDienThoaiNCCTrongNuoc;
    }


    public String getVungMienDaiLy() {
        return vungMienDaiLy;
    }

    public void setVungMienDaiLy(String vungMienDaiLy) {
        this.vungMienDaiLy = vungMienDaiLy;
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

    public String getGiayPhepKinhDoanh() {
        return giayPhepKinhDoanh;
    }

    public void setGiayPhepKinhDoanh(String giayPhepKinhDoanh) {
        this.giayPhepKinhDoanh = giayPhepKinhDoanh;
    }

    public boolean isDaCungCapTruoc() {
        return daCungCapTruoc;
    }

    public void setDaCungCapTruoc(boolean daCungCapTruoc) {
        this.daCungCapTruoc = daCungCapTruoc;
    }

    public int getSoLanHopTac() {
        return soLanHopTac;
    }

    public void setSoLanHopTac(int soLanHopTac) {
        this.soLanHopTac = soLanHopTac;
    }

    public int getMaNhaCungCapTrongNuoc() {
        return maNhaCungCapTrongNuoc;
    }

    public void setMaNhaCungCapTrongNuoc(int maNhaCungCapTrongNuoc) {
        this.maNhaCungCapTrongNuoc = maNhaCungCapTrongNuoc;
    }

    public String getTenNhaCungCapTrongNuoc() {
        return tenNhaCungCapTrongNuoc;
    }

    public void setTenNhaCungCapTrongNuoc(String tenNhaCungCapTrongNuoc) {
        this.tenNhaCungCapTrongNuoc = tenNhaCungCapTrongNuoc;
    }

    public String getDiaChiNCCTrongNuoc() {
        return diaChiNCCTrongNuoc;
    }

    public void setDiaChiNCCTrongNuoc(String diaChiNCCTrongNuoc) {
        this.diaChiNCCTrongNuoc = diaChiNCCTrongNuoc;
    }

    public long getSoDienThoaiNCCTrongNuoc() {
        return soDienThoaiNCCTrongNuoc;
    }

    public void setSoDienThoaiNCCTrongNuoc(long soDienThoaiNCCTrongNuoc) {
        this.soDienThoaiNCCTrongNuoc = soDienThoaiNCCTrongNuoc;
    }

    // Phương thức đánh giá mức độ tin cậy của nhà cung cấp
    public String danhGiaMucDoTinCay() {
        if (soLanHopTac >= 5 && daCungCapTruoc) {
            return "Tin Cậy Cao";
        } else if (soLanHopTac >= 3) {
            return "Tin Cậy Trung Bình";
        } else {
            return "Cần Đánh Giá Thêm";
        }
    }

        @Override
        public void nhapThongTin() {
            Scanner nhacungcap = new Scanner(System.in);
            super.nhapThongTin();

            System.out.println("Nhà cung cấp ở vùng miền: ");
            vungMienDaiLy = nhacungcap.nextLine();
            System.out.println("Mã số thuế của nhà cung cấp: ");
            maSoThue = nhacungcap.nextLong();
            System.out.println("Tài khoản ngân hàng của nhà cung cấp: ");
            taiKhoanNganHang = nhacungcap.nextLong();
            nhacungcap.nextLine();
            System.out.println("Giấy phép của nhà cung cấp: ");
            giayPhepKinhDoanh = nhacungcap.nextLine();
            System.out.println("Đã cung cấp trước từ nhà cung cấp: ");
            daCungCapTruoc = nhacungcap.nextBoolean();
            System.out.println("Số lần hợp tác từ nhà cung cấp: ");
            soLanHopTac = nhacungcap.nextInt();
        }

        @Override
        public void xuatThongTin() {
            super.xuatThongTin();

            System.out.println("Thông Tin Nhà Cung Cấp Trong Nước:");
            System.out.println("Mã Nhà Cung Cấp: " + getMaNhaCungCap());
            System.out.println("Tên Nhà Cung Cấp: " + getTenNhaCungCap());
            System.out.println("Nhà cung cấp ở vùng miền: " + vungMienDaiLy);
            System.out.println("Mã Số Thuế: " + maSoThue);
            System.out.println("Giấy Phép Kinh Doanh: " + giayPhepKinhDoanh);
            System.out.println("Số Lần Hợp Tác: " + soLanHopTac);
            System.out.println("Đã Cung Cấp Trước: " + (daCungCapTruoc ? "True" : "False"));
            System.out.println("Mức Độ Tin Cậy: " + danhGiaMucDoTinCay());
        }

}


