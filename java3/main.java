package java3;
//Multi-level Inheritance
public class main {
    public static void main(String[] args) {
        System.out.println("Creating Dog...");
        Dog dog = new Dog("Rex", "Black", "Husky");
        System.out.println("Dog created.\n");
        
        // "Dog" สามารถใช้ Method
        // ได้จากทุกระดับที่สืบทอดมา
        
        // 1. จาก Animal (ปู่)
        dog.eat();
        
        // 2. จาก Mammal (พ่อ)
        dog.sleep();
        
        // 3. จาก Dog (ตัวเอง)
        dog.bark();
    }
}
