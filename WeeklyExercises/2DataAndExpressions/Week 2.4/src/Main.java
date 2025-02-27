import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int side;
        int perimeter;
        int area;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        side = sc.nextInt();
        perimeter = side * 4;
        area = side * side;
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

    }
}