package pl.kurs;

import lombok.ToString;

@ToString(callSuper = true)

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, String surname, double sal, String pesel, double bonus) {
        super(name, surname, sal, pesel);
        this.bonus = bonus;
    }
}
