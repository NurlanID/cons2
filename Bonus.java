import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] a = new String[]{"right", "right", "left", "left", "top", "top", "left", "down", "down"};
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("right")) {
                x++;
            } else if (a[i].equals("left")) {
                x--;
            } else if (a[i].equals("top")) {
                y++;
            } else if (a[i].equals("down")) {
                y--;
            } else z++;
        }
        System.out.println("по оси x вы отошли на " + Math.abs(x) + " метров/а. \nпо оси y вы отошли на " + Math.abs(y) + " метров/а. \nвы ошиблись " + z + " раз(а). \nваш путь по прямой " + Math.sqrt(x * x + y * y));
    }
}
//switch (a[i]) {
//        case "right":
//        x++;
//        break;
//        case "left":
//        x--;
//        break;
//        case "top":
//        y++;
//        break;
//        case "down":
//        y--;
//        break;
//default:
//        itog++;
//        }
//        }
//        System.out.println("по оси x вы отошли на " + Math.abs(x) + " метров/а." );
//        System.out.println("по оси y вы отошли на " + Math.abs(y) + " метров/а." );
//        System.out.println("Error " + itog + " раз(а). ");
//        System.out.println("ваш путь по прямой " + Math.sqrt(x * x + y * y));
//        }
//        }