import java.util.Scanner;

class Swap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping: " + a + " " + b);
    sc.close();
  }
}