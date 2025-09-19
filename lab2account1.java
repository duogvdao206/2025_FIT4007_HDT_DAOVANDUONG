public class lab2account1 {
    private String idaccount;
    private double sotien;

    public lab2account1(String idaccount,double sotien){
        this.idaccount = idaccount;
        this.sotien = sotien;
    }
    public String getidaccount(){
        return idaccount;
    }
    public void setidaccount(String idaccount){
        this.idaccount = idaccount;
    }
    public double getsotien() {
        return sotien;
    }
    public void setsotien(double sotien){
        this.sotien = sotien;
    }
    public void hienthisotien(){
        System.out.println("Mã số tài khoản: " + idaccount);
        System.out.println("Số tiền trong tài khoản: "+ sotien);
    }
}

