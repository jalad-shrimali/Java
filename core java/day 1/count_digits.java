import java.util.Scanner;

class CountDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();// 123
    int count = 0;
    while (n != 0) {
      n = n / 10; // 123/10=12, 12/10, 1/10;
      count++;
    }

    System.out.println("The number of digits is: " + count);
    sc.close();
  }
}