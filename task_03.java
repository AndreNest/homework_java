// Реализовать простой калькулятор
import java.util.Scanner;
import java.math.*;;
public class task_03 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag == true){
            Scanner iScanner = new Scanner(System.in);
            System.out.println(" 1 - Сложение двух чисел \n 2 - Умножение двух чисел? \n 3 - Возведение числа во вторую степень?\n 4 - факториал числа\n 5 - завершить работу");
            System.out.printf("Какое действие выполним? ");
            int n = iScanner.nextInt();
            switch (n) {
                case 1:
                    System.out.printf("Введите первое число: ");
                    int a_sum = iScanner.nextInt();
                    System.out.printf("Введите второе число: ");
                    int b_sum = iScanner.nextInt(); 
                    System.out.printf("%d + %d = %d \n", a_sum, b_sum, lib.sum(a_sum, b_sum));
                    break;
                case 2:
                    System.out.printf("Введите первое число: ");
                    int a_mult = iScanner.nextInt();
                    System.out.printf("Введите второе число: ");
                    int b_mult = iScanner.nextInt(); 
                    System.out.printf("%d * %d = %d \n", a_mult, b_mult, lib.mult(a_mult, b_mult));
                    break;
                case 3:
                    System.out.printf("Введите число: ");
                    int a_mult_x2 = iScanner.nextInt();
                    System.out.printf("Число %d во второй степени равно =  %d\n", a_mult_x2, (int)Math.pow(a_mult_x2, 2));
                    break;
                case 4:
                    System.out.printf("Введите число: ");
                    int fact = iScanner.nextInt();
                    System.out.printf("Факториал числа %d =  %d\n",fact, lib.fact(fact) );
                    break;

                case 5:
                    System.out.println("Канкулятор отключен!");
                    flag = false;
                    break;

                    
            }

        }
    }
}
