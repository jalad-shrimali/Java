import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int current_balance = 25000;
        while(true) {
            System.out.println("Select 1. for deposit, 2. for withdraw, 3. for balance check, 4. for exit");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter the amount to be deposit: ");
                    int deposit = sc.nextInt();
                    current_balance += deposit;
                    System.out.println(deposit + " amount is deposited to your main account and your current balance is: " + current_balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn: ");
                    int withdraw_amount = sc.nextInt();
                    if (withdraw_amount > current_balance) {
                        System.out.println("Cannot withdraw money!!");
                        break;
                    } else {
                        current_balance -= withdraw_amount;
                        System.out.println(withdraw_amount + " Amount withdrawn successfully, now current balance is: " + current_balance);
                    }
                    break;
                case 3:
                    System.out.println("Current Balance is: " + current_balance);
                    break;
                case 4:
                    System.out.println("Thank you for using our services!!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }
}
