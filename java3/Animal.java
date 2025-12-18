package java3;
public class Animal {
    
    protected String name;

    public Animal(String name) {
        System.out.println("1. Animal Constructor (ปู่)");
        this.name = name;
    }
    public void eat() { System.out.println(name + " is eating"); }
}
