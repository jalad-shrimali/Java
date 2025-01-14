public class IncrementDecrement {
    public static void main(String[] args){
        int x = 5;
        int j =8;
        int y = 6;
        int z = j-- + (--j)+ (j--)+ (--j);
        int k = --j -(j--)+ (--j)+ j--;
        System.out.println(k);
        int i =10;
        int f = 20;
        int m = i++ + (++f); //10+21=31
        //System.out.println("i: "+i+", f: "+f+", m: "+m); //11;21;31
        //increment x++ and ++x;
        //x++ uses x first and then increments it
        //++x increments x first and then uses it
        //y-- uses y first and then decrements it
        //--y decrements y first and then uses it
//        System.out.println("x++: " + (x++));  // Post-increment: uses x first, then increments
//        System.out.println("++y: " + (++y));  // Pre-increment: increments y first, then uses it
//        System.out.println("x++ + x++ :"+ (x++ + x++)); //here we are using x first ie 6(incremented due to above x++) and then using incremented x ie 7(but it is going to get incremented to 7) ie res = 11
//        System.out.println("--y - --x :"+ (--y - (--x)));// 6-1, 7-1 ie 5-6=-1
    }
}
