import javax.swing.JOptionPane;

import javax.swing.*;
public class ReadjoptionPane {
    public static void main(String[] args) {
        String name,surname;
        
        name = JOptionPane.showInputDialog("Please enter your name: ");
        surname = JOptionPane.showInputDialog("Please enter your surname " );
        JOptionPane.showMessageDialog(null, name+" "+surname);

        int firstnumber;
        double seconnumber;
         String numberinput;

        numberinput = JOptionPane.showInputDialog("Enter a number ");
        firstnumber = Integer.parseInt(numberinput);

        numberinput = JOptionPane.showInputDialog("Enter the second number");
        seconnumber = Double.parseDouble(numberinput);

        double avg = (firstnumber+seconnumber)/2.0;
        JOptionPane.showMessageDialog(null,"average "+avg );
        


    }
    
}
