public class lab2mainbook2 {
    public static void main(String[] args){
        lab2book2 book = new lab2book2 ("DNU01","Lập trình",1000,5000);

        System.out.println("Thông tin quyển sách là:");
        book.hienthithontinsach();

        System.out.println("Giá bán của quyển sách là: "+ book.tinhgiaban());

        book.setgiamgia(1000);

        System.out.println("Thông tin của quyền sách sau khi thay đổi là: ");
        book.hienthithontinsach();
        System.out.println("Giá bán của quyền sách sau khi thay đổi là: " + book.tinhgiaban());
    }
}
