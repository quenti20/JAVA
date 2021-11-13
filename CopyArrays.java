public class CopyArrays {
    public static void main(String[] args) {
        
        int ar1[]= {3,4,6,8};
        int ar2[] = new int[ar1.length];

        for(int i = 0;i<ar1.length;i++)
        ar2[i] = ar1[i];
        
        ar1[2] = 9;
        printArray(ar1);
        printArray(ar2);

    }

    public static void printArray(int a[]){
        for(int val : a)
        System.out.print(val+" ");
          System.out.println();
        
    }
    
}
