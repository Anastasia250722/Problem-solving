package org.example.class5.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * /*
 * <h2>Задача 7: «Простое число»</h2>
 * <p>Напишите функцию isPrime(n) для проверки, простое число n или нет.
 * Напомним, что число называют простым, если оно больше 1 и делится
 * без остатка только на 1 и на само себя.</p>
 * <p>На вход функция должна принимать число n и возвращать true,
 * если n простое, и false — если нет.</p>
 */
public class GSimpleNumber {

    /**
     * Предлагаю реализовать решение из Яндекс.диска
     *
     */
    public static boolean isPrime(int n) {

        return false;
    }

    @Test
    public void test() {
        assertFalse(isPrime(0));
        assertFalse(isPrime(1));
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertFalse(isPrime(6));
        assertTrue(isPrime(17));
        assertTrue(isPrime(997));
        assertFalse(isPrime(998));
    }
}
