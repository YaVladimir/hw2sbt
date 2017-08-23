package ru.corp.yakovenko;

/**
 * Created by Yakovenko on 23.08.2017.
 */
public class FullName {
    private String firstName;
    private String lastName;
    private String surName;

    public FullName(String firstName, String lastName, String surName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
