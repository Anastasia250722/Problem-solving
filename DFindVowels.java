package org.example.class5.problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <h2>Задача 4: «Найти гласные»</h2>
 * <p>Напишите функцию findVowels(str), принимающую на вход кириллическую
 * строку str  и возвращающую количество гласных, содержащихся в этой строке.
 * Для вашего удобства вот массив кириллических гласных:</p>
 * <p>['а', 'я', 'о', 'ё', 'у', 'ю', 'ы', 'и', 'э', 'е'].</p>
 */
public class DFindVowels {


    /**
     * В решении может помочь метод contains
     */
    int findVowels(String str) {
        List<String> vowelsList = List.of("а", "я", "о", "ё", "у", "ю", "ы", "и", "э", "е");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowelsList.contains(String.valueOf(str.charAt(i)).toLowerCase()))  count += 1;
        }
        return count;
    }

    @Test
    void test() {
        assertEquals(2, findVowels("здравствуй"));
        assertEquals(2, findVowels("здрАвстВуй"));
        assertEquals(2, findVowels("привет"));
        assertEquals(3, findVowels("хеллоу"));
        assertEquals(0, findVowels("123"));
        assertEquals(0, findVowels(" "));
        assertEquals(0, findVowels(""));
    }
}
