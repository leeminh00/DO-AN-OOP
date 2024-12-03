package QLyCuaHangPhuKienOtoXeMay;


import java.util.Scanner;

class QlyNhaCungCap {
    private Danhsachncc dsncc;
    Scanner scanner = new Scanner(System.in);
    String fileName = "NhaCungCap.txt";
    public QlyNhaCungCap() {
        dsncc = new Danhsachncc();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("1. Thêm Nhà cung cấp");
            System.out.println("2. Sửa thông tin Nhà cung cấp");
            System.out.println("3. Xóa Nhà cung cấp");
            System.out.println("4. Tìm kiếm Nhà cung cấp");
            System.out.println("5. Xem thông tin trong danh sách Nhà cung cấp");
            System.out.println("6. Tải danh sách Nhà cung cấp từ file");
            System.out.println("7. Xuất danh sách Nhà cung cấp ra file");
            System.out.println("8. Quay trở về giao diện chính");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau khi đọc số

            switch (choice) {
                case 1:
                    dsncc.themThongTin();
                    break;
                case 2:
                    dsncc.suaThongTin();
                    break;
                case 3:
                    dsncc.xoaThongTin();
                    break;
                case 4:
                    dsncc.timKiemThongTin();
                    break;
                case 5:
                    dsncc.xemThongTin();
                    break;
                case 6:
                    dsncc.taiDSTuFile(fileName);
                    break;
                case 7:
                    dsncc.xuatDSRaFile(fileName);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 8);
    }
}

