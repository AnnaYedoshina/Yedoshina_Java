import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int num = scanner.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
    }
}
