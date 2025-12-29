package java1;

public class Teacher extends person {
    private String teacherID;
    
    public Teacher(String name, String email, String teacherID) {
        // <-- เรียก "แม่" (Person) ก่อนเสมอ
        super(name, email);
        System.out.println("Teacher Constructor");
        this.teacherID = teacherID;

    }
    
    public String getTeacherID() {
        return this.teacherID;
    }
}
