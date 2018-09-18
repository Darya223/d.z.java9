package org.itstep.qa.lesson;
import java.util.Arrays;
import java.util.Random;
public class ZadachaNine {
    public static void main(String[] args) {
        //!!!без индексов и соседей!!!
        //Имеется двумерный массив, заполненный случайными значениями. Найти максимальный элемент этого массива.
        // Вывести значение элемента, его индексы, а также значения его соседей в обоих  измерениях
        //Пример.
        //Массив:
        //1   2   4
        //7   9   8
        //4   5   6
        //Вывод на экран должен быть вида:
        //Максимальный элемент 9
        //Индексы: i = 1; j = 1
        //Значения соседей: 2, 7, 8, 5
        int[][] array = new int[3][3];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.print(max + "максимальный элемент массива ");
        }
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[indexOfMax].length) {
                    indexOfMax = i;
                }
            }
            System.out.println(indexOfMax + "индексы");
        }
    }
}



