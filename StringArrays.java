public class StringArrays {
    public static void main(String[] args) {
        
        String names[] = getnames();
        
        for (String val : names) {
            System.out.println(val);
        }
        System.out.println();

        for(int i = 0;i<names.length;i++){
            
            // handling nullPointerException
            
            if(names[i] != null)
            System.out.print(names[i].charAt(0)+" ");
        }
        System.out.println();

    }
    
    public static String [] getnames(){

        String names[] = new String[6];
        //names[0] = "Peter";
        names[1]= "John";
        names[2] = "Simon";
        names[3] = "Paul";
        names[4] = "Avik" ;
        names[5] = "Shrestha" ;

       return names;

    } 
}
