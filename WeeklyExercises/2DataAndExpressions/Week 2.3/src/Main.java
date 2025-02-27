import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double miles;
        double kilometers;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter miles: ");
        miles = sc.nextDouble();
        kilometers = miles * 1.60935;
        System.out.println("Kilometers: " + kilometers);
    }
}