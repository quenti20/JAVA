import javax.swing.JOptionPane;

public class InputValidation {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter a number in the range 1 to 1000");
         
        int number = Integer.parseInt(input);

        while(number<1 || number>1000){// loop control variable , in some way we must change the loop control variable

            JOptionPane.showMessageDialog(null, "Enter valid no b/w 1 to 1000");
            input = JOptionPane.showInputDialog("Enter the valid no");
            number = Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "correct");
    }
    
}


