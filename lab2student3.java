public class lab2student3 {
    private String masinhvien;
    private String hoten;
    private int namsinh;
    private String diachi;

    // Constructor không tham số
    public lab2student3() {
        this.masinhvien = "";
        this.hoten = "";
        this.namsinh = 0;
        this.diachi = "";
    }

    // Constructor có 2 tham số
    public lab2student3(String masinhvien, String hoten) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.namsinh = 0;  // Giá trị mặc định
        this.diachi = "";
    }

    // Constructor có đầy đủ tham số
    public lab2student3(String masinhvien, String hoten, int namsinh, String diachi) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diachi = diachi;
    }

    public String getMasinhvien() {
        return masinhvien;
    }
    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int tinhtuoisinhvien() {
        return 2025 - namsinh;
    }

    public void hienthisinhvien() {
        System.out.println("Ma sinh vien la: " + masinhvien);
        System.out.println("Ho ten sinh vien la: " + hoten);
        System.out.println("Nam sinh cua sinh vien la: " + namsinh);
        System.out.println("Dia chi cua sinh vien la: " + diachi);
    }
}
