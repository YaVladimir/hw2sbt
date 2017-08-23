package ru.corp.yakovenko;

/**
 * Created by Yakovenko on 23.08.2017.
 */
public interface Profession {
    String[] profession = new String[]{"Автослесарь",
            "Дизайнер",
            "Программист",
            "Учитель"};

    void setRandomProfession(Person person);
}
