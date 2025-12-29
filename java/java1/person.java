package java1;

// Parent Class (Superclass)
public class person {
    // ใช้ "protected" แทน "private"
    // (เราจะเจาะลึกใน Part 2, ตอนนี้ให้รู้ว่า "ลูก" ใช้ได้)
    protected String name;
    protected String email;

    public person(String name ,String email){
        System.out.println("[Person Constructor] is running...");
        this.name = name ;
        this.email = email;
    }

    public String getName(){
        System.out.println("getName is running...");
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void displayinfo(){
        System.out.printf("Name: %s | Email:%s \n",name,email);
    }
}
