package QLyCuaHangPhuKienOtoXeMay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Danhsachkh {
    Scanner khachhang = new Scanner(System.in);
    private ArrayList<KhachHang> danhskh;  // Thêm biến này để lưu trữ danh sách khách hàng
    private static int makhtieptheo;
    public Danhsachkh() {
        danhskh = new ArrayList<>();  // Khởi tạo danh sách khách hàng
    }

    public static int getMakhtieptheo() {
        return makhtieptheo;
    }

    public static void setMakhtieptheo(int makhtieptheo) {
        Danhsachkh.makhtieptheo = makhtieptheo;
    }

    public ArrayList<KhachHang> getdsKhachHang() {
        return danhskh;
    }

    public void setdsKhachHang(ArrayList<KhachHang> danhskh) {
        this.danhskh = danhskh;
    }

    public void xemThongTin() {
        for(KhachHang khachhang : danhskh) {
            khachhang.xuatThongTin();
        }
    }
    public void themThongTin() {
        System.out.println("Chọn loại khách hàng (2-Khách hàng Vip Pro, 1-Khách hàng bình thường):");
        int choice = khachhang.nextInt();
        khachhang.nextLine();
        KhachHang khachhang1 = null;

        if (choice == 1) {
            khachhang1 = new KhachHangBinhThuong();
        } else if (choice == 2) {
            khachhang1 = new KhachHangVipPro();
        }

        if (khachhang1 != null) {
            khachhang1.nhapThongTin();
            danhskh.add(khachhang1);
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }
    public void suaThongTin() {
        System.out.println("Nhập tên Khách hàng cần sửa: ");
        String tenCanSua = khachhang.nextLine();
        for(KhachHang khachhang : danhskh) {
            if (khachhang.getHoTenKhachHang().equals(tenCanSua)) {
                // Gọi phương thức suaThongTin()
                khachhang.suaThongTin();
                System.out.println("Đã sửa thông tin của nhân viên!");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên cần sửa!");
    }
    public void xoaThongTin() {
        System.out.println("Nhập tên Khách hàng cần xóa: ");
        String tenCanXoa = khachhang.nextLine();
        for(KhachHang khachhang : danhskh) {
            if (khachhang.getHoTenKhachHang().equals(tenCanXoa)) {
                // Gọi phương thức xoaThongTin()
                danhskh.remove(khachhang);
                System.out.println("Đã xóa khách hàng!");
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng cần xóa!");
    }
    public void timKiemThongTin() {
        System.out.println("Nhập tên Khách hàng cần tìm kiếm: ");
        String find = khachhang.nextLine();
        boolean found = true;
        for(KhachHang khachhang : danhskh) {
            if (khachhang.getHoTenKhachHang().contains(find)) {
                khachhang.xuatThongTin();
            }
            if (!found) {
                System.out.println("Không có khách hàng tìm kiếm !");
            }
        }
    }
    public void taiDSTuFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Chuyển dòng văn bản thành đối tượng KhachHang và thêm vào danh sách ds3
                KhachHang khachhang1 = parseLineToKhachHangBinhThuong(line);
                if (khachhang1 != null) {
                    danhskh.add(khachhang1);  // Thêm vào danh sách danhskh
                }
                // Chuyển dòng văn bản thành đối tượng KhachHang và thêm vào danh sách ds3
                KhachHang khachhang2 = parseLineToKhachHangVipPro(line);
                if (khachhang2 != null) {
                    danhskh.add(khachhang2);  // Thêm vào danh sách danhskh
                }
            }
            System.out.println("Đã tải danh sách từ tệp tin: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp tin: " + fileName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void xuatDSRaFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for(KhachHang khachhang : danhskh) {
                // Ghi đối tượng NhaCungCap thành dòng văn bản và xuống dòng
                writer.write(parseKhachHangToLine(khachhang));
                writer.newLine();
            }
            System.out.println("Đã xuất danh sách ra tệp tin: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Hàm chuyển dòng văn bản thành đối tượng NhaCungCap
    private KhachHangBinhThuong parseLineToKhachHangBinhThuong(String line) {
        String[] parts = line.split(";"); // Giả sử dữ liệu được phân tách bằng dấu chấm phẩy
        if (parts.length == 6) {
            int maKhachHang = Integer.parseInt(parts[0]);
            int soLanMuaHang = Integer.parseInt(parts[1]);
            long sdtKhachHang = Long.parseLong(parts[2]);
            double tongChiTieu = Double.parseDouble(parts[3]);
            String hoTenKhachHang = parts[4];
            String phaikh = parts[5];
            String email = parts[6];

            return new KhachHangBinhThuong(maKhachHang, sdtKhachHang, hoTenKhachHang,
                    phaikh, email, soLanMuaHang, tongChiTieu);
        }
        return null;
    }

    // Hàm chuyển dòng văn bản thành đối tượng NhaCungCap
    private KhachHangVipPro parseLineToKhachHangVipPro(String line) {
        String[] parts = line.split(";"); // Giả sử dữ liệu được phân tách bằng dấu chấm phẩy
        if (parts.length == 6) {
            int maKhachHang = Integer.parseInt(parts[0]);
            int soLanMuaHang = Integer.parseInt(parts[1]);
            long sdtKhachHang = Long.parseLong(parts[2]);
            double tongChiTieu = Double.parseDouble(parts[3]);
            double mucUuDai = Double.parseDouble(parts[4]);
            String hoTenKhachHang = parts[5];
            String phaikh = parts[6];
            String email = parts[7];
            String capDoUuDai = parts[8];

            return new KhachHangVipPro(maKhachHang, sdtKhachHang, hoTenKhachHang,
                    phaikh, email, soLanMuaHang, tongChiTieu, mucUuDai, capDoUuDai);
        }
        return null;
    }

    // Hàm chuyển đối tượng NhaCungCap thành dòng văn bản
    private String parseKhachHangToLine(KhachHang khachhang) {
        return khachhang.getMaKhachHang() + ";" + khachhang.getSdtKhachHang()
                + ";" + khachhang.getHoTenKhachHang() + ";" + khachhang.getPhaikh()
                + ";" + khachhang.getEmail();
    }
    public KhachHang timKiemKhachHangTheoMa(int maKhachHang) {
        for (KhachHang khachhang : danhskh) {
            if (khachhang.getMaKhachHang() == maKhachHang) {
                return khachhang;
            }
        }
        return null;
    }
}

