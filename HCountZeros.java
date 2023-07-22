package org.example.class5.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <h2>Задача 8: «Посчитать количество нулей»</h2>
 * <p>Напишите функцию countZeros(n), принимающую на вход целое неотрицательное
 * число n. Возвращать функция должна количество нулей, содержащихся в аргументе.</p>
 */
public class HCountZeros {


    public static int countZeros(int n) {
        int count = 0;
        for (int i = 10; i <= n; i +=10) {
            count +=calcZerosInNum(i);
        }
        return count;
    }

    private static int calcZerosInNum(int n) {
        int count = 0;
        while (n>=10) {
            n = n / 10;
            count++;
        }
        return count;
    }




    @Test
    void test() {
        assertEquals(2, countZeros(20));
        assertEquals(11, countZeros(100));
        assertEquals(0, countZeros(9));
        assertEquals(1, countZeros(10));
        assertEquals(59, countZeros(342));
    }
}
