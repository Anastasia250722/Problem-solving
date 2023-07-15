package org.example.class5.problems;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

/**
 * <h2>Задача 2: «FizzBuzz»</h2>
 * <p>Напишите функцию fizzBuzz(n), принимающую как аргумент натуральное число.
 * Функция должна выводить в консоль числа от 1 до n, заменяя числа:</p>
 * <ul>
 *     <li>кратные трём — на fizz;</li>
 *     <li>кратные пяти — на buzz;</li>
 *     <li>кратные и трём, и пяти одновременно — на fizzbuzz.;</li>
 * </ul>
 */
@Log
public class BFizzBuzz {
    /**
     * <p>Для вывода в консоль используй не System.out.println(), а log.info()</p>
     */
    public void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                log.info("fizzbuzz");
            }
            else if (i % 3 == 0) {
                log.info("fizz");
            }
            else if (i % 5 == 0) {
                log.info("buzz");
            }
        }

    }

    /**
     * Не смог придумать тесты поэтому просто надо вручную просмотреть, что будет выведено в консоль
     */
    @Test
    public void test() {
        log.info("n = 0");
        fizzBuzz(0);

        log.info("n = 1");
        fizzBuzz(1);

        log.info("n = 15");
        fizzBuzz(15);

        log.info("n = 100");
        fizzBuzz(100);
    }
}
