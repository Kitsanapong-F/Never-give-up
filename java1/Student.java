package java1;

// Child Class 1
public class Student extends person {
    // <-- (Student "มี" name และ email ซ่อนอยู่ โดยอัตโนมัติ)
    // เพิ่มเฉพาะ field ที่ "จำเป็น" สำหรับ Student
    private String studentID;

    public Student(String name , String email , String stdentId ){
        // <-- "สำคัญ!" ต้องเรียก Constructor ของ "แม่" (Person)
        //    เพื่อส่ง name และ email ขึ้นไปให้แม่ตั้งค่า
        super(name, email);
        System.out.println("Student Constructor");
        this.studentID = stdentId;

    }

    public String getstdentId(){
        return this.studentID;
    }
    // <-- (Student "มี" displayInfo() ที่สืบทอดมา โดยอัตโนมัติ)
}
