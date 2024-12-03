package QLyCuaHangPhuKienOtoXeMay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Danhsachhđ {
    Scanner hoadon = new Scanner(System.in);
    private ArrayList<HoaDon> danhsachhoadon;
    private static int mahdtieptheo;
    private SanPham sanPham;
    private Phukienoto phukienoto;
    private Phukienxemay phukienxemay;
    private NhanVien nhanVien;
    private NhanVienBanHang nhanVienBanHang;
    private NhanVienQLy nhanVienQLy;
    private NhaCungCap nhaCungCap;
    private NhaCungCapNgoaiNuoc nhaCungCapNgoaiNuoc;
    private NhaCungCapTrongNuoc nhaCungCapTrongNuoc;
    private KhachHang khachHang;
    private KhachHangBinhThuong KhachHangBinhThuong;
    private KhachHangVipPro KhachHangVipPro;
    private HoaDon HoaDon;
    private HoaDonBan hoaDonBan;
    private HoaDonNhap hoaDonNhap;
    private ArrayList<KhachHang> danhskh;
    private ArrayList<SanPham> danhssp;
    private ArrayList<NhanVien> danhsnv;
    private ArrayList<NhaCungCap> danhsncc;


    public Danhsachhđ() {
        danhsachhoadon = new ArrayList<>();
    }

    public Danhsachhđ(Phukienoto phukienoto, Phukienxemay phukienxemay, SanPham sanPham,
                      NhanVien nhanVien, NhanVienBanHang nhanVienBanHang, NhanVienQLy nhanVienQLy,
                      NhaCungCap nhaCungCap, NhaCungCapNgoaiNuoc nhaCungCapNgoaiNuoc, NhaCungCapTrongNuoc nhaCungCapTrongNuoc,
                      KhachHang khachHang, KhachHangBinhThuong KhachHangBinhThuong, KhachHangVipPro KhachHangVipPro,
                      HoaDon HoaDon, HoaDonBan hoaDonBan, HoaDonNhap hoaDonNhap ) {
        this.phukienoto = phukienoto;
        this.phukienxemay = phukienxemay;
        this.sanPham = sanPham;
        this.nhanVien = nhanVien;
        this.nhanVienBanHang = nhanVienBanHang;
        this.nhanVienQLy = nhanVienQLy;
        this.nhaCungCap = nhaCungCap;
        this.nhaCungCapNgoaiNuoc = nhaCungCapNgoaiNuoc;
        this.nhaCungCapTrongNuoc = nhaCungCapTrongNuoc;
        this.khachHang = khachHang;
        this.KhachHangBinhThuong = KhachHangBinhThuong;
        this.KhachHangVipPro = KhachHangVipPro;
        this.HoaDon = HoaDon;
        this.hoaDonBan = hoaDonBan;
        this.hoaDonNhap = hoaDonNhap;
    }

    public ArrayList<HoaDon> getQlyKhachHang() {
        return danhsachhoadon;
    }
    public void setQlyKhachHang(ArrayList<HoaDon> danhsachhoadon) {
        this.danhsachhoadon = danhsachhoadon;
    }
    public static int getMahdtieptheo() {
        return mahdtieptheo;
    }
    public static void setMahdtieptheo(int mahdtieptheo) {
        Danhsachhđ.mahdtieptheo = mahdtieptheo;
    }
    public void xemThongTin() {
        if (danhsachhoadon != null && !danhsachhoadon.isEmpty()) {
            for (HoaDon hoadon : danhsachhoadon) {
                // In hóa đơn
                System.out.println("Mã hóa đơn: " + hoadon.getMaHoaDon());
                System.out.println("Ngày lập hóa đợn: " + hoadon.getNgayLapHoaDon());
                System.out.println("Tổng tiền: " + hoadon.getTongTien());

                // In thông tin khách hàng
                KhachHang khachhang = hoadon.getKhachHang();
                System.out.println("======Thông tin Khách hàng====== ");
                System.out.println("Mã khách hàng: " + khachhang.getMaKhachHang());
                System.out.println("Họ và tên khách hàng: " + khachhang.getHoTenKhachHang());
                System.out.println("Giới tính khách hàng: " + khachhang.getPhaikh());
                System.out.println("Số điện thoại khách hàng: " + khachhang.getSdtKhachHang());
                System.out.println("Email của khách hàng: " + khachhang.getEmail());

                // In chi tiết hóa đơn
                System.out.println("Chi tiết hóa đơn:");
                hoaDonChiTiet hoadct = hoadon.getHoaDonChiTiet();
                SanPham hoadonct = hoadon.getSanPham();
                System.out.println("Mã sản phẩm: " + hoadonct.getMaSanPham());
                System.out.println("Tên sản phẩm: " + hoadonct.getTenSanPham());
                System.out.println("Giá bán sản phẩm: " + hoadonct.getTenSanPham());
                System.out.println("Số luợng mua: " + hoadct.getSoluongmua());
                System.out.println("Loại xe: " + hoadonct.getLoaiXe());

                System.out.println("=====================================================================");
                
                // In thành tiền
                tinhThanhTien(hoadct);  // Gọi phương thức tính thành tiền
                System.out.println("===============\n");
            }
        } else {
            System.out.println("Danh sách hóa đơn trống.");
        }
    }

    public void themThongTin() {
        System.out.println("Chọn loại hóa đơn (1 - Hóa đơn bán, 2 - Hóa đơn nhập): ");
        int choice = hoadon.nextInt();
        hoadon.nextLine(); // Đọc bỏ dòng mới sau khi nhập số

        HoaDon hoadon1 = null;

        if (choice == 1) {
            hoadon1 = new HoaDonBan();
        } else if (choice == 2) {
            hoadon1 = new HoaDonNhap();
        } else {
            System.out.println("Lựa chọn hóa đơn không hợp lệ.");
            return; // Nếu lựa chọn không hợp lệ, kết thúc phương thức
        }

        // Nhập thông tin khách hàng
        System.out.println("Chọn loại khách hàng (1 - Khách Hàng Vip Pro, 2 - Khách Hàng Bình Thường ");
        int khChoice = hoadon.nextInt();
        hoadon.nextLine(); // Đọc bỏ dòng mới sau khi nhập số

        KhachHang khachhang = null;

        if (khChoice == 1) {
            khachhang = new KhachHangVipPro(); // Khách hàng cá nhân
        } else if (khChoice == 2) {
            khachhang = new KhachHangBinhThuong(); // Khách hàng công ty
        } else {
            System.out.println("Lựa chọn khách hàng không hợp lệ.");
            return; // Nếu lựa chọn không hợp lệ, kết thúc phương thức
        }

        // Nhập thông tin khách hàng và gán vào hóa đơn
        khachhang.nhapThongTin(); // Nhập thông tin khách hàng
        hoadon1.setKhachHang(khachhang); // Gán khách hàng cho hóa đơn

        // Sau đó nhập thông tin hóa đơn
        hoadon1.nhapThongTin();

        // Thêm hóa đơn vào danh sách
        danhsachhoadon.add(hoadon1);
        System.out.println("Đã thêm hóa đơn vào danh sách.");
    }


//    public void themThongTin() {
//        System.out.println("Chọn loại hóa đơn (1 - Hóa đơn bán, 2 - Hóa đơn nhập): ");
//        int choice = hoadon.nextInt();
//        hoadon.nextLine(); // Đọc bỏ dòng mới sau khi nhập số
//
//        HoaDon hoadon = null;
//
//        if (choice == 1) {
//            hoadon = new HoaDonBan();
//        } else if (choice == 2) {
//            hoadon = new HoaDonNhap();
//        }
//
//        if (hoadon != null) {
//            // Nhập thông tin khách hàng trước
//            hoadon.nhapKhachHang();
//
//            // Sau đó nhập thông tin sản phẩm
//            hoadon.nhapThongTin();
//
//            // Thêm hóa đơn vào danh sách
//            danhsachhoadon.add(hoadon);
//        } else {
//            System.out.println("Lựa chọn không hợp lệ.");
//        }
//    }
    public void suaThongTin() {
        System.out.println("Nhập mã Hóa đơn để sửa: ");
        int maCanSua = hoadon.nextInt();
        for (HoaDon hoadon : danhsachhoadon) {
            if (hoadon.getMaHoaDon() == maCanSua) {
                hoadon.suaThongTin();
                System.out.println("Đã sửa thông tin của hóa đơn!");
                return;
            }
        }
        System.out.println("Không tìm thấy hóa đơn để sửa!");
    }
    	public void xoaThongTin() {
	    System.out.println("Nhập mã Hóa đơn để xóa: ");
	    int maCanXoa = hoadon.nextInt();
	    for (HoaDon hoadon : danhsachhoadon) {
	        if (hoadon.getMaHoaDon() == maCanXoa) {
	            danhsachhoadon.remove(hoadon);
	            System.out.println("Đã xóa hóa đơn!");
	            return;
	        }
	    }
	    System.out.println("Không tìm thấy hóa đơn để xóa!");
	}
    public void timKiemThongTin() {
        System.out.println("Nhập mã Hóa đơn để tìm kiếm: ");
        int find = hoadon.nextInt();
        boolean found = true;
        for(HoaDon hoadon : danhsachhoadon) {
            if (hoadon.getMaHoaDon() == find) {
                hoadon.xuatThongTin();
            }
            if (!found) {
                System.out.println("Không có Hóa đơn tìm kiếm !");
            }
        }
    }
    public double tinhThueVAT() {
        // Kiểm tra xem sanPham và loaiXe có giá trị hay không
        if (sanPham != null) {
            if (sanPham.getLoaiXe() != null) {
                if (sanPham.getLoaiXe().equalsIgnoreCase("Phụ kiện Oto")) {
                    return phukienoto.tinhThueVAT();
                }
                if (sanPham.getLoaiXe().equalsIgnoreCase("Phụ kiện xe máy")) {
                    return phukienxemay.tinhThueVAT();
                }
                return 1.1;
            } else {
                // Xử lý nếu loaixe là null
                System.out.println("Loại xe không xác định.");
            }
        } else {
            // Xử lý nếu sanPham là null
            System.out.println("Không có sản phẩm để tính thuế.");
        }
        // Trả về giá trị mặc định hoặc thích hợp theo logic của bạn
        return 0.0;
    }

    // Phương thức tính thành tiền và in ra màn hình
    private void tinhThanhTien(hoaDonChiTiet hoadct) {
        double thanhTien = hoadct.tinhTongTien() + tinhThueVAT() * hoadct.tinhTongTien();
        System.out.println("Thành tiền: " + thanhTien);
    }
    public KhachHang timKiemKhachHangTheoMa(int maKhachHang) {
        for (KhachHang khachhang : danhskh) {
            if (khachhang.getMaKhachHang() == maKhachHang) {
                return khachhang;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
    public SanPham timKiemSanPhamTheoMa(int maSanPham) {
        for (SanPham hoadonct : danhssp) {
            if (hoadonct.getMaSanPham() == maSanPham) {
                return hoadonct;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
    public void taiDSTuFile(String fileName, Danhsachkh danhskh, Danhsachsp danhssp) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                // Tạo đối tượng HoaDon từ thông tin trong file
                HoaDonBan hoadon = new HoaDonBan();
                hoadon.setMaHoaDon(Integer.parseInt(parts[0]));
                hoadon.setTongTien(Double.parseDouble(parts[1]));
                hoadon.setNgayLapHoaDon(parts[2]);


                // Tạo đối tượng KhachHang từ DSKhachHang
                int maKhachHang = Integer.parseInt(parts[3]);
                KhachHang khachhang = danhskh.timKiemKhachHangTheoMa(maKhachHang);
                hoadon.setKhachHang(khachhang);

                // Tạo đối tượng hoaDonChiTiet từ thông tin trong file
                hoaDonChiTiet hoadct = new hoaDonChiTiet();

                hoadct.setSoluongmua(Integer.parseInt(parts[4]));

                // Tạo đối tượng SanPham từ DSSanPham
                int maSanPham = Integer.parseInt(parts[3]);
                SanPham hoadonct = danhssp.timKiemSanPhamTheoMa(maSanPham);
                hoadct.setSanPham(hoadonct);

                hoadon.setHoaDonChiTiet(hoadct);

                // Thêm HoaDon vào danh sách
                danhsachhoadon.add(hoadon);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void xuatDSRaFile(String fileName2) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            for(HoaDon hoadon : danhsachhoadon) {
                writer.write(parseHoaDonToLine(hoadon));
                writer.newLine();
            }
            System.out.println("Đã xuất danh sách ra tệp tin: " + fileName2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String parseHoaDonToLine(HoaDon hoadon) {
        // Lấy thông tin nhà cung cấp từ sản phẩm
        KhachHang khachhang = hoadon.getKhachHang();
        SanPham hoadonct = hoadon.getSanPham();
        hoaDonChiTiet hoadct = hoadon.getHoaDonChiTiet();

        // Ghi các đối tượng thành dòng văn bản và xuống dòng
        return hoadon.getMaHoaDon() + ";" + hoadon.getNgayLapHoaDon() + ";" + hoadon.getTongTien() + ";"
                + khachhang.getMaKhachHang() + ";" + khachhang.getHoTenKhachHang() + ";"  +
                khachhang.getEmail() + ";" + khachhang.getSdtKhachHang() + ";" + hoadonct.getMaSanPham()
                + hoadonct.getTenSanPham() + ";" + hoadct.getSoluongmua() + ";" ;
    }
}
