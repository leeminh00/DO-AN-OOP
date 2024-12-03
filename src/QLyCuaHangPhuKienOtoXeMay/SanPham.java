package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

// Lớp Sản Phẩm
public abstract class SanPham implements INhap, IXuat {
    private int maSanPham;
    private String tenSanPham;
    private double giaBan;
    private double giaNhap;
    private String loaiXe; // Ô tô hoặc xe máy
    private int soLuongTon;
    private int soLuongNhap;
    private static int soLuongSanPham = 0;

// Kết hợp lớp NhaCungCap vào SanPham như một thành viên
// do sản phẩm được lấy từ một nhà cung cấp
// nên nhập thông tin nhà cung cấp cho sản phẩm
    private NhaCungCap nhaCungCap;

// Thêm thông tin của nhà cung cấp
    private int maNhaCungCap;
    private String tenNhaCungCap;
    private String diaChi;
    private long soDienThoai;

    // Hàm thiết lập
    // không tham số
    public SanPham() {
        SanPham.soLuongSanPham++;
//        this.nhaCungCap = new NhaCungCap();
        this.nhaCungCap = new NhaCungCapTrongNuoc();  // Sẽ tạo đối tượng NhaCungCap mới mà không sử dụng tham số
        this.nhaCungCap = new NhaCungCapNgoaiNuoc();  // Sẽ tạo đối tượng NhaCungCap mới mà không sử dụng tham số
    }

    // Có tham số
//    public SanPham(int maSanPham, String tenSanPham, double giaBan, double giaNhap,
//                   String loaiXe,NhaCungCap nhaCungCap, int soLuongTon, int soLuongNhap) {
//        this.maSanPham = maSanPham;
//        this.tenSanPham = tenSanPham;
//        this.giaBan = giaBan;
//        this.giaNhap = giaNhap;
//        this.loaiXe = loaiXe;
//        this.soLuongTon = soLuongTon;
//        this.soLuongNhap = soLuongNhap;
//        this.nhaCungCap = nhaCungCap; // Gán đối tượng NhaCungCap được truyền vào
//        soLuongSanPham++;
//    }

//    public SanPham(int maSanPham, int soLuongTon, int soLuongNhap, double giaBan, double giaNhap,
//                   String tenSanPham, String loaiXe, NhaCungCap nhaCungCap) {
//        this.maSanPham = maSanPham;
//        this.tenSanPham = tenSanPham;
//        this.giaBan = giaBan;
//        this.giaNhap = giaNhap;
//        this.loaiXe = loaiXe;
//        this.soLuongTon = soLuongTon;
//        this.soLuongNhap = soLuongNhap;
//        this.nhaCungCap = nhaCungCap; // Gán đối tượng NhaCungCap được truyền vào
//        soLuongSanPham++;
//    }

    public SanPham(int maSanPham, String tenSanPham, double giaBan, double giaNhap, String loaiXe,
                   NhaCungCap nhaCungCap, int soLuongTon, int soLuongNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.loaiXe = loaiXe;
        this.soLuongTon = soLuongTon;
        this.soLuongNhap = soLuongNhap;
        this.nhaCungCap = nhaCungCap; // Gán đối tượng NhaCungCap được truyền vào
        soLuongSanPham++;
    }


//  Phương thức get và set

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public static int getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public static void setSoLuongSanPham(int soLuongSanPham) {
        SanPham.soLuongSanPham = soLuongSanPham;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

//    public int getMaNhaCungCap() {
//        return maNhaCungCap;
//    }
//
//    public void setMaNhaCungCap(int maNhaCungCap) {
//        this.maNhaCungCap = maNhaCungCap;
//    }
//
//    public String getTenNhaCungCap() {
//        return tenNhaCungCap;
//    }
//
//    public void setTenNhaCungCap(String tenNhaCungCap) {
//        this.tenNhaCungCap = tenNhaCungCap;
//    }
//
//    public String getDiaChi() {
//        return diaChi;
//    }
//
//    public void setDiaChi(String diaChi) {
//        this.diaChi = diaChi;
//    }
//
//    public long getSoDienThoai() {
//        return soDienThoai;
//    }
//
//    public void setSoDienThoai(long soDienThoai) {
//        this.soDienThoai = soDienThoai;
//    }

    @Override
    public void nhapThongTin() {
        Scanner sanpham = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        maSanPham = sanpham.nextInt();
        sanpham.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSanPham = sanpham.nextLine();
        System.out.println("Nhập số tiền nhập hàng: ");
        giaNhap = sanpham.nextDouble();
        System.out.println("Nhập số tiền bán hàng: ");
        giaBan = sanpham.nextDouble();
        sanpham.nextLine();
        System.out.println("Nhập loại xe: ");
        loaiXe = sanpham.nextLine();
        System.out.println("Nhập số lượng tồn hàng: ");
        soLuongTon = sanpham.nextInt();
        System.out.println("Nhập số lượng nhập hàng: ");
        soLuongNhap = sanpham.nextInt();
//        // Nhập thông tin của nhà cung cấp
//        nhaCungCap.nhapThongTin();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("Mã sản phẩm: " + maSanPham);
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Tiền nhập hàng: " + giaNhap);
        System.out.println("Tiền bán hàng: " + giaBan);
        System.out.println("Loại xe: " + loaiXe);
        System.out.println("Số lượng hàng tồn: " + soLuongTon);
        System.out.println("Số lượng nhập hàng: " + soLuongNhap);
        // Xuất thông tin của nhà cung cấp
        nhaCungCap.xuatThongTin();
    }

    public void suaThongTin() {
        // Sửa thông tin mã sản phẩm, tên sản phẩm, loại sản phẩm, số lượng nhập hàng, giá tiền, và thông tin nhà cung cấp
        Scanner sanpham = new Scanner(System.in);
        System.out.println("Nhập mã số sản phẩm mới: ");
        this.setMaSanPham(sanpham.nextInt());
        sanpham.nextLine();
        System.out.println("Nhập tên sản phẩm mới: ");
        this.setTenSanPham(sanpham.nextLine());
        System.out.println("Nhập giá bán mới: ");
        this.setGiaBan(sanpham.nextInt());
        System.out.println("Nhập giá nhập hàng mới: ");
        this.setGiaNhap(sanpham.nextInt());
        sanpham.nextLine();
        System.out.println("Nhập loại xe mới: ");
        this.setLoaiXe(sanpham.nextLine());
        System.out.println("Nhập số lượng còn tồn hàng mới: ");
        this.setSoLuongTon(sanpham.nextInt());
        System.out.println("Nhập số lượng nhập hàng mới: ");
        this.setSoLuongNhap(sanpham.nextInt());

        // Sửa thông tin nhà cung cấp
        nhaCungCap.suaThongTin();
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan=" + giaBan +
                ", giaNhap=" + giaNhap +
                ", loaiXe='" + loaiXe + '\'' +
                ", soLuongTon=" + soLuongTon +
                ", soLuongNhap=" + soLuongNhap +
                ", nhaCungCap=" + nhaCungCap +
                ", maNhaCungCap=" + maNhaCungCap +
                ", tenNhaCungCap='" + tenNhaCungCap + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }

//    public void nhapNhaCungCap() {
////        NhaCungCap ncc = new NhaCungCap();
//        NhaCungCapTrongNuoc ncc = new NhaCungCapTrongNuoc();
//        NhaCungCapNgoaiNuoc ncc2 = new NhaCungCapNgoaiNuoc();
//
//
//        ncc.nhapThongTin();
//        ncc2.nhapThongTin();
//
//
//
//        // Tạo đối tượng NhaCungCap và gọi phương thức nhap() của nó
//        ncc.setMaNhaCungCapTrongNuoc(ncc.getMaNhaCungCapTrongNuoc());
//        ncc.setTenNhaCungCapTrongNuoc(ncc.getTenNhaCungCapTrongNuoc());
//        ncc.setDiaChiNCCTrongNuoc(ncc.getDiaChiNCCTrongNuoc());
//        ncc.setSoDienThoaiNCCTrongNuoc(ncc.getSoDienThoaiNCCTrongNuoc());
//
//
//
//        ncc2.setMaNhaCungCapNgoaiNuoc(ncc2.getMaNhaCungCapNgoaiNuoc());
//        ncc2.setTenNhaCungCapNgoaiNuoc(ncc2.getTenNhaCungCapNgoaiNuoc());
//        ncc2.setDiaChiNCCNgoaiNuoc(ncc2.getDiaChiNCCNgoaiNuoc());
//        ncc2.setSoDienThoaiNCCNgoaiNuoc(ncc2.getSoDienThoaiNCCNgoaiNuoc());
//        NhaCungCap nhacungcaptrongnuoc = new NhaCungCapTrongNuoc();
//        NhaCungCap nhacungcapngoainuoc = new NhaCungCapNgoaiNuoc();
//        nhacungcaptrongnuoc.nhapThongTin();
//        nhacungcapngoainuoc.nhapThongTin();

        // Gán thông tin nhà cung cấp cho sản phẩm
//        setMaNhaCungCap(ncc.getMaNhaCungCap());
//        setTenNhaCungCap(ncc.getTenNhaCungCap());
//        setDiaChi(ncc.getDiaChi());
//        setSoDienThoai(ncc.getSoDienThoai());
//
//        setMaNhaCungCap(ncc2.getMaNhaCungCap());
//        setTenNhaCungCap(ncc2.getTenNhaCungCap());
//        setDiaChi(ncc2.getDiaChi());
//        setSoDienThoai(ncc2.getSoDienThoai());


//        setNhaCungCap(nhacungcaptrongnuoc.getMaNhaCungCap());
//        setNhaCungCap(nhacungcaptrongnuoc.getTenNhaCungCap());
//        setNhaCungCap(nhacungcaptrongnuoc.);
//        setNhaCungCap(nhacungcaptrongnuoc.getMaNhaCungCap());
//        setNhaCungCap(nhacungcapngoainuoc);


//    }

    // Phương thức static
    public static int laySoLuongSanPham() {
        return soLuongSanPham;
    }
}
