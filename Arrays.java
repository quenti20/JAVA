public class Arrays {
    public static void main(String[] args) {
        
        int numbers[] = new int[10];
        int numbers2[] = new int[10];
         
        /*
        Both the lines written below mean the same thing 
        just different syntax.
        */
        int [] numbers3,numbers4,numbers5;
        int numbers6 [],numbers7 [],numbers8[];

        int  numbers9[] = {4,5,6,7};

        for(int i = 0;i<numbers9.length;i++)
        System.out.println(numbers9[i]);

        System.out.println("\n");

        for (int it : numbers9) {
             System.out.println(it);
        }
    }

}
