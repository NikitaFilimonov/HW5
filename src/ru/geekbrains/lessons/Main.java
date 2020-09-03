package ru.geekbrains.lessons;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov I.I.", "Director", "ivanov@example.pro", 123456789, 100000, 47);
        employees[1] = new Employee("Petrov P.P", "Accountant", "petrov@example.pro", 223456789, 90000, 32);
        employees[2] = new Employee("Sidorov E.E.", "Salesman", "sidorov@example.pro", 323456789, 80000, 41);
        employees[3] = new Employee("Aleshin A.A.", "IT specialist", "aleshin@example.pro", 423456789, 80000, 25);
        employees[4] = new Employee("Stepashin S.S.", "Specialist", "stepashin@example.pro", 523456789, 70000, 53);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                employees[i].info();
            }

        }

    }



}

