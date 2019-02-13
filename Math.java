package Assignment1;
import java.util.Scanner;
public class Math {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = keyboard.nextInt();
        System.out.println("Enter another integer");
        int b = keyboard.nextInt();
        int sum = a + b;
        int product = a*b;
        int difference = java.lang.Math.abs(a-b);
        int quotient = a/b;
        System.out.println("The sum of the two integers is: " + sum);
        System.out.println("The product of the two integers is: " + product);
        System.out.println("The difference between the two integers is: " + difference);
        System.out.println("The quotient from the first integer divided by the second is: " + quotient);
    }
}
