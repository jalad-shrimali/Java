import java.util.Scanner;
class Operators {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter x and y: ");
        int x= sc.nextInt();
        int y = sc.nextInt();
        int add = x+y;
        System.out.println("Additional operator is x+y: "+ add);
        int sub = x-y;
        System.out.println("Substract is x-y: "+ sub);
        int multi = x*y;
        System.out.println("Multiplicational operator is x*y: "+ multi);
        double div = (double) x / y;
        System.out.println("Divisional operator is x/y: "+ div);
        int mod = x%y;
        System.out.println("Modulus operator is x%y: "+ mod);
    }
}
