package java3;
// Level 2: (พ่อ) extends ปู่
public class Mammal extends Animal {

    protected String furColor;

    public Mammal(String name, String furColor) {
        super(name); // <-- เรียก "ปู่" (Animal)
        System.out.println("2. Mammal Constructor (พ่อ)");
        this.furColor = furColor;
    }

    public void sleep() { System.out.println(name + " is sleeping"); }
}