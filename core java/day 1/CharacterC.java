import java.util.Scanner;
public class CharacterC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letter = 'A';
        char letter2 = (char)(letter + 1); //arithmetic increment of char variables
        System.out.println("Letter2 should be incremented from "+ letter +" to "+ letter2);
        int ascii = 98;
        char lett = (char)ascii;
        System.out.println("Ascii value for " + ascii +" is: " +lett);
    }
}
