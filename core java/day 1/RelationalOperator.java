import java.util.Scanner;
public class RelationalOperator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Relational operators are used to compare variables and they have boolean return type i.e. true or false
        System.out.println("if x is equals to y: "+ (x==y));
        System.out.println("if x is not equals to y: "+ (x!=y));
        System.out.println("if x is greater than y: "+ (x>=y));
        System.out.println("if x is lesser than y: "+ (x<=y));
    }
}
