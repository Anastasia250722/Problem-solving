package org.example.class5.problems;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <h2>Задача 6: «Факториал»</h2>
 * <p>Напишите функцию factorial(n), возвращающую факториал неотрицательного
 * целого числа. Факториал — это произведение всех натуральных чисел
 * от 1 до n включительно. Факториал 0 равен 1.</p>
 */
public class FFactorial {

    /**
     * Предлагаю реализовать рекурсивное решение из "Грокаем Алгоритмы"
     */
    public static int factorial(int n) {
        return 0;
    }

    @Test
    public void test() {
        assertEquals(1, factorial(0));
        assertEquals(1, factorial(1));
        assertEquals(2, factorial(2));
        assertEquals(6, factorial(3));
        assertEquals(720, factorial(6));
        assertEquals(362880, factorial(9));
    }
}
