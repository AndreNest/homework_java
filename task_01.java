// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        System.out.printf("Треугольное число от %d = %d\n", n, lib.sq_num(n));
        System.out.printf("Факториал числа от %d = %d\n", n, lib.fact(n));
        iScanner.close();
    }
}
