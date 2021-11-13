import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

public class ArraysAndFIles {
    public static void main(String[] args) throws IOException {
        int values[] = new int[10];

        int i= 0;

        File file = new File("values.txt");

        if(file.exists()){

            Scanner inputFile = new Scanner(file);
            
            while(inputFile.hasNext() && i<values.length){
                values[i] = inputFile.nextInt();
                i++;

            }
            inputFile.close();

            for (int j : values) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        else
        JOptionPane.showMessageDialog(null, "File not Found , sorry!!");
    }
    
}
