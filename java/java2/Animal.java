package java2;
// Parent Class
public class Animal {
    // 1. "ลูก" และ "เพื่อนบ้าน" ใช้ได้
    protected String name;
    // 2. "เฉพาะ" Class นี้เท่านั้น
    private String color;

    public Animal(String name , String color){
        
        this.name = name ;
        this.color = color;

    }
    // Method "ดั้งเดิม" (ที่ลูกจะไป Override)
    protected void makeSound(){
        System.out.println("Some sound...");
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);// (แม่(Parent) ใช้ private ของตัวเองได้)
    }
}
