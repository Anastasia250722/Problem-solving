package org.example.class5.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <h2>Задача 3: «Развернуть слова в предложении»</h2>
 * <p>
 * Напишите функцию reverseWords(str), принимающую на вход строку.
 * Функция должна вернуть новую строку, расставив слова в обратном
 * порядке.Если в строке есть знаки препинания, их можно удалить
 * или оставить — на ваше усмотрение.</p>
 * <p>
 */
public class CReverseWords {

    /**
     * <h3>Алгоритм решения:</h3>
     * <ol>
     *     <Li>Перевести строку в массив</Li>
     *     <Li>Создать пустой массив</Li>
     *     <Li>Проитерироваться по массиву с конца и добавлять элементы в пустой массив</Li>
     *     <Li>Преобразовать созданный массив к строке</Li>
     * </ol>
     * <p>Подсказка в методах <b>splitStringToArray</b> и <b>arrayToString</b></p>
     */
    public static String reverseWords(String str) {
        String[] strArray = str.split("");

        for (int i = str.length() - 1; i >= 0; i--) {

            strArray[i] = String.valueOf(i);

            str = String.join("", strArray);
            //System.out.println(str);
        }
        return str;
    }

    @Test
    void test() {
        assertEquals(reverseWords("всегда много путей достичь цель есть"), "есть цель достичь путей много всегда");
        assertEquals(reverseWords("испробовать их все должны вы"), "вы должны все их испробовать");
    }
}
