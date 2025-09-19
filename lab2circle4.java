import java.util.Scanner;

class Circle {
    private double r;

    // Constructor mặc định
    public Circle() {
        this.r = 1;
    }

    // Constructor có tham số
    public Circle(double r) {
        this.r = r;
    }

    // Getter
    public double getR() {
        return r;
    }

    // Setter
    public void setR(double r) {
        this.r = r;
    }

    // Nhập bán kính
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        this.r = sc.nextDouble();
        sc.close();
    }

    // Xuất thông tin
    public void Output() {
        System.out.println("Thong tin hinh tron:");
        System.out.println("Ban kinh r = " + r);
    }

    // Tính diện tích
    public double dienTich() {
        return Math.PI * r * r;
    }

    // Tính chu vi
    public double chuVi() {
        return 2 * Math.PI * r;
    }

}