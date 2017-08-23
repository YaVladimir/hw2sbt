package ru.corp.yakovenko;

/**
 * Created by Yakovenko on 23.08.2017.
 */
public class Gender {
    private boolean gender;

    Gender(String gender) {
        this.gender = gender.equals("male");
    }

    public String getGender() {
        return gender ? "male" : "female";
    }

    public void setGender(String gender) {
        this.gender = gender.equals("male");
    }
}
