import javax.swing.JOptionPane;

public class SentineValues {
    public static void main(String[] args) {
        int value;
        int doublevalue;

        String input = JOptionPane.showInputDialog("please enter a no to double "+"(0 to stop)");// 0 here is the sentinel value , to stop the code from running

        value = Integer.parseInt(input);
        while(value != 0){
            doublevalue = value*2 ;
            JOptionPane.showMessageDialog(null,""+value+" doubled is " +doublevalue);

            input = JOptionPane.showInputDialog("Enter a number to double "+"(0 to stop)");
            value = Integer.parseInt(input);
        }
        System.exit(0);
    }
        
}
