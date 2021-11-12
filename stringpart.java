import javax.swing.JOptionPane;

public class stringpart {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("enter name one ");
        String name2 = JOptionPane.showInputDialog("enter name two " );

        if(name.equals(name2)){
            JOptionPane.showMessageDialog(null,"name one is equal to name2" );
        }
        else
        JOptionPane.showMessageDialog(null, "the names arent same");
       
        if(name.compareTo(name2)== 0){
            JOptionPane.showMessageDialog(null,"name one is equal to name2" );
        }
        else if(name.compareTo(name2)< 0){
            JOptionPane.showMessageDialog(null,"name one is first and name2 is second " );
        }
        else if(name.compareTo(name2) > 0)
         {
             JOptionPane.showMessageDialog(null, "name two is first and name one is second");
         }
         
        else
        JOptionPane.showMessageDialog(null, "the names arent same");

    }
}
