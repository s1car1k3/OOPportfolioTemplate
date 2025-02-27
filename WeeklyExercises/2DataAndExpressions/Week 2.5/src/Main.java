import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int numerator;
        int denominator;
        double decimal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numerator: ");

        numerator = sc.nextInt();
        System.out.println("Enter the denominator");
        denominator = sc.nextInt();

        decimal = (double) numerator /denominator;
        System.out.println("The decimal number is: " + decimal);
    }
}