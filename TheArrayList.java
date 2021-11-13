import java.util.*;
public class TheArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        names.add("james");
        names.add("Shrestha");
        names.add("Avik");
        names.add("Somesh");
        names.add("foru");
        names.remove(0);

        for(int i = 0;i<names.size();i++){
            System.out.print(names.get(i)+" ");
        }
        System.out.println();
    }
    
}
