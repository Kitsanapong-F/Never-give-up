package java2;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Brown", "Golden Retriever");
        // 1. เรียก Method จาก "แม่" (Animal)
        dog.display();
        System.out.println("---");
        // 2. เรียก Method จาก "ลูก" (Dog)
        dog.dogInfo();
        System.out.println("---");
        // 3. เรียก Method ที่ถูก "ทับ" (Overridden)
        //    (Java จะเรียก .makeSound() ของ "ลูก" (Dog) เสมอ)
        dog.makeSound();
    }
}
