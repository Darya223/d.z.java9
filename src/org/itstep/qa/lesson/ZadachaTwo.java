package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaTwo {
    public static void main(String[] args) {
        //Составить программу, которая проверяет знание таблицы умножения и сообщает пользователю результат (верно или нет).
        Scanner inn = new Scanner(System.in);
        int a = inn.nextInt();
        int b = inn.nextInt();
        System.out.println("Проверка знаний ТАБЛИЦЫ УМНОЖЕНИЯ");
        System.out.println("Решите пример:");
        System.out.print(a+" * "+b+" = ");
        int c = inn.nextInt();
        if (c == a*b) System.out.println("Верно!");
        else System.out.println("Неверно!");
    }
}
