package java1;
//Simple Inheritance 
public class main {
    public static void main(String[] args) {
        // 1. สร้าง Student
        Student student = new Student("John", "john@uni.edu", "S001");
        // 2. เรียก Method ที่ "สืบทอด" มาจาก Person
        student.displayinfo();
        //    (สามารถเรียก .getName(), .getEmail() ได้ด้วย)
        System.out.println("Name :"+student.getName());
        // 3. เรียก Method ของ "ตัวเอง"
        System.out.println("Student ID :"+student.getstdentId());
        System.out.println(); // (เว้นบรรทัด)
        //สร้าง Teacher
        Teacher teacher = new Teacher("Dr. Smith", "smith@uni.edu", "T001");
        // 5. เรียก Method ที่ "สืบทอด" มา
        teacher.displayinfo();
        // 6. เรียก Method ของ "ตัวเอง"
        System.out.println("Teacher ID: " + teacher.getTeacherID());
    }
}
