import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthDesktopIconUI;

import org.w3c.dom.ls.LSException;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {
        
        File file = new File("outputfile.txt");

        if(file.exists()){
                 Scanner inputfile = new Scanner(System.in);
                
                 while(inputfile.hasNext()){
                     System.out.println(inputfile.nextLine());
                 }

                 inputfile.close();
        }
        else
             JOptionPane.showMessageDialog(null, "the file doesnt exist ");


    }
    
}
