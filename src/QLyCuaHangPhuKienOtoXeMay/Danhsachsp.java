package QLyCuaHangPhuKienOtoXeMay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Danhsachsp {
    Scanner dssp = new Scanner(System.in);
    private ArrayList<SanPham> danhssp;
    private static int masanphamtieptheo;



    // Khởi tạo danh sách sản phẩm trong constructor
    public Danhsachsp() {
        danhssp = new ArrayList<>();
    }
    public Danhsachsp(ArrayList<SanPham> danhssp) {
        this.danhssp = danhssp;
    }

    public static int getMasanphamtieptheo() {
        return masanphamtieptheo;
    }

    public static void setMasanphamtieptheo(int masanphamtieptheo) {
        Danhsachsp.masanphamtieptheo = masanphamtieptheo;
    }

    public void xemThongTin() {
        if (danhssp != null) {
            for(SanPham sanph : danhssp) {
                sanph.xuatThongTin();
            }
        } else {
            System.out.println("Danh sách sản phẩm trống.");
        }
    }

    public void themThongTin() {
        System.out.println("Chọn loại sản phẩm (1 - Phụ kiện ô tô, 2 - Phụ kiện xe máy): ");
        int choice = dssp.nextInt();
        dssp.nextLine(); // Đọc bỏ dòng mới sau khi nhập số

        SanPham sanpham1 = null;

        if (choice == 1) {
            sanpham1 = new Phukienoto();
        } else if (choice == 2) {
            sanpham1 = new Phukienxemay();
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
            return; // Nếu không hợp lệ, kết thúc phương thức
        }


        // Chỉ yêu cầu nhập thông tin nhà cung cấp một lần
        System.out.println("Chọn nhà cung cấp (1 - Trong nước, 2 - Ngoài nước): ");
        int nccChoice = dssp.nextInt();
        dssp.nextLine();  // Đọc bỏ dòng mới

        NhaCungCap nhacungcap1 = null;

        if (nccChoice == 1) {
            nhacungcap1 = new NhaCungCapTrongNuoc();
        } else if (nccChoice == 2) {
            nhacungcap1 = new NhaCungCapNgoaiNuoc();
        } else {
            System.out.println("Lựa chọn nhà cung cấp không hợp lệ.");
            return; // Nếu lựa chọn không hợp lệ, kết thúc phương thức
        }

        // Nhập thông tin nhà cung cấp chỉ một lần
        nhacungcap1.nhapThongTin(); // Nhập thông tin nhà cung cấp
        sanpham1.setNhaCungCap(nhacungcap1); // Gán NCC cho sản phẩm

        // Sau đó nhập thông tin sản phẩm
        sanpham1.nhapThongTin();

        // Thêm sản phẩm vào danh sách
        danhssp.add(sanpham1);
        System.out.println("Đã thêm sản phẩm vào danh sách.");

//        if (sanpham1 != null) {
//            // Trước khi thêm sản phẩm mới, nhập thông tin nhà cung cấp
//            sanpham1.nhapNhaCungCap();
//
//            // Sau đó nhập thông tin sản phẩm
//            sanpham1.nhapThongTin();
//
//            // Thêm sản phẩm vào danh sách
//            danhssp.add(sanpham1);
//        } else {
//            System.out.println("Lựa chọn không hợp lệ.");
//        }
    }

    public void suaThongTin() {
        System.out.println("Nhập tên Sản phẩm cần sửa: ");
        String tenCanSua = dssp.nextLine();
        for(SanPham sanph : danhssp) {
            if (sanph.getTenSanPham().equals(tenCanSua)) {
                // Gọi phương thức suaThongTin()
                sanph.suaThongTin();
                System.out.println("Đã sửa thông tin của sản phẩm!");
                return; 
            }
        }
        System.out.println("Không tìm thấy sản phẩm cần sửa!");
    }
    public void xoaThongTin() {
        System.out.println("Nhập tên Sản phẩm cần xóa: ");
        String tenCanXoa = dssp.nextLine();
        for(SanPham sanph : danhssp) {
            if (sanph.getTenSanPham().equals(tenCanXoa)) {
                // Gọi phương thức xoa() của đối tượng tài liệu tương ứng
                danhssp.remove(sanph);
                System.out.println("Đã xóa sản phẩm!");
                return; // Kết thúc sau khi xóa
            }
        }
        System.out.println("Không tìm thấy sản phẩm cần xóa!");
    }
    public void timKiemThongTin() {
        System.out.println("Nhập tên Sản phẩm cần tìm kiếm: ");
        String find = dssp.nextLine();
        boolean found = true;
        for(SanPham sanph : danhssp) {
            if (sanph.getTenSanPham().contains(find)) {
                sanph.xuatThongTin();
            }
            if (!found) {
                System.out.println("Không có sản phẩm tìm kiếm !");
            }
        }
    }
    public void taiDanhSachTuFile(String fileName, Danhsachncc danhsncc) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Đảm bảo bạn đã truyền danhsncc vào hàm
                parseLineToSanPhamOto(line, danhsncc);
            }
            System.out.println("Đã tải danh sách từ tệp tin: " + fileName);
            // Kiểm tra xem danh sách có dữ liệu không
            if (danhssp.isEmpty()) {
                System.out.println("Danh sách sản phẩm trống.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp tin: " + fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Đảm bảo bạn đã truyền danhsncc vào hàm
                parseLineToSanPhamXeMay(line, danhsncc);
            }
            System.out.println("Đã tải danh sách từ tệp tin: " + fileName);
            // Kiểm tra xem danh sách có dữ liệu không
            if (danhssp.isEmpty()) {
                System.out.println("Danh sách sản phẩm trống.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp tin: " + fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void xuatDanhSachRaFile(String fileName2) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            for(SanPham sanph : danhssp) {
                // Ghi đối tượng NhaCungCap thành dòng văn bản và xuống dòng
                writer.write(parseSanPhamToLine(sanph) + ";");
                writer.newLine();
            }
            System.out.println("Đã xuất danh sách ra tệp tin: " + fileName2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Hàm chuyển dòng văn bản thành đối tượng NhaCungCap
    private void parseLineToSanPhamOto(String line, Danhsachncc danhsncc) {
        String[] parts = line.split(";");
        if (parts.length == 15) {
            int maSanPham= Integer.parseInt(parts[0]);
            int soLuongTon = Integer.parseInt(parts[1]);
            int soLuongNhap = Integer.parseInt(parts[2]);
            int ngaysx = Integer.parseInt(parts[3]);
            int hanSuDung = Integer.parseInt(parts[4]);
            double giaBan = Double.parseDouble(parts[5]);
            double giaNhap = Double.parseDouble(parts[6]);
            double khoiLuong = Double.parseDouble(parts[7]);
            double tinhThueVAT = Double.parseDouble(parts[8]);
            String tenSanPham = parts[9];
            String loaiXe = parts[10];
            String mauSac = parts[11];
            String chatLieu = parts[12];
            String hangSanXuat = parts[13];
            String loaiPhuKien = parts[14];



            // Lấy thông tin nhà cung cấp từ danh sách
            NhaCungCap nhaCungCap = findNhaCungCapById(maSanPham, danhsncc);

            // Kiểm tra nếu tìm thấy nhà cung cấp
            if (nhaCungCap != null) {
                danhssp.add(new Phukienoto(maSanPham, soLuongTon, soLuongNhap,
                        giaBan, giaNhap, tenSanPham, loaiXe, nhaCungCap, ngaysx, hanSuDung, khoiLuong,  tinhThueVAT, mauSac, chatLieu, hangSanXuat, loaiPhuKien  ));
            }
        }
    }


    // Hàm chuyển dòng văn bản thành đối tượng NhaCungCap
    private void parseLineToSanPhamXeMay(String line, Danhsachncc danhsncc) {
        String[] parts = line.split(";");
        if (parts.length == 15) {
            int maSanPham= Integer.parseInt(parts[0]);
            int soLuongTon = Integer.parseInt(parts[1]);
            int soLuongNhap = Integer.parseInt(parts[2]);
            int ngaysx = Integer.parseInt(parts[3]);
            int hanSuDung = Integer.parseInt(parts[4]);
            double giaBan = Double.parseDouble(parts[5]);
            double giaNhap = Double.parseDouble(parts[6]);
            double khoiLuong = Double.parseDouble(parts[7]);
            double tinhThueVAT = Double.parseDouble(parts[8]);
            String tenSanPham = parts[9];
            String loaiXe = parts[10];
            String mauSac = parts[11];
            String chatLieu = parts[12];
            String hangSanXuat = parts[13];
            String loaiPhuKien = parts[14];

            // Lấy thông tin nhà cung cấp từ danh sách
            NhaCungCap nhaCungCap = findNhaCungCapById(maSanPham, danhsncc);

            // Kiểm tra nếu tìm thấy nhà cung cấp
            if (nhaCungCap != null) {
                danhssp.add(new Phukienxemay(maSanPham, soLuongTon, soLuongNhap,
                        giaBan, giaNhap, tenSanPham, loaiXe, nhaCungCap, ngaysx, hanSuDung,
                        khoiLuong,  tinhThueVAT, mauSac, chatLieu, hangSanXuat, loaiPhuKien));
            }
        }
    }

    // Thêm phương thức để tìm nhà cung cấp theo mã
    private NhaCungCap findNhaCungCapById(int mancc, Danhsachncc danhsncc) {
        for (NhaCungCap nhacungcap : danhsncc.getDanhsncc()) {
            if (nhacungcap.getMaNhaCungCap() == mancc) {
                return nhacungcap;
            }
        }
        return null;
    }

    // Hàm chuyển đối tượng SanPham thành dòng văn bản
    private String parseSanPhamToLine(SanPham sanph) {
        // Lấy thông tin nhà cung cấp từ sản phẩm
        NhaCungCap nhacungcap = sanph.getNhaCungCap();

        // Ghi đối tượng SanPham và NhaCungCap thành dòng văn bản và xuống dòng
        return sanph.getMaSanPham() + ";" + sanph.getSoLuongTon() + ";" + sanph.getSoLuongNhap() + ";" +
                sanph.getGiaBan() + ";" + sanph.getGiaNhap() + ";" + sanph.getTenSanPham() + ";" +
                nhacungcap.getMaNhaCungCap() + ";" + nhacungcap.getTenNhaCungCap() + ";" + nhacungcap.getDiaChi() +
                ";" + nhacungcap.getSoDienThoai();
    }
    public SanPham timKiemSanPhamTheoMa(int maSanPham) {
        for (SanPham sanph : danhssp) {
            if (sanph.getMaSanPham() == maSanPham) {
                return sanph;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
}

