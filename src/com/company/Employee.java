package com.company;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Employee {
    public int id;
    public static int countId = 0;
    public String name;
    public String phone;
    public LocalDate birthDate;
    public double salary;

    public Employee(String name, String phone, double salary) {
        countId++;
        this.id = countId;
        this.name = name;
        this.phone = phone;
        this.birthDate =java.time.LocalDate.now();
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }
}
