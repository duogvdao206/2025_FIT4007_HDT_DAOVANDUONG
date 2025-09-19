public class lab2mainaccount1 {
    public static void main(String[] args){
        lab2account1 acc = new lab2account1("KH1234",800000);
        
    System.out.println("Thông tin ban đầu: ");
    acc.hienthisotien();

    acc.setsotien(8000);

    System.out.println("Thông tin sau khi thay đổi là:");
    acc.hienthisotien();
    }
}
