package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaSeven {
    public static void main(String[] args) {
        //Пользователь вводит строку текста. После этого вводит контрольное слово.
        // Программа выводит результат - содержится контрольное слово в строке или нет.
        Scanner inn = new Scanner(System.in);
        System.out.println("Введите строку текста: ");
        String s1 = inn.nextLine();
        System.out.println("Введите контрольное слово: ");
        String s2 = inn.next();
        if (s1.contains(s2)) {
        System.out.println("контрольное слово содержится в строке");
        }
        else {
        System.out.println("контрольное слово не содержится в строке ");
        }
    }
}