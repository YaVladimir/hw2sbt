package ru.corp.yakovenko;

/**
 * Created by Yakovenko on 23.08.2017.
 */
public class Man extends Person {
    private String wife;

    public Man(String wife) {
        this.wife = wife;
        University.education(this);
    }

    @Override
    public void changeMaritalStatus() {
        setMaritalStatus("Married on " + getWife());
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

}
