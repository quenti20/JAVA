import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class RunningTotals {
    public static void main(String[] args) {
        int days;
          double sales;
          double totalsales = 0.0; // running totals 

          String input = JOptionPane.showInputDialog("for how many days there is a sale ");
          days = Integer.parseInt(input);

          DecimalFormat dolar = new DecimalFormat("#,##0.000");
                                                //# -> if there is a no, show it otheriwse dont show anything , 0-> if there is a no, show it other wise show zero , or if there are less 0's , round it off 
        
          for(int count = 1;count<= days;count++){
              input = JOptionPane.showInputDialog("Enter the sales for the day\t"+count);
              sales = Double.parseDouble(input);
              totalsales += sales ;
          }
          JOptionPane.showMessageDialog(null, "total sales for the given days are Rs. "+dolar.format(totalsales));

    }
    
}

