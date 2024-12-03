package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

class QlySanPham {
    private Danhsachsp dssp;
    Scanner scanner = new Scanner(System.in);
    String tenFile = "SanPham.txt";
    String tenFile2 = "SanPham_full.txt";
    String tenFileNhaCungCap = "NhaCungCap.txt";
    Danhsachncc danhsachncc;
    // Thêm constructor để khởi tạo dsNhaCungCap từ dữ liệu có sẵn
    public QlySanPham() {
        danhsachncc = new Danhsachncc();
        danhsachncc.taiDSTuFile(tenFileNhaCungCap); // Tải danh sách nhà cung cấp từ file
        dssp = new Danhsachsp();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("1. Thêm Sản phẩm");
            System.out.println("2. Sửa thông tin Sản phẩm");
            System.out.println("3. Xóa Sản phẩm");
            System.out.println("4. Tìm kiếm Sản phẩm");
            System.out.println("5. Xem thông tin trong danh sách Sản Phẩm");
            System.out.println("6. Tải danh sách Sản phẩm từ file");
            System.out.println("7. Xuất danh sách Sản phẩm ra file");
            System.out.println("8. Quay trở về giao diện chính");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau khi đọc số

            switch (choice) {
                case 1:
                    dssp.themThongTin();
                    break;
                case 2:
                    dssp.suaThongTin();
                    break;
                case 3:
                    dssp.xoaThongTin();
                    break;
                case 4:
                    dssp.timKiemThongTin();
                    break;
                case 5:
                    dssp.xemThongTin();
                    break;
                case 6:
                    dssp.taiDanhSachTuFile(tenFile, danhsachncc);
                    break;
                case 7:
                    dssp.xuatDanhSachRaFile(tenFile2);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 8);
    }
}
