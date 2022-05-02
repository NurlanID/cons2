import java.util.Scanner;

public class age120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ваш возраст до 120 лет: ");

            int a = input.nextInt();
            if (a < 1 || a > 120) {
                System.out.println("попробуйте ещё раз");
            } else if ((a >= 5 && a <= 20) || (a % 100 >= 5 && a % 100 <= 20)) {
                System.out.println(a + "Лет");
            } else if ((a % 10 > 1 && a % 10 <= 4) || (a % 100 > 1 && a % 100 <= 4)) {
                System.out.println(a + "года");
            } else if (a == 1 || a % 100 == 1 || a%10==1) {
                System.out.println(a + "год");
            }
            else {
                System.out.println(a + "лет");
            }

        }
    }
}
