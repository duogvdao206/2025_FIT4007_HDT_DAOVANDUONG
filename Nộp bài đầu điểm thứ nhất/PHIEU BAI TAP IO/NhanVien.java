import java.io.Serializable; // Phải import để dùng Serializable

// TODO 1: Cực kỳ quan trọng — thêm implements Serializable
public abstract class NhanVien implements Serializable {

    private static final long serialVersionUID = 1L; // đảm bảo tương thích khi lưu/đọc file

    protected String maNV;
    protected String ten;
    protected double luongCoBan;

    public NhanVien(String maNV, String ten, double luongCoBan) {
        this.maNV = maNV;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public abstract double tinhLuong();

    public String getTen() {
        return this.ten;
    }
}
