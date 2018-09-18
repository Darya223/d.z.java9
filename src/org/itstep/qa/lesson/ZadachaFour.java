package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaFour {
    public static void main(String[] args) {
        //Пользователь вводит целое трёхзначное число. Найти сумму цифр этого числа.
        Scanner inn = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число: ");
        String a = inn.next();
        int b = Integer.parseInt(a);  //перевод строки в число
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum = sum + b%10;
            b = b/10;
        }
        System.out.println("Сумма равна " + sum);
    }
}
