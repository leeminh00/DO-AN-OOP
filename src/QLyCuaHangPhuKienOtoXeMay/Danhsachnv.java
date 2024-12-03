package QLyCuaHangPhuKienOtoXeMay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Danhsachnv {
    Scanner nhanvien = new Scanner(System.in);
    private ArrayList<NhanVien> danhsnv;
    private static int manhanvientieptheo;
    public Danhsachnv() {
        danhsnv = new ArrayList<>();
    }
    public static int getManhanvientieptheo() {
        return manhanvientieptheo;
    }
    public static void setManhanvientieptheo(int manhanvientieptheo) {
        Danhsachnv.manhanvientieptheo = manhanvientieptheo;
    }
    public void xemThongTin() {
        for(NhanVien nhanvien : danhsnv) {
            nhanvien.xuatThongTin();
        }
    }
    public void themThongTin() {
        System.out.println("Chọn chức vụ của nhân viên: ");
        System.out.println("1. Nhân viên bán hàng");
        System.out.println("2. Nhân viên quản lý");
        int choice = nhanvien.nextInt();
        nhanvien.nextLine();  // Đọc bỏ dấu cách thừa

        NhanVien nhanvien1 = null;

        if (choice == 1) {
            nhanvien1 = new NhanVienBanHang();
        } else if (choice == 2) {
            nhanvien1 = new NhanVienQLy();
        }

        if (nhanvien1 != null) {
            nhanvien1.nhapThongTin();  // Nhập thông tin cho nhân viên đã chọn
            danhsnv.add(nhanvien1);  // Thêm nhân viên vào danh sách
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }
    public void suaThongTin() {
        System.out.println("Nhập tên Nhân viên cần sửa: ");
        String tenCanSua = nhanvien.nextLine();
        for(NhanVien nhanvien : danhsnv) {
            if (nhanvien.getHoTen().equals(tenCanSua)) {
                // Gọi phương thức suaThongTin()
                nhanvien.suaThongTin();
                System.out.println("Đã sửa thông tin của nhân viên!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên cần sửa!");
    }
    public void xoaThongTin() {
        System.out.println("Nhập tên Nhân viên cần xóa: ");
        String tenCanXoa = nhanvien.nextLine();
        for(NhanVien nhanvien : danhsnv) {
            if (nhanvien.getHoTen().equals(tenCanXoa)) {
                // Gọi phương thức xoa() của đối tượng tài liệu tương ứng
                danhsnv.remove(nhanvien);
                System.out.println("Đã xóa nhân viên!");
                return; // Kết thúc sau khi xóa
            }
        }
        System.out.println("Không tìm thấy nhân viên cần xóa!");
    }
    public void timKiemThongTin() {
        System.out.println("Nhập tên Nhân viên cần tìm kiếm: ");
        String find = nhanvien.nextLine();
        boolean found = true;
        for(NhanVien nhanvien : danhsnv) {
            if (nhanvien.getHoTen().contains(find)) {
                nhanvien.xuatThongTin();
            }
            if (!found) {
                System.out.println("Không có nhân viên tìm kiếm !");
            }
        }
    }
    public void taiDanhSachTuFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Chuyển dòng văn bản thành đối tượng NhaCungCap và thêm vào danh sách
                NhanVien nhanvien1 = parseLineToNhanVienBanHang(line);
                NhanVien nhanvien2 = parseLineToNhanVienQLy(line);
                if (nhanvien1 != null) {
                    danhsnv.add(nhanvien1);
                }
                if (nhanvien2 != null) {
                    danhsnv.add(nhanvien2);
                }
            }
            System.out.println("Đã tải danh sách từ tệp tin: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp tin: " + fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void xuatDanhSachRaFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for(NhanVien nhanvien : danhsnv) {
                // Ghi đối tượng NhaCungCap thành dòng văn bản và xuống dòng
                writer.write(parseNhanVienToLine(nhanvien));
                writer.newLine();
            }
            System.out.println("Đã xuất danh sách ra tệp tin: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Hàm chuyển dòng văn bản thành đối tượng NhaCungCap
    private NhanVienBanHang parseLineToNhanVienBanHang(String line) {
        String[] parts = line.split(";"); // Giả sử dữ liệu được phân tách bằng dấu chấm phẩy
        if (parts.length == 9) {
            int maNhanVien = Integer.parseInt(parts[0]);
            long sdt = Long.parseLong(parts[1]);
            double luong = Double.parseDouble(parts[2]);
            double luongCung = Double.parseDouble(parts[3]);
            double hoaHong = Double.parseDouble(parts[4]);
            double doanhSoBanHang = Double.parseDouble(parts[5]);
            String hoTen = parts[6];
            String phai = parts[7];
            String chucVu = parts[8];

            return new NhanVienBanHang(maNhanVien, sdt, luong, luongCung, hoaHong, doanhSoBanHang, hoTen, phai, chucVu);


        }
        return null;
    }
    // Hàm chuyển dòng văn bản thành đối tượng NhaCungCap
    private NhanVienQLy parseLineToNhanVienQLy(String line) {
        String[] parts = line.split(";"); // Giả sử dữ liệu được phân tách bằng dấu chấm phẩy
        if (parts.length == 9) {
            int maNhanVien = Integer.parseInt(parts[0]);
            long sdt = Long.parseLong(parts[1]);
            double luong = Double.parseDouble(parts[2]);
            double luongCung = Double.parseDouble(parts[3]);
            double hoaHong = Double.parseDouble(parts[4]);
            double soLuongHopDongDaKy = Double.parseDouble(parts[5]);
            String hoTen = parts[6];
            String phai = parts[7];
            String chucVu = parts[8];

            return new NhanVienQLy(maNhanVien, sdt, luong, luongCung, hoaHong, soLuongHopDongDaKy, hoTen, phai, chucVu);


        }
        return null;
    }

    // Hàm chuyển đối tượng NhaCungCap thành dòng văn bản
    private String parseNhanVienToLine(NhanVien nhanvien) {
        return nhanvien.getMaNhanVien() + ";"
                +nhanvien.getHoTen() + ";"
                +nhanvien.getPhai() +";"
                +nhanvien.getSdt()  + ";"
                +nhanvien.getChucVu() + ";"
                +nhanvien.getLuong() ;
    }
}
