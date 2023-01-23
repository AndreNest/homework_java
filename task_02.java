// Вывести все простые числа от 1 до 1000
import java.util.Scanner;
public class task_02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        for (int i = 1; i < n; i++) {
            if(lib.nat_num(i) > 0){
                System.out.printf("%d ", i);
            }
        }
    } 
}
