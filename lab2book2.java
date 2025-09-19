public class lab2book2 {
    private String masach;
    private String tensach;
    private double giasach;
    private double giamgia;

    public lab2book2(String masach, String tensach){
        this.masach = masach;
        this.tensach = tensach;
        this.giasach = 0;
        this.giamgia = 0;
    }
    public lab2book2(String masach, String tensach,double giasach, double giamgia){
    this.masach = masach;
    this.tensach = tensach;
    this.giasach = giasach;
    this.giamgia = giamgia;
    }

    public String getmasach(){
        return masach;
    }
    public void setmasach(String masach){
        this.masach = masach;
    }

    public String gettensach(){
        return tensach;
    }
    public void settensach(String tensach){
        this.tensach = tensach;
    }

    public double getgiasach(){
        return giasach;
    }
    public void setgiasach(double giasach){
        this.giasach = giasach;
    }

    public double getgiamgia(){
        return giamgia;
    }
    public void setgiamgia(double giamgia){
        this.giamgia = giamgia;
    }

    public double tinhgiaban(){
        return giasach - giamgia;
    }
    public void hienthithontinsach(){
        System.out.println("Mã số sách là: "+ masach);
        System.out.println("Tên sách là: "+ tensach);
        System.out.println("Giá sách là: "+ giasach);
        System.out.println("Giảm giá: "+ giamgia);
    }

}
