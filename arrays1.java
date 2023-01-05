import java.util.Scanner;
public class arrays1 {
    public static void main(String[] args) {
        //creating an array
        double[] arr1 = new double[10];
        //for (int i = 0 ; i < 10 ; i++){
           // System.out.println(arr1[i] + " arr1");
        //}
        //referencing one array ti the another with same reference
        //double[] arr2 = arr1;
       // for (int i = 0 ; i < 10 ; i++) {
         //   System.out.println(arr1[i] + " arr2");
        //}
        //taking input for a partially filled array
        int currentsize = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()){
            if (currentsize < arr1.length)
            {
                arr1[currentsize] = in.nextDouble();
                currentsize++;
            }
            for (int i = 0 ; i < currentsize ; i++){
                System.out.println(arr1[i] + " arr1");
            }
        }
    }
}
