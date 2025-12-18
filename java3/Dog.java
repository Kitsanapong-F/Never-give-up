package java3;
// Level 3: (ลูก) extends พ่อ
public class Dog extends Mammal {
    private String breed;
    public Dog(String name, String furColor, String breed) {
        super(name, furColor); // <-- เรียก "พ่อ" (Mammal)
        System.out.println("3. Dog Constructor (ลูก)");
        this.breed = breed;
    }
    public void bark() { System.out.println(name + " says: Woof!"); }
}
