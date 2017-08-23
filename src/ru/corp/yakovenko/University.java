package ru.corp.yakovenko;

/**
 * Created by Yakovenko on 23.08.2017.
 */
public class University implements Profession {
    private String universityName;

    public University(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void setRandomProfession(Person person) {
        if (person.getGenderAsString().equals("male"))
            person.setProfession(Profession.profession[(int) (Math.random() * 4)]);
    }

    public static void education(Person person) {
        University university = new University("ЮФУ");
        university.setRandomProfession(person);
    }
}
