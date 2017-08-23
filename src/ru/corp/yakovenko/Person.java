package ru.corp.yakovenko;

/**
 * Created by Yakovenko on 23.08.2017.
 */
public abstract class Person {
    private Gender gender;
    private FullName fullName;
    private String profession;
    private String maritalStatus;


    public abstract void changeMaritalStatus();

    public Gender getGender() {
        return gender;
    }

    public String getGenderAsString() {
        return getGender().getGender();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
