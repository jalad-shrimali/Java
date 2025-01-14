import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Logical operators are used in if else condition that returns value in boolean format and they are &&, || and !
        boolean res1 = (x>y)&&(y>0);
        boolean res2 = (x>y)||(y>1);
        boolean res3 = !(x==y);

        System.out.println("&& is true if both conditions are true: "+res1);
        System.out.println("|| is true if either of conditions are true: "+res2);
        System.out.println("! is is used to check if condition is false: "+res3);
    }
}