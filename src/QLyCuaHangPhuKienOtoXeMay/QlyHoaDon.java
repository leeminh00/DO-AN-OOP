package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

class QlyHoaDon {
    private Danhsachhđ dshd;
    Scanner scanner = new Scanner(System.in);
    String fileName = "HoaDon.txt";
    String fileName2 = "HoaDon_full.txt";
    String fileNameKhachHang = "KhachHang.txt";
    String fileNameSanPham = "SanPham.txt";
    String fileNameNhaCungCap = "NhaCungCap.txt";
    Danhsachkh dsKhachHang;
    Danhsachsp dsSanPham;
    Danhsachncc dsNhaCungCap;
    // Thêm constructor để khởi tạo dsKhachHang từ dữ liệu có sẵn
    public QlyHoaDon() {
        dsKhachHang = new Danhsachkh();
        dsKhachHang.taiDSTuFile(fileNameKhachHang); // Tải danh sách khách hàng từ file
        dsSanPham = new  Danhsachsp();
        dshd = new Danhsachhđ();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("1. Thêm Hóa đơn");
            System.out.println("2. Sửa thông tin Hóa đơn");
            System.out.println("3. Xóa Hóa đơn");
            System.out.println("4. Tìm kiếm Hóa đơn");
            System.out.println("5. Xem thông tin trong danh sách Hóa đơn");
            System.out.println("6. Tải danh sách Hóa đơn từ file");
            System.out.println("7. Xuất danh sách Hóa đơn ra file");
            System.out.println("8. Quay trở về giao diện chính");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau khi đọc số

            switch (choice) {
                case 1:
                    dshd.themThongTin();
                    break;
                case 2:
                    dshd.suaThongTin();
                    break;
                case 3:
                    dshd.xoaThongTin();
                    break;
                case 4:
                    dshd.timKiemThongTin();
                    break;
                case 5:
                    dshd.xemThongTin();
                    break;
                case 6:
                    dshd.taiDSTuFile(fileName, dsKhachHang, dsSanPham);
                    break;
                case 7:
                    dshd.xuatDSRaFile(fileName2);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 8);
    }
}

