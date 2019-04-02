package ru.job4j.condition;

/**
 * @author Askar Omorbekov (omorbekov.a@yandex.ru)
 * @version 01.04.2019
 * @since 0.6
 */
public class DummyBot {
    /**
     * Ответы бота на вопросы от пользователя.
     * @param question Вопрос от пользователя.
     * @return Ответ бота.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
