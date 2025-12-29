package java2;

public class Dog  extends Animal{
    
    private String breed; //"เฉพาะ" Class นี้เท่านั้น

    public Dog(String name ,String color ,String breed){
        super(name, color); // <-- เรียกแม่
        this.breed = breed;
    }

    @Override  // "เขียนทับ" (Override) พฤติกรรมของแม่
    protected void makeSound(){
         System.out.println("Woof! Woof!");
    }

     public void dogInfo() {
        // ✓ "ลูก" (Dog) เข้าถึง "protected" (name) ของ "แม่" (Animal) ได้
         System.out.println("Dog's Name: " + this.name);
        // ❌ "ลูก" (Dog) "ไม่" สามารถเข้าถึง "private" (color) ของ "แม่" (Animal) ได้
        // System.out.println("Dog's Color: " + this.color); // <-- ERROR!
        System.out.println("Breed: " + this.breed);
    }
}