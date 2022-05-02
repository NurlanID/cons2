import java.util.Scanner;

public class schetchik {
    public static void main(String[] args) {
        System.out.println("Введите предыдущее значение электросчетчика:");
        int a;
        int b;
        int c;
        float d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Введите  текущее значение электросчетчика:");
        b = sc.nextInt();
        c = b - a;
        d = (float) (1.5 * c);
        double tarif = 1.5;
        System.out.println("Вы потребили: " + c);
        System.out.println("Тариф: 1,5 сом");
        System.out.println("К оплате: " + d);
    }
}

