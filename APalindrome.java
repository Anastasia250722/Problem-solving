package org.example.class5.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <h2>Задача 1: «Палиндром»</h2>
 * <p>Палиндром — это слово, предложение или последовательность символов,
 * которая читается слева направо так же, как и справа налево. Например,
 * «топот» и «Анна» — палиндромы, а «привет» и «Витя» — нет.</p>
 * <p>Напишите функцию palindrome(str), принимающую как аргумент строку.
 * Функция должна вернуть true, если строка — палиндром, и false, если нет.</p>
 * <p>Считайте, что на вход всегда передаётся слово: то есть знаков препинания
 * и пробелов в аргументе быть не может.</p>
 */
public class APalindrome {

    /**
     * <h3>Алгоритм решения:</h3>
     * <ol>
     *     <Li>Создать пустую строку</Li>
     *     <Li>Проитерироваться по исходной строке от последнего символа к первому</Li>
     *     <Li>На каждой итерации увеличивать строку на текущией символ</Li>
     *     <Li>После того, как проитерировась по всей строке сравнить исходную строку и ту, что получилась</Li>
     * </ol>
     * <p>Подсказка в методах <b>stringIterateExample</b> и <b>concatenateString</b></p>
     */

    public static void main(String[] args) {
    }

    private boolean iaPalindrome(String str) {
        int i1 = 0;
        int i2 = str.length() - 1;
        str = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i1) != str.charAt(i2)) ;
            {
                return false;
            }

        }
        return true;
    }

    @Test
    public void test() {
        assertTrue(iaPalindrome("топот"));
        assertTrue(iaPalindrome("Saippuakivikauppias"));
        assertFalse(iaPalindrome("привет"));
        assertTrue(iaPalindrome("тоПоТ"));
        assertTrue(iaPalindrome(""));
        assertFalse(iaPalindrome("фунКция"));
    }
}
