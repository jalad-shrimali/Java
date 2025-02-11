import java.util.Scanner;

class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        System.out.println(n + " is not a prime number");
        return;
      } else {
        System.out.println(n + " is a prime number");
        return;
      }
    }
    sc.close();
  }
}

// corrected version
// import java.util.Scanner;

// class Prime {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number: ");
// int n = sc.nextInt();
// boolean isPrime = true;

// if (n <= 1) {
// isPrime = false;
// } else {
// for (int i = 2; i <= n / 2; i++) {
// if (n % i == 0) {
// isPrime = false;
// break;
// }
// }
// }

// if (isPrime) {
// System.out.println(n + " is a prime number");
// } else {
// System.out.println(n + " is not a prime number");
// }

// sc.close();
// }
// }