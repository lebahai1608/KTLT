package nguyenthikimyen;

public class Buoi3 {
    public static String gioiTinh(boolean gt) {
        return gt? "NAM":"NỮ";
    }
public static void main(String[] args) {
    String maSinhVien = "110451", hoVaTen = "Lê Bá Hải", ngaySinh = "16/08/2006", lop = "GD24A", khoa = "Mĩ thuật ứng dụng", diaChi = "Đà Nẵng";
    int tuoi = 18;
    boolean gt = false;
    System.out.println("-----THÔNG TIN SINH VIÊN-----");
    System.out.println("Mã sinh viên: " + maSinhVien);
    System.out.println("Họ và tên: " + hoVaTen);
    System.out.println("Ngày sinh: " + ngaySinh);
    System.out.println("Tuổi: " + tuoi);
    System.out.println("Giới tính: " + gioiTinh(gt));
    System.out.println("Lớp: " + lop);
    System.out.println("Khoa: " + khoa);
    System.out.println("Địa chỉ: " + diaChi);
    System.out.println("-----HẾT-----");
}    
}
