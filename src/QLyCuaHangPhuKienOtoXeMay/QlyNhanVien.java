package QLyCuaHangPhuKienOtoXeMay;


import java.util.Scanner;

class QlyNhanVien {
    private Danhsachnv dsnv;
    Scanner scanner = new Scanner(System.in);
    String fileName = "NhanVien.txt";
    public QlyNhanVien() {
        dsnv = new Danhsachnv();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("1. Thêm Nhân viên");
            System.out.println("2. Sửa thông tin Nhân viên");
            System.out.println("3. Xóa Nhân viên");
            System.out.println("4. Tìm kiếm Nhân viên");
            System.out.println("5. Xem thông tin trong danh sách Nhân viên");
            System.out.println("6. Tải danh sách Nhân viên từ file");
            System.out.println("7. Xuất danh sách Nhân viên ra file");
            System.out.println("8. Quay trở về giao diện chính");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau khi đọc số

            switch (choice) {
                case 1:
                    dsnv.themThongTin();
                    break;
                case 2:
                    dsnv.suaThongTin();
                    break;
                case 3:
                    dsnv.xoaThongTin();
                    break;
                case 4:
                    dsnv.timKiemThongTin();
                    break;
                case 5:
                    dsnv.xemThongTin();
                    break;
                case 6:
                    dsnv.taiDanhSachTuFile(fileName);
                    break;
                case 7:
                    dsnv.xuatDanhSachRaFile(fileName);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại.");
            }
        } while (choice != 8);
    }
}

