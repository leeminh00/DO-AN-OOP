package QLyCuaHangPhuKienOtoXeMay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Danhsachncc {
    Scanner nhacungcap = new Scanner(System.in);
    private ArrayList<NhaCungCap> danhsncc;
    private static int mancctieptheo;
    public Danhsachncc() {
        danhsncc = new ArrayList<>();
    }
    public static int getMancctieptheo() {
        return mancctieptheo;
    }
    public static void setMancctieptheo(int mancctieptheo) {
        Danhsachncc.mancctieptheo = mancctieptheo;
    }

    public ArrayList<NhaCungCap> getDanhsncc() {
        return danhsncc;
    }
    public void setDs1(ArrayList<NhaCungCap> danhsncc) {
        this.danhsncc = danhsncc;
    }
    public void xemThongTin() {
        for(NhaCungCap nhacungcap : danhsncc) {
            nhacungcap.xuatThongTin();
        }
    }
    public void themThongTin() {
        System.out.println("Chọn loại nhà cung cấp (1 - Trong nước, 2 - Ngoài nước): ");
        int choice = nhacungcap.nextInt();
        nhacungcap.nextLine();  // Đọc bỏ dòng mới

        NhaCungCap nhacungcap1 = null;

        if (choice == 1) {
            nhacungcap1 = new NhaCungCapTrongNuoc();
        } else if (choice == 2) {
            nhacungcap1 = new NhaCungCapNgoaiNuoc();
        }

        if (nhacungcap1 != null) {
            nhacungcap1.nhapThongTin();
            danhsncc.add(nhacungcap1);
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }
    public void suaThongTin() {
        System.out.println("Nhập tên Nhà cung cấp cần sửa: ");
        String tenCanSua = nhacungcap.nextLine();
        for(NhaCungCap nhacungcap : danhsncc) {
            if (nhacungcap.getTenNhaCungCap().equals(tenCanSua)) {
                // Gọi phương thức suaThongTin()
                nhacungcap.suaThongTin();
                System.out.println("Đã sửa thông tin của nhà cung cấp!");
                return;
            }
        }
        System.out.println("Không tìm thấy tài liệu cần sửa!");
    }
    public void xoaThongTin() {
        System.out.println("Nhập tên Nhà cung cấp cần xóa: ");
        String tenCanXoa = nhacungcap.nextLine();
        for (NhaCungCap nhacungcap : danhsncc) {
            if (nhacungcap.getTenNhaCungCap().equals(tenCanXoa)) {
                // Gọi phương thức xoa() của đối tượng tài liệu tương ứng
                danhsncc.remove(nhacungcap);
                System.out.println("Đã xóa nhà cung cấp!");
                return; // Kết thúc sau khi xóa
            }
        }
        System.out.println("Không tìm thấy nhà cung cấp cần xóa!");
    }
    public void timKiemThongTin() {
        System.out.println("Nhập tên Nhà cung cấp cần tìm kiếm: ");
        String find = nhacungcap.nextLine();
        boolean found = true;
        for (NhaCungCap nhacungcap : danhsncc) {
            if (nhacungcap.getTenNhaCungCap().contains(find)) {
                nhacungcap.xuatThongTin();
            }
            if (!found) {
                System.out.println("Không có nhà cung cấp tìm kiếm !");
            }
        }
    }
    public void taiDSTuFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Chuyển dòng văn bản thành đối tượng NhaCungCap và thêm vào danh sách
                NhaCungCap nhacungcap1 = parseLineToNhaCungCapTrongNuoc(line);
                if (nhacungcap1 != null) {
                    danhsncc.add(nhacungcap1);
                }
                // Chuyển dòng văn bản thành đối tượng NhaCungCap và thêm vào danh sách
                NhaCungCap nhacungcap2 = parseLineToNhaCungCapNgoaiNuoc(line);
                if (nhacungcap2 != null) {
                    danhsncc.add(nhacungcap2);
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
            for (NhaCungCap nhacungcap : danhsncc) {
                // Ghi đối tượng NhaCungCap thành dòng văn bản và xuống dòng
                writer.write(parseNhaCungCapToLine(nhacungcap));
                writer.newLine();
            }
            System.out.println("Đã xuất danh sách ra tệp tin: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Hàm chuyển dòng văn bản thành đối tượng NhaCungCap
    private NhaCungCapTrongNuoc parseLineToNhaCungCapTrongNuoc(String line) {
        String[] parts = line.split(";"); // Giả sử dữ liệu được phân tách bằng dấu chấm phẩy
        if (parts.length == 14) {
            int maNhaCungCap = Integer.parseInt(parts[0]);
            int soLanHopTac = Integer.parseInt(parts[1]);
            int maNhaCungCapTrongNuoc = Integer.parseInt(parts[2]);
            long soDienThoai = Long.parseLong(parts[3]);
            long maSoThue = Long.parseLong(parts[4]);
            long taiKhoanNganHang = Long.parseLong(parts[5]);
            long soDienThoaiNCCTrongNuoc = Long.parseLong(parts[6]);
            boolean daCungCapTruoc = Boolean.parseBoolean(parts[7]);
            String tenNhaCungCap = parts[8];
            String diaChi = parts[9];
            String vungMienDaiLy = parts[10];
            String giayPhepKinhDoanh = parts[11];
            String tenNhaCungCapTrongNuoc = parts[12];
            String diaChiNCCTrongNuoc = parts[13];



            return new NhaCungCapTrongNuoc(maNhaCungCap, soDienThoai, tenNhaCungCap, diaChi,
                    soLanHopTac, maSoThue, taiKhoanNganHang, daCungCapTruoc, vungMienDaiLy, giayPhepKinhDoanh, maNhaCungCapTrongNuoc
            , soDienThoaiNCCTrongNuoc, tenNhaCungCapTrongNuoc, diaChiNCCTrongNuoc);
        }
        return null;
    }

    private int maNhaCungCapTrongNuoc ;
    private String tenNhaCungCapTrongNuoc ;
    private String diaChiNCCTrongNuoc ;
    private long soDienThoaiNCCTrongNuoc ;
    // Hàm chuyển dòng văn bản thành đối tượng NhaCungCap
    private NhaCungCapNgoaiNuoc parseLineToNhaCungCapNgoaiNuoc(String line) {
        String[] parts = line.split(";"); // Giả sử dữ liệu được phân tách bằng dấu chấm phẩy
        if (parts.length == 10) {
            int maNhaCungCap = Integer.parseInt(parts[0]);
            int maNhaCungCapNgoaiNuoc = Integer.parseInt(parts[2]);
            long soDienThoai = Long.parseLong(parts[1]);
            long maSoThue = Long.parseLong(parts[2]);
            long taiKhoanNganHang = Long.parseLong(parts[3]);
            long soDienThoaiNCCNgoaiNuoc = Long.parseLong(parts[6]);
            double tyGiaHoiDoai = Double.parseDouble(parts[4]);
            String tenNhaCungCap = parts[5];
            String diaChi = parts[6];
            String quocGia = parts[7];
            String maSwift = parts[8];
            String loaiTienTe = parts[9];
            String tenNhaCungCapNgoaiNuoc = parts[12];
            String diaChiNCCNgoaiNuoc = parts[13];

            return new NhaCungCapNgoaiNuoc(maNhaCungCap, soDienThoai, tenNhaCungCap, diaChi,
                    maSoThue, taiKhoanNganHang, tyGiaHoiDoai, quocGia, maSwift, loaiTienTe, maNhaCungCapNgoaiNuoc,
                    soDienThoaiNCCNgoaiNuoc, tenNhaCungCapNgoaiNuoc, diaChiNCCNgoaiNuoc);
        }
        return null;
    }

    // Hàm chuyển đối tượng NhaCungCap thành dòng văn bản
    private String parseNhaCungCapToLine(NhaCungCap nhacungcap) {
        return nhacungcap.getMaNhaCungCap() + ";" + nhacungcap.getSoDienThoai()
                + ";" + nhacungcap.getTenNhaCungCap() + ";" + nhacungcap.getDiaChi();
    }
}
