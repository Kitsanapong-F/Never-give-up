package java.java4;
import java.util.ArrayList;
import java.util.Scanner;
public class arayylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList namelast = new ArrayList();
        namelast.add("frame");
        namelast.add("ton");
        namelast.add("beem");
        System.err.println("The Arraylist has"+namelast.size()+"objects stored in it");
        for(int i = 0 ; i<namelast.size() ;i++){
            System.err.println(namelast.get(i));
        }
    }
}
