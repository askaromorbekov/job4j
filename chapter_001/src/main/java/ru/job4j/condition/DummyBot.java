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
        String rsl = "До скорой встречи.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Сколько будет 2 + 2?".equals(question)) {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;
    }
}
