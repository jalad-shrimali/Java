import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1. for addition, 2. for subtraction, 3. for multiplication, 4. for division: ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(a + b);
            break;
            case 2:
                System.out.println(a - b);
            break;
            case 3:
                System.out.println( a * b);
            break;
            case 4:
                System.out.println((float) a / b);
            break;
            default:
                System.out.println("Wrong input chosen");
        }
    }
}
