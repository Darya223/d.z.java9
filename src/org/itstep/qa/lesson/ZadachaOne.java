package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaOne {
    public static void main(String[] args) {
        //Ввести длину ребра куба с клавиатуры. Вывести объем куба и площадь его боковой поверхности.
        Scanner inn = new Scanner(System.in);
        int l = inn.nextInt();
        int v = (l * l * l);
        System.out.println(v + "объём куба");
        int s = 4 * (l * l);
        System.out.println(s + "площадь боковой поверхности куба");
    }
}
