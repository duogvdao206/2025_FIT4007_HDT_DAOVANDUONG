
public class lab2maincircle4 {
    public static void main(String[] args) {
        // Tạo hình tròn mặc định
        Circle c1 = new Circle();
        c1.Output();

        // Nhập bán kính mới
        Circle c2 = new Circle();
        c2.Input();
        c2.Output();

        // In diện tích và chu vi
        System.out.println("Dien tich hinh tron = " + c2.dienTich());
        System.out.println("Chu vi hinh tron = " + c2.chuVi());
    }
}