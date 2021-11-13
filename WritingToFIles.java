import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFIles {
    public static void main(String[] args) throws IOException {
        
        //create the file and opens the file 
        // if the file exists it will replace the file 
        PrintWriter outputfile = new PrintWriter("outputfile.txt");
        outputfile.println("This is line 1");        
        outputfile.println("This is line 2");
        outputfile.println("This is Line 3");

        outputfile.close();
    }
    
}
