import java.util.Scanner;

class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int temp = n;
    int r = 0;
    while (n != 0) {
      int dig = n % 10;
      r = r * 10 + dig;
      n /= 10;
    }
    if (temp == r) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
    sc.close();
  }
}