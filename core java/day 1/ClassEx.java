class Calculate{
    public int add(int a, int b, int c){ // method initialization
        int res = a + b + c;
        return res;
    }
    // method overloading: when there are two methods but they have different parameters or different return-type
    public double add(double a, int b){
        return a+b;
    }
}
public class ClassEx{
    public static void main(String[] args){
    Calculate calc = new Calculate(); // creating object of a class
     double result = calc.add(12.2,2); // accessing methods of a class.
     System.out.println(result);
    }
}
