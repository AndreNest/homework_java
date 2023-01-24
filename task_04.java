// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;
public class task_04 {
    public static void main(String[] args){
        System.out.printf("Уравнение: 2x + b5 = 69 \n");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j < 100; j+=10) {
                if(((20 + i)+(j + 5)) == 69){
                    System.out.printf("Ответ:  %d + %d = 69\n", (20+ i), (j + 5));
                    count+=1;
                }
                
            }
            
        }
        if (count == 0){
            System.out.println("Решения нет.");
        }

    }
}
