package org.itstep.qa.lesson;
import java.util.Scanner;
import java.util.Random;
public class ZadachaFive {
    public static void main(String[] args) {
        //Найти максимальный и минимальный элементы ТРЕХ-мерного массива (заполнен случайными числами)
        //максимум и минимум не нашла
        int[][][] array = new int[3][3][3];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] = r.nextInt(100);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] = r.nextInt(200);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
