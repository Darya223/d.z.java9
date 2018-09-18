package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaThree {
    public static void main(String[] args) {
        //Пользователь вводит с клавиатуры название валюты, программа выводит на экран текущий курс (курс можно просто нафантазировать)
        Scanner inn = new Scanner(System.in);
        System.out.println("введите название валюты");
        String str = inn.nextLine();
        switch (str) {
            case "доллар США": {
                System.out.println("текущий курс 1.5 рубля");
                break;
            }
            case "евро": {
                System.out.println("текущий курс 2.0 рубля");
                break;
            }
            case "рубль РФ": {
                System.out.println("тукнщий курс 3.0 рубля");
                break;
            }
            default: {
                System.out.println("валюта введена неверно");
            }
        }
    }
}
