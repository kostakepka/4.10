import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("введите радиус круга ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.print("введите сторону квадрата ");
        Scanner sc1 = new Scanner(System.in);
        int s = sc1.nextInt();

        if (Math.pow(r * 3.14, 2) < Math.pow(s, 2)) {
            System.out.println("Площадь квадрата больше");
        }
        if (Math.pow(r * 3.14, 2) > Math.pow(s, 2)) {
            System.out.println("Площадь круга больше");
        }
        if (Math.pow(r * 3.14, 2) == Math.pow(s, 2)) {
            System.out.println("Площади ровны");
        }

    }
}
