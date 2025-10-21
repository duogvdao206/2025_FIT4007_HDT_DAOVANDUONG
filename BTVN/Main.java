package BTVN;
public class Main {

    // Phương thức generic để tìm phần tử lớn nhất
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null; // Trả về null nếu mảng rỗng
        }

        T max = array[0]; // Giả sử phần tử đầu tiên là lớn nhất

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) { // So sánh với phần tử hiện tại
                max = array[i]; // Cập nhật max
            }
        }

        return max; // Trả về phần tử lớn nhất
    }

    public static void main(String[] args) {
        // Ví dụ với mảng số nguyên
        Integer[] numbers = {10, 5, 30, 20};
        System.out.println("Max của mảng numbers: " + findMax(numbers));

        // Ví dụ với mảng chuỗi
        String[] words = {"apple", "orange", "banana"};
        System.out.println("Max của mảng words: " + findMax(words));
    }
}
