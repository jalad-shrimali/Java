import java.util.Scanner;

class Fibo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms:");
    int n = sc.nextInt();
    int a = 0, b = 1;
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      int sum = a + b;
      a = b;
      b = sum;
    }

    sc.close();
  }
}