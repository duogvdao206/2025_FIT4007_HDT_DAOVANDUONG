import java.io.Serializable;

// Lớp Student cần implements Serializable để có thể ghi/đọc từ file
public class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Giúp đảm bảo tính tương thích khi đọc file

    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
