import java.util.Scanner;

class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter limit: ");
    int n = sc.nextInt();
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
    sc.close();
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}