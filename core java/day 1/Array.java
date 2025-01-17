import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n:");
//        int n = sc.nextInt();

        // Array are homogenous mixture of elements, it can have elements of one data
        // type only.
//        int arr[] = new int[n];
//        System.out.println("Enter elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        // Accessing elements using loop:
        // for(int i=0;i<n;i++){
        // System.out.println("ellements in array are: "+ arr[i]);
        // }
        // to print array, we have to use Arrays.toString() method
        // System.out.print(Arrays.toStringng(arr));

//        System.out.println("Reveres order is: ");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.println(arr[i]);
//        }

        // array of objects
//        String[] str = new String[6];
//        System.out.println("enter strings");
//        for(int i=0;i<str.length;i++){
//            // for input-ing string, we use .next();
//            str[i] = sc.next();
//        }
//        System.out.println(Arrays.toString(str));


        // 2D arrays
        /*
        1 2 3
        4 5 6
        7 8 9
         */
//        int[][] two_D = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        //input a 2d array
        int[][] arr = new int[3][3];
        System.out.println("input");
        for(int row = 0; row < arr.length; row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        //output a two d array
        System.out.println("output");
        for(int row = 0; row< arr.length;row++){
            for (int col = 0; col<arr[row].length;col++){
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
