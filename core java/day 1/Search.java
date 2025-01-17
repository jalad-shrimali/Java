import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 42, 2, 53, 56, 7, 13, 5, 23 };
        System.out.println("element to be searched:");
        int n = sc.nextInt();

        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==n){
                System.out.println("Element present at "+i);
                break;
            }
        }
    }
}
