package QLyCuaHangPhuKienOtoXeMay;

import java.util.Scanner;

// Lớp chính để chạy chương trình
public class QlyCuaHangPhuKien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int select;
        do {
            System.out.println("Menu:");
            System.out.println("1. Quản lý Nhà cung cấp");
            System.out.println("2. Quản lý Nhân viên");
            System.out.println("3. Quản lý Khách hàng");
            System.out.println("4. Quản lý Sản phẩm");
            System.out.println("5. Quản lý Hóa đơn");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn: ");
            select = in.nextInt();
            in.nextLine();

            switch (select) {
                case 1:
                    QlyNhaCungCap ql1 = new QlyNhaCungCap();
                    ql1.menu();
                    break;
                case 2:
                    QlyNhanVien ql2 = new QlyNhanVien();
                    ql2.menu();
                    break;
                case 3:
                    QlyKhachHang ql3 = new QlyKhachHang();
                    ql3.menu();
                    break;
                case 4:
                    QlySanPham ql4 = new QlySanPham();
                    ql4.menu();
                    break;
                case 5:
                    QlyHoaDon ql5 = new QlyHoaDon();
                    ql5.menu();
                    break;
                case 6:
                    System.out.println("Thoát hẳn chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (select != 6);
    }
}





